package com.github.javacaldeira.tributacao;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
       this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double retornaSaldo(){
        return saldo;
    }
}
