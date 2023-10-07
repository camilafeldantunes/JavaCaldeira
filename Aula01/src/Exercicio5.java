import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        // criar variavel hora, minuto, segundo
        // transforma tudo para segundo
        // faz calculo desde a 00,00,00
        // faz calculo de quanto falta para meia noite
        Scanner tempo = new Scanner(System.in);
        System.out.println("Digite o horário de agora");
        System.out.println("Digite as horas");
        int horas = tempo.nextInt();
        System.out.println("Digite os minutos");
        int minutos = tempo.nextInt();
        System.out.println("Digite os segundos");
        int segundo = tempo.nextInt();

        int minutoPraSegundo = minutos * 60;
        int horasPraSegundo = horas * 3600;

        int somaSegundos = segundo + minutoPraSegundo + horasPraSegundo;

        System.out.println("O total de segundo que passou foi desde a meia noite foi de " + somaSegundos);

        // Quantidade de segundos que tem em 24h
        final int quantidadeDesegundos = 86400;

        int tempoFalta = quantidadeDesegundos - somaSegundos;
        System.out.println("A quantidade de segundos que falta para meia noite é de " + tempoFalta);


    }
}
