package exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();

        int C = (A == B) ? (A + B) : (A * B);

        System.out.println("O valor de C é: " + C);

        input.close();

    }
}
