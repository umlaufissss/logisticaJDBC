package org.example.services;

import org.example.exceptions.LenghtOutOfBoundsException;
import org.example.model.Motorista;

public class ServiceMotorista 
{
    public static void serviceCadastroMotorista(Motorista motorista)
    {
        //VERIFICAR CNH
        if(motorista.getCnh().length() >= 20)
        {
            try
            {
                throw new LenghtOutOfBoundsException("O tamanho da  passou dos limites");
            }
            catch(LenghtOutOfBoundsException e)
            {
                e.printStackTrace();
            }
        }
    }
}
