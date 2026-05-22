package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente 
{
    private int id;
    private String nome;
    private String cpf_cnpj;
    private String endereco;
    private String cidade;
    private Char[] estado = [];
    private LocalDateTime created_at;
}
