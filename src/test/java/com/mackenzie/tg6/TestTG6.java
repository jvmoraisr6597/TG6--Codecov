package com.mackenzie.tg6;

import com.mackenzie.tg6.models.Cliente;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TestTG6 {
    @Test
    public void testeEmprestimo() {
        String liberado = "Empréstimo Concedido";
        String negado = "Empréstimo Negado";
        System.out.println("Teste Empréstimo");
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, true, true)));
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, false, true)));
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, true, false)));
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(2000, false, false)));

        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(950, false, true)));
        assertEquals(liberado, TG6.liberarEmprestimo(new Cliente(950, true, false)));
        assertEquals(negado, TG6.liberarEmprestimo(new Cliente(950, true, true)));
        assertEquals(negado, TG6.liberarEmprestimo(new Cliente(950, false, false)));
    }
}
