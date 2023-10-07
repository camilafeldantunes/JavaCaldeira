import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args){
        Scanner idade = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int suaIdade = idade.nextInt();

        if(suaIdade < 16){
            System.out.println("Você não pode votar");
        } else if(suaIdade >= 16 && suaIdade <=17){
            System.out.println("Voto facultativo");
        } else if (suaIdade >= 18 && suaIdade <= 65){
            System.out.println("Obrigatório votar");
        } else{
            System.out.println("Voto facultativo");
        }
    }
}
