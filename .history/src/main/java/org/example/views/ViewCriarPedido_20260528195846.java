package org.example.views;

import java.time.LocalDate;

public class ViewCriarPedido extends Main
{
    public static void criarPedido()
    {
        String nome_cliente, cpf_cnpj_cliente;
        LocalDate data_pedido;
        double volume_m3, peso_kg, valor_frete;

        System.out.println("====================================");
        System.out.println("            CRIAR PEDIDO            ");
        System.out.println("====================================");

        System.out.println("Digite as informações do novo pedido:");

        System.out.println("NOME DO CLIENTE: ");
        nome = SC.nextLine();

        System.out.println("CPF/CNPJ: ");
        cpf_cnpj = SC.nextLine();

        System.out.println("ENDEREÇO: ");
        endereco = SC.nextLine();

        System.out.println("CIDADE: ");
        cidade = SC.nextLine();

        System.out.println("ESTADO: ");
        estado = SC.nextLine();
    }
}
