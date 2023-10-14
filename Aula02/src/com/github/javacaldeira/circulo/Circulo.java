package com.github.javacaldeira.circulo;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Calcula área do Círculo
    public void calcularArea(double raio){
        double area = 0;
        if(raio > 0){
            area = Math.PI * (raio * raio);
            System.out.println("A área do círculo é de: " + area);
        } else {
            System.out.println("Digite um raio positivo para o cálculo ser efetuado");
        }

    }
        // Calcular a círcunferência do círculo
        public void calcularCircunferencia(double raio){
            double circunferencia = 0;
            if(raio > 0){
                circunferencia = 2 * Math.PI * raio;
                System.out.println("A circuferência é de: " + circunferencia);
            }else {
                System.out.println("Digite um número positivo para o raio");
        }
    }
        // Mudando o tamanho do raio
        public void alterarRaio(double novoRaio){
        this.raio = novoRaio;
        // Testando se o novo raio passado é positivo
            if(raio > 0){
                System.out.println("O tamanho do novo raio é de: " + raio);
                calcularCircunferencia(raio);
                calcularArea(raio);
            } else{
                System.out.println("Coloque um número positivo para o novo raio");
            }


        }
        // Criar uma representação em texto do círculo
        public String toString(){
            return "Círculo [raio = " + raio + ", Área = " + (Math.PI * (raio * raio)) + ", Circuferência = " + (2 * Math.PI * raio) + "]";
        }

        // Verificar se os círculos passados têm o mesmo raio
        public void raioIgual(double circulo1, double circulo2){
            if(circulo1 == circulo2){
                System.out.println("Os círculos têm o mesmo tamanho");
            } else if (circulo1 > circulo2){
                System.out.println("O raio do círculo 1 é maior que o do círculo 2");
            } else{
                System.out.println("O raio do círculo 2 é maior que o do círculo 1");
            }
        }

        public void calculaDiametro(double raio){
            double diametro = 0;
            if(raio > 0){
                diametro = 2 * raio;
                System.out.println("O diâmetro do círculo é de: " + diametro);
            } else{
                System.out.println("Digite um número positivo para o raio");
            }
        }
        // Calcula a área sombreada entre dois círculos cocêntricos de raios diferentes
        public void calcularAreaSombreada(double raio1, double raio2){
            double areaSombreada = 0;
            if(raio1 > 0 && raio2 > 0){
                if(raio1 != raio2){
                    areaSombreada = (Math.PI * (raio1 * raio1)) - (Math.PI * (raio2 * raio2));
                    System.out.println("A área sombreada entre dois círculos cocêntricos é de: " + areaSombreada);
                } else{
                    System.out.println("Digite raios de tamanhos diferentes");
                }
            }else {
                System.out.println("Digite um número positivo para cada raio");
            }
        }
}
