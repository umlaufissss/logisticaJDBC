package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Entrega;

public class EntregaDao 
{
    public static void AtribuirPedidoAMotorista(Entrega entrega) throws SQLException
    {
        String sql = "INSERT INTO Entrega (pedido_id, motorista_id, data_saida, data_entrega, status) VALUES (?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setInt(1, entrega.getPedido());
        }
    }
}
