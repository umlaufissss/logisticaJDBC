package org.example.enummerations;

public enum enumPedidos 
{
    PENDENTE ("PENDENTE"), 
    ENTREGUE ("ENTREGUE"), 
    CANCELADO ("CANCELADO");

    private String status;

    enumPedidos(String status)
    {
        this.status = status;
    }

    public static getDefault()
    {
        return
    }


}
