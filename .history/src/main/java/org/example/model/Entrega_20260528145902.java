package org.example.model;

import java.time.LocalDate;

import org.example.enummerations.enumEntrega;

public class Entrega 
{
    private int id;
    private Motorista motorista;
    private LocalDate data_saida;
    private LocalDate data_entrada;
    private enumEntrega status;

    

    public Entrega(int id, Pedido pedido, Motorista motorista, LocalDate data_saida, LocalDate data_entrada,
            enumEntrega status) 
    {
        this.id = id;
        this.pedido = pedido;
        this.motorista = motorista;
        this.data_saida = data_saida;
        this.data_entrada = data_entrada;
        this.status = status;
    }

    
    public Entrega(Pedido pedido, Motorista motorista, LocalDate data_saida, LocalDate data_entrada,
            enumEntrega status) 
    {
        this.pedido = pedido;
        this.motorista = motorista;
        this.data_saida = data_saida;
        this.data_entrada = data_entrada;
        this.status = status;
    }


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
    public LocalDate getData_entrada()
     {
        return data_entrada;
    }
    public void setData_entrada(LocalDate data_entrada) 
    {
        this.data_entrada = data_entrada;
    }
    public enumEntrega getStatus() 
    {
        return status;
    }
    public void setStatus(enumEntrega status) 
    {
        this.status = status;
    }

    
}
