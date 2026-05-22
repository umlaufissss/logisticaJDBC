package org.example.enummerations;

public enum enumEntrega 
{
    EM_ROTA ("EM_ROTA"),
    ENTREGUE("ENTREGUE"),
    ATRASADA("ATRASADA");

    private String status;

    private enumEntrega (String status);
    {
        this.status = status;
    }

    public static enumEntrega getDefault()
    {
        return EM_ROTA;
    }
}
