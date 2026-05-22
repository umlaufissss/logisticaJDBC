package org.example.model;

import java.time.LocalDate;

public class HistoricoEntrega 
{
    private int id;
    private Entrega entrega;
    private LocalDate data_evento;
    private String descricao;

    

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public Entrega getEntrega()
     {
        return entrega;
    }
    public void setEntrega(Entrega entrega) 
    {
        this.entrega = entrega;
    }
    public LocalDate getData_evento()
     {
        return data_evento;
    }
    public void setData_evento(LocalDate data_evento)
     {
        this.data_evento = data_evento;
    }
    public String getDescricao() 
    {
        return descricao;
    }
    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    
}
