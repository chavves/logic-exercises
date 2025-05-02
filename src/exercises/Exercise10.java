package exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] notas = new double[3];
        double soma = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double media = soma / 3;

        System.out.printf("A média das notas é: %.2f%n", media);

        input.close();
    }
}
