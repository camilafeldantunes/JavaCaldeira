import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        System.out.println("Menu de Opções");
        System.out.println("01 - Gestante");
        System.out.println("02 - Idosa");
        System.out.println("03 - PCD");
        System.out.println("04 - Nenhuma das alternativas anteriores");
        System.out.println("Digite a opção desejada ou 0 para sair");
        int opcao = menu.nextInt();

        while(opcao != 0){
            if(opcao == 1){
                System.out.println("Direito a fila prioritária");
            } else if (opcao == 2){
                System.out.println("Direito a fila prioritária");
            } else if (opcao == 3){
                System.out.println("Direito a fila prioritária");
            } else if(opcao == 4){
                System.out.println("Fila Normal");
            } else{
                System.out.println("Número inválido, coloque um número do Menu de Opções");
            }
            System.out.println("Menu de Opções");
            System.out.println("01 - Gestante");
            System.out.println("02 - Idosa");
            System.out.println("03 - PCD");
            System.out.println("04 - Nenhuma das alternativas anteriores");
            System.out.println("Digite a opção desejada ou 0 para sair");
            opcao = menu.nextInt();
        }
    }
}
