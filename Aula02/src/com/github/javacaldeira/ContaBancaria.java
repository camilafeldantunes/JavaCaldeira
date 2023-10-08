package com.github.javacaldeira;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo, LocalDateTime horarioAtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = horarioAtual;
    }

    public void saque(double valor){
        if (valor <= saldo){
            this.saldo = saldo - valor;
            System.out.println("O saque de R$ " + valor + " foi realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
    public void deposito(double valor){
        this.saldo = saldo + valor;
        System.out.println("O deposito de R$ " + valor + " foi realizado com sucesso");
    }

    public void pix(double valor){
        if(valor < saldo){
            this.saldo = saldo - valor;
            System.out.println("PIX de R$ " + valor + " realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void verificaSaldo(){
        System.out.println("Seu saldo atual é de R$ " + saldo);
    }

    public void transferencia(String destino, double valor){

            if(saldo > valor){
                this.saldo = saldo - valor;
                System.out.println("Tranferência para a conta " + destino + " de valor " + valor + " realizada com sucesso");
            } else{
                System.out.println("Valor insuficiente");
            }
        }

    public void verificaHorario(){
        System.out.println("O horário atual é: " + horarioAtual);
    }

    public void informacaoPessoal(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(identificadorConta);
        System.out.println(banco);
        System.out.println(endereco);
        System.out.println(saldo);
    }

    public void alterarEndereco(){
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o seu endereço atual");
        String novoEndereco = dados.nextLine();
        this.endereco = novoEndereco;

    }

    public void fecharConta(){
        this.saldo = 0;
        System.out.println("Sua conta foi fechada");
        System.out.println("O seu saldo final é: " + saldo);
    }
}
