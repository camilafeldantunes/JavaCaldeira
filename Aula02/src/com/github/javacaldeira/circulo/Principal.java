package com.github.javacaldeira.circulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        double raio = 10;

        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo(raio);
        circulo.calcularArea(raio);
        circulo.calcularCircunferencia(raio);
        circulo.alterarRaio(15);
        System.out.println(circulo.toString());
        circulo.raioIgual(50, 80);
        circulo.calculaDiametro(raio);
        circulo.calcularAreaSombreada(15, 10);


    }
}
