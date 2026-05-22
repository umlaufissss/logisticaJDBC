package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Entrega;

public class EntregaDao 
{
    public static void AtribuirPedidoAMotorista(Entrega entrega)
    {
        String sql = "INSERT INTO Entrega (pedido_id, motorista_id, data_saida, data_entrega, status) VALUES (?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement)
    }
}
