package com.mackenzie.tg6.models;

public class Cliente {
    private double saldo;
    private boolean bomPagador;
    private boolean hasConcessao;

    public Cliente(double saldo, boolean bomPagador, boolean hasConcessao) {
        this.bomPagador = bomPagador;
        this.hasConcessao = hasConcessao;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean hasConcessao() {
        return hasConcessao;
    }
    public void setHasConcessao(boolean hasConcessao) {
        this.hasConcessao = hasConcessao;
    }
    public boolean isBomPagador() {
        return bomPagador;
    }
    public void setBomPagador(boolean bomPagador) {
        this.bomPagador = bomPagador;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
