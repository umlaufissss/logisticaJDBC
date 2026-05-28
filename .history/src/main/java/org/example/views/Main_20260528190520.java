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
        [1] - Cadastrar Cliente                                |  [9] - 
        [2] - Cadastrar Motorista                              | [10] -
        [3] - Criar Pedido                                     | [11] -
        [4] - Atribuir Pedido a Motorista (Gerar Entrega)      | [12] -
        [5] - Registrar Evento de Entrega (Histórico)          | [13] -
        [6] - Atualizar Status da Entrega                      | [14] -
        [7] - Listar Todas as Entregas                         | [15] -
        [8] - Relatório: Total de Entregas por Motorista       | [16] -
        [0] - Sair                                             |
                """);
    }
}
