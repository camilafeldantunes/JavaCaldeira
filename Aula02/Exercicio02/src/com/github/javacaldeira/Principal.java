package com.github.javacaldeira;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        double pi = 3.14;
        double area = 0;
        double circunferencia = 0;
        double raio = 10;

        Scanner scanner = new Scanner(System.in);


        Circulo circulo = new Circulo(pi, area, circunferencia, raio);
            circulo.calcularArea(raio);
            circulo.calcularCircunferencia(raio);
            circulo.definirRaio(20);
            System.out.println(circulo.toString());
            circulo.calculaDiametro();
            circulo.calculaAreaSombreada(15, 10);
            circulo.tamanhoCirculo(15,12);
            



    }

}
