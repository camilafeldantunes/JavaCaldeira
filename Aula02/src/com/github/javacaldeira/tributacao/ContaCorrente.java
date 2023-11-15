package com.github.javacaldeira.tributacao;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos(){
        return retornaSaldo() * 0.01;
    }

}
