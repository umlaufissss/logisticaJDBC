package org.example.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.HistoricoEntrega;

public class HistoricoDao 
{
    public static void RegistrarEventoDeEntrega(HistoricoEntrega hEntrega)
    {
        //Funcionalidade 5
        String sql = """
        INSERT INTO HistoricoEntrega (entrega_id, data_evento, descricao) 
        VALUES (?,?,?)          
                """;
        
        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setInt(1, hEntrega.getEntrega().getId());
            stmt.Date(2, Date.valueOf(hEntrega.getData_evento()));
            stmt.setString(3, hEntrega.getDescricao());
        }
    }
}
