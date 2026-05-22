package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Cliente;

public class ClienteDao 
{
    public static void cadastrarCliente(Cliente cliente) throws SQLException
    {
        String sql = "INSERT INTO Cliente (nome, cpf_cnpj, endereco, cidade, estado, created_at) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.set
        }
    }
}
