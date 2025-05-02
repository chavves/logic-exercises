package exercises;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        double calculoIMC = peso / Math.pow(altura, 2);

        if (calculoIMC < 18.5 ){
            System.out.println("Abaixo do peso.");
        } else if (calculoIMC < 25) {
            System.out.println("Peso ideal, parabéns.");
        }
        else if (calculoIMC < 30) {
            System.out.println("Levemente acima do peso.");
        }
        else if (calculoIMC < 35) {
            System.out.println("Obesidade grau I.");
        }
        else if (calculoIMC < 40) {
            System.out.println("Obesidade grau II (severa).");
        }
        else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        input.close();

    }
}
