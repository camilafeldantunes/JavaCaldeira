package com.github.javacaldeira.veiculo;

public class Carro extends Veiculo{
    @Override
    public void custoViagem(int distancia) {
        double custoViagem = 0;
        custoViagem = distancia * 0.20;
        System.out.println("O custo total da viagem feita pelo carro é de: R$" + custoViagem);
    }
}
