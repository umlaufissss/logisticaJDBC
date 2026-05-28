package org.example.enummerations;

public enum enumPedidos 
{
    PENDENTE ("PENDENTE"), 
    ENTREGUE ("ENTREGUE"), 
    CANCELADO ("CANCELADO");

    enumPedidos(String status)
    {
    }

    public static enumPedidos getDefault()
    {
        return PENDENTE;
    }


}
