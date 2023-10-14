package com.github.javacaldeira.veiculo;

public abstract class Veiculo{
    private String marca;
    private String modelo;
    private int ano;

    public abstract void custoViagem(int distancia);

}
