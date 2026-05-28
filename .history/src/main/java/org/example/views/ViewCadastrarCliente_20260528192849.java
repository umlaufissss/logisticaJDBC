package org.example.views;

import java.time.LocalDateTime;

import org.example.model.Cliente;

public class ViewCadastrarCliente extends Main 
{
    public static void cadastrarCliente()
    {
        String nome, cpf_cnpj, endereco, cidade, estado;
        LocalDateTime created_at;

        int opcao;

        System.out.println("====================================");
        System.out.println("         CADASTRAR CLIENTES         ");
        System.out.println("====================================");

        System.out.println("Digite as informações do novo cliente:");

        System.out.println("NOME: ");
        nome = SC.nextLine();

        System.out.println("CPF/CNPJ: ");
        cpf_cnpj = SC.nextLine();

        System.out.println("ENDEREÇO: ");
        endereco = SC.nextLine();

        System.out.println("CIDADE: ");
        cidade = SC.nextLine();

        System.out.println("ESTADO: ");
        estado = SC.nextLine();

        var novoCliente = new Cliente(nome, cpf_cnpj, endereco, cidade, estado, null);

        System.out.println("Verifique as informações: \n");
        System.out.println(novoCliente);
        System.out.println("""
            Prosseguir?
            [1] - Sim    | [2] - Não
            """);
        opcao = SC.nextInt();
        SC.nextLine();

        if(opcao == 1)
        {
            //mandar para service aqui
        }
        else if(opcao != 2)
        {
            System.out.println("Opção inválida, redirecionamento por padrão para o inicio!");
        }

        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        finally
        {
            inicio();
        }
    }
}