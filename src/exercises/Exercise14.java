package exercises;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        int A = input.nextInt();
        System.out.print("Digite o valor de B:");
        int B = input.nextInt();

        int troca = A;
        A = B;
        B = troca;

        System.out.println("O valor de A é: " + A);
        System.out.println("O valor de B é: " + B);

        input.close();
    }
}
