package org.example.DAO;

import java.sql.SQLException;

import org.example.model.Motorista;

public class MotoristaDao 
{
    public static void cadastrarMotorista(Motorista motorista) throws SQLException
    {
        String sql = "INSERT INTO Motorista (nome, cnh, endereco, veiculo, cidade_base, created_at) VALUES (?,?)"
    }
}
