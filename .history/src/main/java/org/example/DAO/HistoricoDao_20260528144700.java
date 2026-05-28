package org.example.DAO;

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
        
        try
    }
}
