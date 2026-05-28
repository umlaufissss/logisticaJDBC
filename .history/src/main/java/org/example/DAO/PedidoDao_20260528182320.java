package org.example.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.enummerations.enumPedidos;
import org.example.model.Cliente;
import org.example.model.Pedido;

public class PedidoDao 
{
    public static void gerarPedido(Pedido pedido) throws SQLException
    {
        //Funcionalidade 3
        String sql = "INSERT INTO Pedido (cliente_id, data_pedido, volume_m3, peso_kg, valor_frete, status) VALUES (?,?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setInt(1, pedido.getCliente().getId());
            stmt.setDate(2, Date.valueOf(pedido.getData_pedido()));
            stmt.setDouble(3, pedido.getVolume_m3());
            stmt.setDouble(4, pedido.getPeso_kg());
            stmt.setDouble(5, pedido.getValor_frete());
            stmt.setString(6, pedido.getStatus().name());

            stmt.executeUpdate();

            System.out.println("Pedido criado com sucesso!");
        }
    }

    public static HashMap<Pedido, String> pendentesPEstado() throws SQLException
    {
        //Funcionalidade 10
        String sql = """
                SELECT p.id, p.cliente_id, c.estado, p.status
                FROM Pedido p 
                JOIN Cliente c ON p.cliente_id = c.id
                WHERE p.status = "PENDENTE"
                order by c.estado ASC;
                """;

        HashMap<Pedido, String> relatorio = new HashMap<>();

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) 
            {
                int id = rs.getInt("id");

                int cliente_id = rs.getInt("cliente_id");
                String estado = rs.getString("estado");
                var cliente = new Cliente(cliente_id, null, null, null, null, estado, null);

                String statusValue = rs.getString("status");
                enumPedidos statusEnum = enumPedidos.valueOf(statusValue);

                var pedido = new Pedido(id, cliente, null, 0.0, 0.0, 0.0, statusEnum);

                relatorio.put(pedido, estado);
            }
        }

        return relatorio;
    }

    public static List<Pedido> buscarPorCliente() throws SQLException
    {
        String sql = """
                SELECT p.id, p.cliente_id, p.data_pedido, p.volume_m3, p.peso_kg, p.valor_frete, p.status
                FROM Pedido p
                JOIN Cliente c ON p.cliente_id = c.id
                WHERE cpf_cnpj =  ?
                """;

        List<Pedido> pedidos = new ArrayList<>();

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) 
            {
                int id = rs.getInt("id");

                int cliente_id = rs.getInt("cliente_id");
                var cliente = new Cliente(cliente_id, sql, sql, sql, sql, sql, null);

                LocalDate data_pedido = rs.getDate("data_pedido").toLocalDate();

                double volume_m3 = rs.getDouble("volume_m3");
                double peso_kg = rs.getDouble("peso_kg");
                double valor_frete = rs.getDouble("valor_frete");
                enumPedidos statusPedido = enumPedidos.valueOf(rs.getString("status"));

                var pedido = new Pedido(id, cliente, data_pedido, volume_m3, peso_kg, valor_frete, statusPedido);
                pedidos.add(pedido);
            }
        }

        return pedidos;
    }

    public static void cancelarPedido(Pedido pedido)
    {
        String sql = "UPDATE "
    }
}
