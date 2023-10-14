package com.github.javacaldeira.banco;

import com.github.javacaldeira.banco.ContaBancaria;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);

        String nome = "João";
        String cpf = "04900079022";
        String indentificadorConta = "01";
        String banco = "09";
        String endereco = "Rua tal tal";
        double saldo = 0;
        LocalDateTime horarioAtual = LocalDateTime.now();

        ContaBancaria contaBancaria = new ContaBancaria(nome, cpf, indentificadorConta, banco, endereco, saldo, horarioAtual);

        System.out.println("Menu de Opções");
        System.out.println("01 - Saque");
        System.out.println("02 - Depósito");
        System.out.println("03 - PIX");
        System.out.println("04 - Tranferência");
        System.out.println("05 - Verificar o saldo");
        System.out.println("06 - Verificar o horário");
        System.out.println("07 - Informações Pessoais");
        System.out.println("08 - Alterar endereço");
        System.out.println("09 - Fechar conta");
        System.out.println("10 - Validar CPF");
        System.out.println("Digite um número do menu de opções ou 0 para sair");
        int numeroEscolhido = menu.nextInt();


        while(numeroEscolhido != 0){
            switch(numeroEscolhido){
                case 1:
                    contaBancaria.saque(99);
                    break;
                case 2:
                    contaBancaria.deposito(500);
                    break;
                case 3:
                    contaBancaria.pix(200);
                    break;
                case 4:
                    contaBancaria.transferencia("0986", 150);
                    break;
                case 5:
                    contaBancaria.verificaSaldo();
                    break;
                case 6:
                    contaBancaria.verificaHorario();
                    break;
                case 7:
                    contaBancaria.informacaoPessoal();
                    break;
                case 8:
                    contaBancaria.alterarEndereco();
                    break;
                case 9:
                    contaBancaria.fecharConta();
                    break;
                case 10:
                    contaBancaria.validarCPF(cpf);
                    break;
                default:
                    System.out.println("Erro, digite um número do menu de opções");
            }

                if(numeroEscolhido != 9){
                    System.out.println("Menu de Opções");
                    System.out.println("01 - Saque");
                    System.out.println("02 - Depósito");
                    System.out.println("03 - PIX");
                    System.out.println("04 - Tranferência");
                    System.out.println("05 - Verificar o saldo");
                    System.out.println("06 - Verificar o horário");
                    System.out.println("07 - Informações Pessoais");
                    System.out.println("08 - Alterar endereço");
                    System.out.println("09 - Fechar conta");
                    System.out.println("10 - Validar CPF");
                    System.out.println("Digite um número do menu de opções ou 0 para sair");
                    numeroEscolhido = menu.nextInt();
                } else{
                    System.out.println("Adeus");
                    break;
                }

        }



    }
}
