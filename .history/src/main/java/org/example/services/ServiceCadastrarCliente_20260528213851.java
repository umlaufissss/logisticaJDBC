package org.example.services;

import org.example.exceptions.LenghtOutOfBoundsException;
import org.example.model.Cliente;

public class ServiceCadastrarCliente 
{
    public static void serviceCadastroCliente(Cliente cliente)
    {
        //VERIFICAR CPF_CNPJ
        if(cliente.getCpf_cnpj().length() >= 20)
        {
            try
            {
                throw new LenghtOutOfBoundsException("O tamanho do CPF/CNPJ passou dos limites");
            }
            catch(LenghtOutOfBoundsException e)
            {
                e.printStackTrace();
            }
        }

        //VERIFICAR ESTADO
        if(cliente.getEstado().length() != 2)
        {
            try
            {
                throw new LenghtOutOfBoundsException("O Estado não é possível p");
            }
            catch(LenghtOutOfBoundsException e)
            {
                e.printStackTrace();
            }
        }
    }
}
