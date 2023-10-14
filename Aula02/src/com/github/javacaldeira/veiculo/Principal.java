package com.github.javacaldeira.veiculo;

public class Principal {
    public static void main(String[] args){
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.custoViagem(5);
        moto.custoViagem(10);
    }
}
