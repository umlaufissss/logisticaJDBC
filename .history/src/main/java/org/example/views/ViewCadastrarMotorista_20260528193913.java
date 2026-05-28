package org.example.views;

import java.time.LocalDateTime;

import org.example.model.Motorista;

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

        System.out.println("CNH: ");
        cnh = SC.nextLine();

        System.out.println("ENDEREÇO: ");
        endereco = SC.nextLine();

        System.out.println("VEÍCULO: ");
        veiculo = SC.nextLine();

        System.out.println("CIDADE_BASE: ");
        cidade_base = SC.nextLine();

        var novoMotorista = new Motorista(nome, cnh, endereco, veiculo, cidade_base, created_at);

        sSystem.out.println("Verifique");
    }
}