import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número");
        Double numero1 = numero.nextDouble();
        System.out.println("Digite um número");
        Double numero2 = numero.nextDouble();
        System.out.println("Digite um número");
        Double numero3 = numero.nextDouble();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é " + numero1);
        } else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior número é " + numero2);
        } else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("O maior número é " + numero3);
        } else {
            System.out.println("Números repetidos");
        }

        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("O menor número é " + numero1);
        } else if(numero2 < numero1 && numero2 < numero3){
            System.out.println("O menor número é " + numero2);
        } else if(numero3 < numero1 && numero3 < numero2){
            System.out.println("O menor número é " + numero3);
        } else {
            System.out.println("Números repetidos");
        }

        Double Media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média aritmétrica dos números escolhidos é " + Media);
    }
}
