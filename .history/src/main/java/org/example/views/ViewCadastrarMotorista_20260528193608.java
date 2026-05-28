package org.example.views;

import java.time.LocalDateTime;

public class ViewCadastrarMotorista extends Main 
{
    public static void cadastrarMotorista()
    {
        String nome, cnh, endereco, veiculo, cidade_base;
        LocalDateTime created_at;

        int opcao;

        System.out.println("====================================");
        System.out.println("        CADASTRAR MOTORISTA        ");
        System.out.println("====================================");

        System.out.println("Digite as informações do novo motorista:");

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
    }
}