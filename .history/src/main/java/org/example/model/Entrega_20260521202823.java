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

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public Pedido getPedido() 
    {
        return pedido;
    }
    public void setPedido(Pedido pedido) 
    {
        this.pedido = pedido;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) 
    {
        this.motorista = motorista;
    }
    public LocalDate getData_saida()
     {
        return data_saida;
    }
    public void setData_saida(LocalDate data_saida) 
    {
        this.data_saida = data_saida;
    }
    public LocalDate getData_entrada() {
        return data_entrada;
    }
    public void setData_entrada(LocalDate data_entrada) 
    {
        this.data_entrada = data_entrada;
    }
    public enumEntrega getStatus() {
        return status;
    }
    public void setStatus(enumEntrega status) {
        this.status = status;
    }

    
}
