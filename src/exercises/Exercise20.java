package exercises;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int num = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}
