package com.github.javacaldeira.banco;

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

    // Faz uma transferência para outra conta destino
    // Somente se estiver dentro do horário permitido
    // E tiver saldo na conta
    public void transferencia(String destino, double valor){
        if(LocalDateTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <= 19){
            if(saldo > valor){
                this.saldo = saldo - valor;
                System.out.println("Tranferência para a conta " + destino + " de valor " + valor + " realizada com sucesso");
            } else{
                System.out.println("Valor insuficiente");
            }
        } else{
            System.out.println("Erro, horário de transferência: 08:00 às 19:00");
        }
    }
    // Verifica o horário atual
    public void verificaHorario(){
        System.out.println("O horário atual é: " + horarioAtual);
    }

    // Mostra as informações pessoais do titular
    public void informacaoPessoal(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(identificadorConta);
        System.out.println(banco);
        System.out.println(endereco);
        System.out.println(saldo);
    }

    // Altera o endereço, atualizando nas informações pessoais
    public void alterarEndereco(){
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o seu endereço atual");
        String novoEndereco = dados.nextLine();
        this.endereco = novoEndereco;

    }

    public boolean validarCPF(String cpf){
        cpf = cpf.replace("\\.", "");
        cpf = cpf.replaceAll("-", "");

        if(cpf.length() != 11){
            return false;
        }
        // Calcula a soma do primeiro dígito verificador
        int soma = 0;
        for(int i = 0; i<9; i++){
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int resto = 11 - (soma % 11);
        int digito1 = (resto == 10 || resto == 11)? 0 : resto;

        // Calcula o segundo dígito verificador
        soma = 0;
        for(int i = 0; i < 10; i++){
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        resto = 11 - (soma % 11);
        int digito2 = (resto == 18 || resto == 11)? 0 : resto;

        return digito1 == Integer.parseInt(String.valueOf(cpf.charAt(9))) && digito2 == Integer.parseInt(String.valueOf(cpf.charAt(10)));
    }

    public void fecharConta(){
        this.saldo = 0;
        System.out.println("Sua conta foi fechada");
        System.out.println("O seu saldo final é: " + saldo);
    }
}
