package org.example.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Pedido;

public class PedidoDao 
{
    public static void GerarPedido(Pedido pedido) throws SQLException
    {
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

            stmt.exe
        }
    }
}
