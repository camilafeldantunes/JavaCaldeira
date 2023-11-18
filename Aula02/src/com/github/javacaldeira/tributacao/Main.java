package com.github.javacaldeira.tributacao;

public class Main {
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();
        gerenciadorDeImpostoDeRenda.adicionar(contaCorrente);
        gerenciadorDeImpostoDeRenda.adicionar(seguroDeVida);

        gerenciadorDeImpostoDeRenda.calcularTotalTributos();
        double totalTributos = gerenciadorDeImpostoDeRenda.getTotalTributos();

        System.out.println("Total de tributos a pagar: R$" + totalTributos);
        System.out.println("O valor da sua conta poupança possui valor de: R$" + contaPoupanca.retornaSaldo());
        System.out.println("O valor da sua conta corrente é de: R$" + contaCorrente.retornaSaldo());
    }
}
