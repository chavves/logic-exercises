package exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = input.nextInt();

        int sucessor = N + 1;
        int antecessor = N - 1;

        System.out.println("O successor de " + N + " é: " + sucessor);
        System.out.println("O antecessor de " + N + " é: " + antecessor);

        input.close();
    }
}
