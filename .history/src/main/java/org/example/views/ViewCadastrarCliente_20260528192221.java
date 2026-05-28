package org.example.views;

import java.time.LocalDateTime;

public class ViewCadastrarCliente extends Main 
{
    public static void cadastrarCliente()
    {
        String nome, cpf_cnpj, endereco, cidade, estado;
        LocalDateTime created_at;

        System.out.println("====================================");
        System.out.println("         CADASTRAR CLIENTES         ");
        System.out.println("====================================");

        System.out.println("Digite as informações do novo cliente:");

        System.out.println("NOME: ");
        nome = SC.nextLine();

        System.out.println("CPF/CNPJ: ");
        
        System.out.println("ENDEREÇO: ");
        System.out.println("CIDADE: ");
        System.out.println("ESTADO: ");


    }
}