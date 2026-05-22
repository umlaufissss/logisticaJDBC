package org.example.enummerations;

public enum enumEntrega 
{
    EM_ROTA ("EM_ROTA"),
    ENTREGUE("ENTREGUE"),
    ATRASADA("ATRASADA");

    private String status;

    public enumEntrega (String string)
    {
        this.status = string;
    }
}
