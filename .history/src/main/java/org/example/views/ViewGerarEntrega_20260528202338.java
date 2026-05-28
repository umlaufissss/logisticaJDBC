package org.example.views;

import java.time.LocalDate;

import org.example.model.Entrega;

public class ViewGerarEntrega extends Main
{
    public static void atribuirPedidoAMotorista()
    {
        int pedido_id, opcao;
        String cnh_motorista;
        LocalDate data_saida = LocalDate.now();

        System.out.println("====================================");
        System.out.println("    ATRIBUIR PEDIDO A MOTORISTA     ");
        System.out.println("====================================");

        System.out.println("Digite o id do pedido:");
        
        System.out.println("ID DO PEDIDO: ");
        pedido_id = SC.nextInt();
        SC.nextLine();
        //Buscar por Id

        System.out.println("Digite o CNH do motorista:");

        System.out.println("CNH:");
        cnh_motorista = SC.nextLine();
        //Buscar por CNH

        var novaEntrega = new Entrega(null, null, data_saida, null, null);

        System.out.println("Verifique as informações: \n");
        System.out.println(novaEntrega);
        System.out.println("""
            Prosseguir?
            [1] - Sim    | [2] - Não     
                """);
        
    }
}
