import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Para você fazer o consórcio com nossa empresa, faça o cadastro");
        System.out.println("Digite seu nome");
        String nome = dados.nextLine();
        System.out.println("Digite a sua idade");
        int idade = dados.nextInt();
        System.out.println("Digite o seu salário");
        double salario = dados.nextDouble();

        if(idade >= 18 && salario > 2000){
            System.out.println("Consórcio aprovado");
        } else{
            System.out.println("Consóricio reprovado");
        }
    }
}
