package org.example.views;

import java.time.LocalDate;

import org.example.model.Pedido;

public class ViewCriarPedido extends Main
{
    public static void criarPedido()
    {
        String cpf_cnpj_cliente;
        LocalDate data_pedido = LocalDate.now();
        double volume_m3, peso_kg, valor_frete;

        System.out.println("====================================");
        System.out.println("            CRIAR PEDIDO            ");
        System.out.println("====================================");

        System.out.println("Digite as informações do novo pedido:");

        System.out.println("CPF/CNPJ DO CLIENTE: ");
        cpf_cnpj_cliente = SC.nextLine();

        //BUSCAR CLIENTE POR CPF

        System.out.println("VOLUME EM M3: ");
        volume_m3 = SC.nextDouble();

        System.out.println("PESO EM KG: ");
        peso_kg = SC.nextDouble();

        System.out.println("VALOR DO FRETE: ");
        valor_frete = SC.nextDouble();
        SC.nextLine();

        var pedido = new Pedido(null, data_pedido, volume_m3, peso_kg, valor_frete, null)
    }
}
