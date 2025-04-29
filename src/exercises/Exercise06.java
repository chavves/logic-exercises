package exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double N = input.nextDouble();

        double soma = N * 0.05;
        double somaReajuste = N + soma;

        System.out.println("O valor com o reajuste de 5% é: " + somaReajuste);
        input.close();

    }

}
