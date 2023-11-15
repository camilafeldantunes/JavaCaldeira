package com.github.javacaldeira.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Retangulo("Retângulo", 8, 10));
        formas.add(new Quadrado("Quadrado", 4));
        formas.add(new Circulo("Circulo", 6));
        formas.add(new Triangulo("Triângulo", 3, 4));
        formas.add(new Losango("Losango", 8, 4));

        for(FormaGeometrica forma : formas){
            System.out.println("A área do " + forma.nome + " é de: " + forma.calcularArea());
        }
    }
}
