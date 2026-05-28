package org.example.enummerations;

public enum enumEntrega 
{
    PENDENTE ("PENDENTE"),
    EM_ROTA ("EM_ROTA"),
    ENTREGUE("ENTREGUE"),
    ATRASADA("ATRASADA");

    private String status;

    enumEntrega (String status) 
    {
        this.status = status;
    }

    public static enumEntrega getDefault()
    {
        return PENDENTE;
    }
}
