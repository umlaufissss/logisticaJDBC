package org.example.views;

import java.time.LocalDate;

import org.example.model.Pedido;

public class ViewCriarPedido extends Main
{
    public static void criarPedido()
    {
        //String cpf_cnpj_cliente;
        LocalDate data_pedido = LocalDate.now();
        double volume_m3, peso_kg, valor_frete;
        int opcao;

        System.out.println("====================================");
        System.out.println("            CRIAR PEDIDO            ");
        System.out.println("====================================");

        System.out.println("Digite o CPF ou CNPJ do Cliente:");

        System.out.println("CPF/CNPJ DO CLIENTE: ");
        //cpf_cnpj_cliente = SC.nextLine();

        //BUSCAR CLIENTE POR CPF_CNPJ

        System.out.println("Digite as informações do novo pedido:");

        System.out.println("VOLUME EM M3: ");
        volume_m3 = SC.nextDouble();

        System.out.println("PESO EM KG: ");
        peso_kg = SC.nextDouble();

        System.out.println("VALOR DO FRETE: ");
        valor_frete = SC.nextDouble();
        SC.nextLine();

        var novoPedido = new Pedido(null, data_pedido, volume_m3, peso_kg, valor_frete, null);
    
        System.out.println("Verifique as informações: \n");
        System.out.println(novoPedido);
        System.out.println("""
            Prosseguir?
            [1] - Sim    | [2] - Não
            """);
        opcao = SC.nextInt();
        SC.nextLine();

        if(opcao == 1)
        {
            //mandar para a service aqui
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
