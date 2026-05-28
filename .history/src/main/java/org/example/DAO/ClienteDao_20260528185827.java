package org.example.DAO;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Cliente;

public class ClienteDao 
{
    public static void cadastrarCliente(Cliente cliente) throws SQLException
    {
        //Funcionalidade 1
        String sql = "INSERT INTO Cliente (nome, cpf_cnpj, endereco, cidade, estado, created_at) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = ConnectionFactory.Conexao();
        PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf_cnpj());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getEstado());
            stmt.setTimestamp(6, 
                Timestamp.valueOf(cliente.getCreated_at()));
            

            stmt.executeUpdate();

            System.out.println("Cliente criado com sucesso!");
        }
    }

    public static void excluirCliente(int id) throws SQLException
    {
        //Funcionalidade 15
    }
}
