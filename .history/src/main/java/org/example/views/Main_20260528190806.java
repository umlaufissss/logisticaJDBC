package org.example.views;

import java.util.Scanner;

public class Main 
{
    static Scanner SC = new Scanner(System.in);
    public static void main() 
    {
        inicio();
    }

    public static void inicio()
    {
        int opcao;

        System.out.println("====================================");
        System.out.println("  Sistema de Logística de Entregas  ");
        System.out.println("====================================");

        System.out.println("Digite o número da funcionalidade na qual deseja entrar:\n");
        System.out.println("""
        [1] - Cadastrar Cliente                                |  [9] - Relatório: Clientes com Maior Volume Entregue
        [2] - Cadastrar Motorista                              | [10] - Relatório: Pedidos Pendentes por Estado
        [3] - Criar Pedido                                     | [11] - Relatório: Entregas Atrasadas por Cidade
        [4] - Atribuir Pedido a Motorista (Gerar Entrega)      | [12] - Buscar Pedido por CPF/CNPJ do Cliente
        [5] - Registrar Evento de Entrega (Histórico)          | [13] - Cancelar Pedido
        [6] - Atualizar Status da Entrega                      | [14] - Excluir Entrega (com validação)
        [7] - Listar Todas as Entregas                         | [15] - Excluir Cliente (com verificação de dependência)
        [8] - Relatório: Total de Entregas por Motorista       | [16] - Excluir Motorista (com verificação de dependência)
        [0] - Sair                                             |
                """);

        opcao = SC.nextInt();
        SC.nextLine();

        switch (opcao) {
            case 1 ->
            case 2 ->
            case 3 ->
            case 4 ->
            case 5 ->
            case 6 ->
            case 7 ->
            case 8 ->
            case 10 ->
            case 11 ->
            case 12 ->
            case 13 ->
            case 14 ->
            case 15 ->
            case 16 ->
            case 0 ->
        }
    }
}
