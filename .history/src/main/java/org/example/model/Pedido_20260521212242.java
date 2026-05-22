package org.example.model;

import java.time.LocalDate;

import org.example.enummerations.enumPedidos;

public class Pedido 
{
    private int id;
    private Cliente cliente; // ver se é bom
    private LocalDate data_pedido;
    private double volume_m3;
    private double peso_kg;
    private double valor_frete;
    private enumPedidos status;

    

    public Pedido(int id, Cliente cliente, LocalDate data_pedido, double volume_m3, double peso_kg, double valor_frete,
            enumPedidos status) {
        this.id = id;
        this.cliente = cliente;
        this.data_pedido = data_pedido;
        this.volume_m3 = volume_m3;
        this.peso_kg = peso_kg;
        this.valor_frete = valor_frete;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDate getData_pedido() {
        return data_pedido;
    }
    public void setData_pedido(LocalDate data_pedido) {
        this.data_pedido = data_pedido;
    }
    public double getVolume_m3() {
        return volume_m3;
    }
    public void setVolume_m3(double volume_m3) {
        this.volume_m3 = volume_m3;
    }
    public double getPeso_kg() {
        return peso_kg;
    }
    public void setPeso_kg(double peso_kg) {
        this.peso_kg = peso_kg;
    }
    public double getValor_frete() {
        return valor_frete;
    }
    public void setValor_frete(double valor_frete) {
        this.valor_frete = valor_frete;
    }
    public enumPedidos getStatus() {
        return status;
    }
    public void setStatus(enumPedidos status) {
        this.status = status;
    }

    
}
