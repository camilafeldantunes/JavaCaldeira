package com.github.javacaldeira.figurasgeometricas;

public abstract class FormaGeometrica {

    protected String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }

    public abstract double calcularArea();

}
