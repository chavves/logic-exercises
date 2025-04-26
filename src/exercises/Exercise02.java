package exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

       String parOuImpar = (num % 2 == 0) ? "par" : "impar";
       String positivoOuNegativo = (num > 0) ? "positivo" : (num < 0) ? "negativo" : "neutro";
        System.out.println("O número é " + parOuImpar + " e " + positivoOuNegativo + ".");

        input.close();

    }
}