package com.github.javacaldeira.exercicio02;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args){
        Random random = new Random();

        // Array de 10 posições criado
        int[]numero = new int[10];

        // Gerar 10 número aleatórios para o Array
        for(int i = 0; i < 10; i++){
            numero[i] = random.nextInt(100) + 1;
        }

        // Pede para o usuário digitar um número entre 1 e 100 para testar se tem no Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 100");
        int numeroDigitado = scanner.nextInt();

        // Teste para ver se existe no array o número digitado
        boolean existeNoArray = false;
        for (int numeros : numero){
            if(numeros == numeroDigitado){
                existeNoArray = true;
                break;
            }
        }

        if(existeNoArray){
            System.out.println("O número digitado existe no array");
        } else {
            System.out.println("O número digitado não existe no array");
        }

        // Mostra os números que foram gerados aleatóriamente
        System.out.println("Números gerados: ");
        for(int numeros : numero){
            System.out.println(numeros);

        }



    }
}
