import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
        final int salarioMinimo = 1320;
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite o seu salário");
        int seuSalario = salario.nextInt();
        int diferencaSalarial = seuSalario - salarioMinimo;
        System.out.println("A sua diferença salarial quando comparado ao salário mínimo é de R$" + diferencaSalarial);


    }
}
