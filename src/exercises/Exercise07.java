package exercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor (true ou false): ");
        boolean valor1 = input.nextBoolean();

        System.out.print("Digite o segundo valor (true ou false): ");
        boolean valor2 = input.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos são VERDADEIROS.");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são FALSOS.");
        } else {
            System.out.println("Os valores são diferentes, tente novamente!");
        }

        input.close();
    }
}
