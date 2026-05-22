package org.example.enummerations;

public enum enumPedidos 
{
    PENDENTE ("PENDENTE"), 
    ENTREGUE ("ENTREGUE"), 
    CANCELADO ("CANCELADO");

    private String status;

    enumPedidos(String descricao)
    {
        this.descricao = descricao;
    }


}
