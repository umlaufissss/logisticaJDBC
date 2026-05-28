package org.example.DAO;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Motorista;

public class MotoristaDao 
{
    public static void cadastrarMotorista(Motorista motorista) throws SQLException
    {
        //Quest
        String sql = "INSERT INTO Motorista (nome, cnh, endereco, veiculo, cidade_base, created_at) VALUES (?,?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getCnh());
            stmt.setString(3, motorista.getEndereco());
            stmt.setString(4, motorista.getVeiculo());
            stmt.setString(5, motorista.getCidade_base());
            stmt.setTimestamp(6, Timestamp.valueOf(motorista.getCreated_at()));
    

            stmt.executeUpdate();

            System.out.println("Motorista criado com sucesso!");
        }
    }
}
