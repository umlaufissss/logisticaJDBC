package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Cliente;
import org.example.model.Entrega;
import org.example.model.Motorista;
import org.example.model.Pedido;

public class EntregaDao 
{
    public static void atribuirPedidoAMotorista(Entrega entrega) throws SQLException
    {
        //Funcionalidade 4
        String sql = "INSERT INTO Entrega (pedido_id, motorista_id, data_saida, data_entrega, status) VALUES (?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setInt(1, entrega.getPedido().getId());
            stmt.setInt(2, entrega.getMotorista().getId());
            stmt.setDate(3, Date.valueOf(entrega.getData_saida()));
            stmt.setDate(4, Date.valueOf(entrega.getData_entrada()));
            stmt.setString(5, entrega.getStatus().name());

            stmt.executeUpdate();

            System.out.println("Entrega cadastrada com sucesso!");
        }
    }

    public static void atualizarStatusEntrega(Entrega entrega, String NovoStatus) throws SQLException
    {
        //Funcionalidade 6

        String sql = "UPDATE Entrega SET status = ? WHERE id = ?";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, NovoStatus);
            stmt.setInt(2, entrega.getId());

            stmt.executeQuery();

            System.out.println("Status da Entrega alterado com sucesso");
        }
    }

    public static List<Entrega> listarTudo () throws SQLException
    {
        //Funcionalidade 7

        String sql = """
                SELECT e.id, e.motorista_id, p.id AS pedido_id, p.cliente_id, e.data_saida, e.data_entrada
                FROM Entrega e
                JOIN Pedido p ON e.pedido_id = p.id
                GROUP BY e.id;
                """;

        List<Entrega> entregas = new ArrayList<>();

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt("id");

                int motorista_id = rs.getInt("motorista_id");
                var motorista = new Motorista(motorista_id, null, null, null, null, null, null);

                int cliente_id = rs.getInt("cliente_id");
                var cliente = new Cliente(cliente_id, sql, sql, sql, sql, sql, null);

                int pedido_id = rs.getInt("pedido_id");
                var pedido = new Pedido(pedido_id, cliente, null, id, motorista_id, pedido_id, null);


                LocalDate data_saida = rs.getDate("data_saida").toLocalDate();
                LocalDate data_entrada = rs.getDate("data_entrada").toLocalDate();

                var entrega = new Entrega(cliente_id, pedido, motorista, data_saida, data_entrada, null);
                entregas.add(entrega);
            }
            
        }
        return entregas;
    }

    public static HashMap<Entrega, Integer> totalEntregaMotorista() throws SQLException
    {
        String sql = """
                SELECT id, motorista_id, COUNT(motorista_id) as total 
                FROM Entrega 
                GROUP BY motorista_id;
                """;
        
        HashMap<Entrega, Integer> relatorio = new HashMap<>();

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) 
            {
                int id = rs.getInt("id");

                int motorista_id = rs.getInt("motorista_id");
                var motorista = new Motorista(motorista_id, null, null, null, null, null, null);

                int totalEntrega = rs.getInt("total");

                var entrega = new Entrega(id, null, motorista, null, null, null);
                relatorio.put(entrega, totalEntrega);
            };
        }

        return relatorio;
    }

    public static HashMap<Entrega, Double> clienteMaiorVolumeEntregue() throws SQLException
    {
        //Funcionalidade 9
        String sql = """
                SELECT e.id, e.pedido_id, p.cliente_id, SUM(p.volume_m3) as volume
                FROM Entrega e
                JOIN Pedido p ON e.pedido_id = p.id
                WHERE e.status = "ENTREGUE"
                ORDER BY id, cliente_id DESC;
                """;

        HashMap<Entrega, Double> relatorio = new HashMap<>();

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) 
            {
                int id = rs.getInt("id");

                int cliente_id = rs.getInt("cliente_id");
                var cliente = new Cliente(cliente_id, sql, sql, sql, sql, sql, null);

                int pedido_id = rs.getInt("pedido_id");
                var pedido = new Pedido(pedido_id, cliente, null, 0.0, 0.0, 0., null);

                double volume = rs.getDouble("volume");

                var entrega = new Entrega(id, pedido, null, null, null, null);

                relatorio.put(entrega, volume);
            }
        }

        return relatorio;
    }

    public static HashMap<Entrega, String> atrasoPorCidade() throws SQLException
    {
        //Funcionalidade 11
        String sql = """
                SELECT e.id, e.pedido_id, p.cliente_id, c.cidade
                FROM Entrega e
                JOIN Pedido p ON e.pedido_id = p.id
                JOIN Cliente c ON p.cliente_id = c.id
                WHERE p.status = "ATRASADA"
                order by c.cidade ASC;
                """;

        HashMap<Entrega, String> relatorio = new HashMap<>();
        
        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) 
            {
                int id = rs.getInt("id");

                int cliente_id = rs.getInt("cliente_id");
                String cidade = rs.getString("cidade");
                var cliente = new Cliente(cliente_id, null, null, null, cidade, null, null);

                int pedido_id = rs.getInt("pedido_id");
                var pedido = new Pedido(pedido_id, cliente, null, 0.0, 0.0, 0.0, null);
            
                var entrega = new Entrega(pedido_id, pedido, null, null, null, null);

                relatorio.put(entrega, cidade);
            }
        }

        return relatorio;
    }

    public static void excluirEntrega(int id)
    {
        String sql = """
        SELECT id, pedido_id, motorista_id, data_saida, data_entrada 
        FROM Entrega 
        WHERE id = ?"""
                
            ;
    }
}
