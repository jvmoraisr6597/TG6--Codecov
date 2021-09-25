package com.mackenzie.tg6;

import java.util.Scanner;

import com.mackenzie.tg6.models.Cliente;

/**
 * Hello world!
 *
 */
public class TG6 
{

    static public String liberarEmprestimo(Cliente cliente)
    {
        String liberado = "Empréstimo Concedido";
        String negado = "Empréstimo Negado";
        double saldo = cliente.getSaldo();
        if(saldo > 1000){
            return liberado;
        } else if(saldo < 1000 && cliente.isBomPagador()){
            return liberado;
        } else if(saldo <1000 && cliente.hasConcessao()){
            return liberado;
        }

        return negado;
    }

    
}
