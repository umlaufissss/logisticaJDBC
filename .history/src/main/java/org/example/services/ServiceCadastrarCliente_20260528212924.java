package org.example.services;

import org.example.model.Cliente;

public class ServiceCadastrarCliente 
{
    public static void serviceCadastroCliente(Cliente cliente)
    {
        //VERIFICAR CPF_CNPJ
        if(cliente.getCpf_cnpj().length() >= 20)
        {
            return new Miss
        }
    }
}
