package com.github.javacaldeira.exercicio01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[]numero = new int[5];

        System.out.println("Digite 5 número inteiros");

        for(int i = 0; i < 5; i++){
            System.out.println("Número " + (i + 1) + " : ");
            numero[i] = scanner.nextInt();
        }

        double soma = 0;
        for(int numeros : numero){
            soma += numeros;
        }

        double media = soma / numero.length;



        System.out.println("A soma dos números que você digitou é: " + soma);
        System.out.println("A média dos números que você digitou é: " + media);

    }
}
