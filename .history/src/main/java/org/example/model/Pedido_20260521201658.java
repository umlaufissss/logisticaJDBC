package org.example.model;

import java.time.LocalDate;

public class Pedido 
{
    private int id;
    private Cliente cliente; // ver se é bom
    private LocalDate data_pedido;
    private double volume_m3;
    private double peso_kg;
    private String cidade;
    private String estado;


}
