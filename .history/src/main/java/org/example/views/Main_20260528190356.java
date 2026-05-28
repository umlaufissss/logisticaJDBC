package org.example.views;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() 
    {
        inicio();
    }

    public static void inicio()
    {
        System.out.println("====================================");
        System.out.println("  Sistema de Logística de Entregas  ");
        System.out.println("====================================");

        System.out.println("Digite o número da funcionalidade na qual deseja entrar:\n");
        System.out.println("""
        [1] - Cadastrar Cliente|
        [2] - Cadastrar Motorista
        [3] - Criar Pedido
        [4] - Atribuir Pedido a Motorista (Gerar Entrega)
        [5] - Registrar Evento de Entrega (Histórico)
        [6] - Atualizar Status da Entrega
        [7] - Listar Todas as Entregas
        [8] - Relatório: Total de Entregas por Motorista
        [0] - Sair
                """);
    }
}
