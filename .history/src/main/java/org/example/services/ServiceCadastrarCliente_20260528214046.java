package org.example.services;

import java.sql.SQLException;

import org.example.DAO.ClienteDao;
import org.example.exceptions.LenghtOutOfBoundsException;
import org.example.model.Cliente;

public class ServicrCliente 
{
    public static void serviceCadastroCliente(Cliente cliente) throws SQLException
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
                throw new LenghtOutOfBoundsException("O tamanho aceito para Estado brasileiro é 2");
            }
            catch(LenghtOutOfBoundsException e)
            {
                e.printStackTrace();
            }
        }

        ClienteDao.cadastrarCliente(cliente);
    }
}
