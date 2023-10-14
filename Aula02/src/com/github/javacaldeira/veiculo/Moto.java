package com.github.javacaldeira.veiculo;

public class Moto extends Veiculo{

    @Override
    public void custoViagem(int distancia) {
        double custoViagem = 0;
        custoViagem = distancia * 0.15;
        System.out.println("O custo total da viagem feita pela moto é de: R$" + custoViagem);
    }
}
