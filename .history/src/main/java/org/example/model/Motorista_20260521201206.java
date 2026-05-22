package org.example.model;

import java.time.LocalDateTime;

public class Motorista 
{
    private int id;
    private String nome;
    private String cnh;
    private String endereco;
    private String veiculo;
    private String cidde_base;
    private LocalDateTime created_at;


    

    public Motorista(int id, String nome, String cnh, String endereco, String veiculo, String cidde_base,
            LocalDateTime created_at) {
        this.id = id;
        this.nome = nome;
        this.cnh = cnh;
        this.endereco = endereco;
        this.veiculo = veiculo;
        this.cidde_base = cidde_base;
        this.created_at = created_at;
    }

    
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome)
     {
        this.nome = nome;
    }
    public String getCnh() 
    {
        return cnh;
    }
    public void setCnh(String cnh) 
    {
        this.cnh = cnh;
    }
    public String getEndereco()
     {
        return endereco;
    }
    public void setEndereco(String endereco)
     {
        this.endereco = endereco;
    }
    public String getVeiculo() 
    {
        return veiculo;
    }
    public void setVeiculo(String veiculo) 
    {
        this.veiculo = veiculo;
    }
    public String getCidde_base() 
    {
        return cidde_base;
    }
    public void setCidde_base(String cidde_base)
     {
        this.cidde_base = cidde_base;
    }
    public LocalDateTime getCreated_at() 
    {
        return created_at;
    }
    public void setCreated_at(LocalDateTime created_at)
     {
        this.created_at = created_at;
    }

    
}
