package org.example.views;

public class ViewAtualizarStatus extends Main
{
    public static void atualizarStatusdeEntrega()
    {
        int entrega_id, opcao, novoStatus;

        System.out.println("====================================");
        System.out.println("     ATUALIZAR STATUS DE ENTREGA    ");
        System.out.println("====================================");

        System.out.println("Digite a informação da entrega:");

        System.out.println("ID DA ENTREGA");
        entrega_id = SC.nextInt();
        SC.nextLine();
        //Buscar por Id

        /* 
        if(entrega.getStatus().equals("PENDENTE"))
        {
                System.out.println("""
                    STATUS ATUAL: PENDENTE
                    Digite o novo status de acordo com seu ID:
                    [1] - EM_ROTA    | [3] - CANCELADO
                """);
                novoStatus = SC.nextInt();
                SC.nextLine();               
        }
        else if(entrega.getStatus().equals("EM_ROTA"))
        {
            System.out.println("""
                    STATUS ATUAL: EM ROTA
                    Digite o novo status de acordo com seu ID:
                    [2] - ENTREGUE    | [4] - CANCELADO    | [5] - ATRASADA
                """);
                novoStatus = SC.nextInt();
                SC.nextLine(); 
        }
        else if(entrega.getStatus().equals("ATRASADA"))
        {
            System.out.println("""
                    STATUS ATUAL: ATRASADA
                    Digite o novo status de acordo com seu ID:
                    [2] - ENTREGUE    | [4] - CANCELADO
                """);
                novoStatus = SC.nextInt();
                SC.nextLine(); 
        }
        else
        {
            System.out.println("ERRO! Entregas CANCELADAS ou ENTREGUES não podem ter seu status alterado!");

            //
        }
        */

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
