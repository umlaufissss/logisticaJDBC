package org.example.DAO;

import org.example.model.Cliente;

public class ClienteDao 
{
    public static void cadastrarCliente(Cliente cliente)
    {
        String sql = "INSERT INTO Cliente (nome, cpf_cnpj, endereco, cidade, estado, created_at) VALUES (?, ?, ?, ?, ?, ?)";

        try
        {

        }
    }
}
