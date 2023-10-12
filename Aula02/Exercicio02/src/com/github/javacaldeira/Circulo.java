package com.github.javacaldeira;

import java.util.Scanner;

public class Circulo {
    private double pi;
    private double area;
    private double circunferencia;
    private double raio;

    public Circulo(double pi, double area, double circunferencia, double raio) {
        this.pi = pi;
        this.area = area;
        this.circunferencia = circunferencia;
        this.raio = raio;
    }
    // Calcula a área do círculo
    public void calcularArea(double raio){
        if(raio > 0){
            area = pi * (raio * raio);
            System.out.println("O valor da área do círculo com o raio de tamanho " + raio + " é " + area);
        }else {
            System.out.println("Coloque um raio positivo");
        }
    }
    // Calcula a circunferência do círculo
    public void calcularCircunferencia(double raio){
        if(raio > 0){
            circunferencia = 2 * pi * raio;
            System.out.println("O valor da circunferência com o raio de tamanho " + raio + " é " + circunferencia);
        } else{
            System.out.println("Coloque um raio positivo");
        }

    }

    // Mudando o tamanho do raio
    public void definirRaio(double novoRaio){
        this.raio = novoRaio;
        // Teste para ver se o raio é positivo
        if (raio > 0) {
            System.out.println("O novo raio é de: " + raio);
            area = pi * (raio * raio);
            circunferencia = 2 * pi * raio;
            System.out.println("A nova área é de: " + area);
            System.out.println("A nova circunferência é de: " + circunferencia);
        } else{
            System.out.println("Coloque um número positivo para esse novo raio");
        }

    }
        // Cria uma representação em texto do círculo
       public String toString(){
            return "Círculo [raio =" + raio + ", Área = " + area + ", Circunferência = " + circunferencia + "]";
       }

       // Calcula o Diâmetro do Círculo
       public void calculaDiametro(){
        double diametro = 2 * raio;
           System.out.println("O diâmetro do raio é: " + diametro);
       }

       // Calcula a área sombreado de dois círculos
       public void calculaAreaSombreada(double raioMaior, double raioMenor){
            double areaSombreada = pi * ((raioMaior * raioMaior) - (raioMenor * raioMenor));
           System.out.println("A área sombreada dos dois círculos com raios " + raioMaior + " e " + raioMenor + " é igual a: " + areaSombreada);
       }

       public void tamanhoCirculo(double raio1, double raio2){
        if(raio1 == raio2){
            System.out.println("Os círculos têm o mesmo tamanho");
        }else {
            System.out.println("Os círculos têm tamanho diferente");
        }
       }

}

