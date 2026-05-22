package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Motorista;

public class MotoristaDao 
{
    public static void cadastrarMotorista(Motorista motorista) throws SQLException
    {
        String sql = "INSERT INTO Motorista (nome, cnh, endereco, veiculo, cidade_base, created_at) VALUES (?,?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            st
        }
    }
}
