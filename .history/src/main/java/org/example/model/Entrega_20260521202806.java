package org.example.model;

import java.time.LocalDate;

import org.example.enummerations.enumEntrega;

public class Entrega 
{
    private int id;
    private Pedido pedido;
    private Motorista motorista;
    private LocalDate data_saida;
    private LocalDate data_entrada;
    private enumEntrega status;
}
