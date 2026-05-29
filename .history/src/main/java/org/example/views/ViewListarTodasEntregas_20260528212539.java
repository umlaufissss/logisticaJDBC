package org.example.views;

public class ViewListarTodasEntregas extends Main
{
    public static void listarTodasEntregasComClienteEMotorista()
    {
        String foiSuficiente;

        System.out.println("====================================");
        System.out.println("      LISTAR TODAS AS ENTREGAS       ");
        System.out.println("====================================");

        System.out.println("Listando todas as tarefas:");

        //mandar para a service aqui

        System.out.println("""
                Todas as entregas foram apresentadas.
                Aperte qualquer tecla para sair.
                """);
        foiSuficiente = SC.nextLine();

        System.out.println("Saindo...");

        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        fi

    }
}
