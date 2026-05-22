package org.example.model;

import java.time.LocalDateTime;

public class Cliente 
{
    private int id;
    private String nome;
    private String cpf_cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private LocalDateTime created_at;

    

    public Cliente(int id, String nome, String cpf_cnpj, String endereco, String cidade, String estado,
            LocalDateTime created_at) {
        this.id = id;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
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
    public String getCpf_cnpj() 
    {
        return cpf_cnpj;
    }
    public void setCpf_cnpj(String cpf_cnpj)
     {
        this.cpf_cnpj = cpf_cnpj;
    }
    public String getEndereco() 
    {
        return endereco;
    }
    public void setEndereco(String endereco)
     {
        this.endereco = endereco;
    }
    public String getCidade()
     {
        return cidade;
    }
    public void setCidade(String cidade)
     {
        this.cidade = cidade;
    }
    public String getEstado() 
    {
        return estado;
    }
    public void setEstado(String estado) 
    {
        this.estado = estado;
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
