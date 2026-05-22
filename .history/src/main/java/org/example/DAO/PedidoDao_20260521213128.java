package org.example.DAO;

import java.sql.Connection;

import org.example.ConnectionFactory.ConnectionFactory;
import org.example.model.Pedido;

public class PedidoDao 
{
    public static void GerarPedido(Pedido pedido)
    {
        String sql = "INSERT INTO Pedido (cliente_id, data_pedido, volume_m3, peso_kg, valor_frete, status) VALUES (?,?,?,?,?,?)";

        try(Connection conn = ConnectionFactory.Conexao();
    )
    }
}
