package org.example.exceptions;

public class LenghtOutOfBoundsException extends Exception 
{
    public LenghtOutOfBoundsException (String message)
    {
        super(message);
    }

    throw new LenghtOutOfBoundsException("Tamanho fora dos limites");
}
