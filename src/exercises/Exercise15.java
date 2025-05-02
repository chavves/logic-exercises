package exercises;

import java.util.Scanner;

// ESSE EXERCICIO NÃO FAZ NENHUM SENTIDO ANYWAY
public class Exercise15 {
    public static final int ANO_ATUAL = 2025;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = input.nextInt();

        int idade = ANO_ATUAL - anoNascimento;
        int totalDias = idade * 365;
        int diasNoUltimoAno = (totalDias % 365);
        int meses = (diasNoUltimoAno / 30);
        int dias = diasNoUltimoAno % 30;

        System.out.printf("%d anos, %d meses e %d dias de vida", idade, meses, dias);

        input.close();
    }
}
