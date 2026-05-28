package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Entrega;

public class EntregaDao 
{
    public static void AtribuirPedidoAMotorista(Entrega entrega) throws SQLException
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

    public static void AtualizarStatusEntrega(Entrega entrega, String NovoStatus)
    {
        //Funcionalidade 6

        String sql = "UPDATE Entrega SET status = ? WHERE id = ?";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, NovoStatus);
            stmt.setInt(2, entrega.);
        }
    }
}
