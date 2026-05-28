package org.example.views;

import org.example.model.HistoricoEntrega;

import java.time.LocalDate;

public class ViewRegistarHistorico extends Main
{
    public static void registrarEventoDeEntrega()
    {
        int entrega_id, opcao;
        LocalDate data_evento = LocalDate.now();
        String descricao;

        System.out.println("====================================");
        System.out.println("    REGISTRAR EVENTO DE ENTREGA     ");
        System.out.println("====================================");

        System.out.println("Digite a informação da entrega:");

        System.out.println("ID DA ENTREGA");
        entrega_id = SC.nextInt();
        SC.nextLine();

        System.out.println("Digite a informação do histórico de entrega: ");

        System.out.println("DESCRIÇÃO: ");
        descricao = SC.nextLine();

        var HistoricoEntrega = new org.example.model.HistoricoEntrega(null, data_evento, descricao)
    }
}
