import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
        final double salarioMinimo = 1320;
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite o seu salário");
        double seuSalario = salario.nextInt();
        double quantidadeDeSalariosMinimos = seuSalario / salarioMinimo;
        System.out.println("A quantidade de salários mínimos que você ganha é de " + quantidadeDeSalariosMinimos);


    }
}
