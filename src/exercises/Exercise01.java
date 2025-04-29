package exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = input.nextInt();
        System.out.println("Digite o valor de C: ");
        int C = input.nextInt();

        int soma = A + B;
        System.out.println();
        System.out.println("A soma de A e B é: " + soma);
        System.out.println();
        String resultado = (soma < C) ? "A soma entre A e B é menor que C." : (soma > C) ? "A soma entre A e B é maior que C." : "A soma entre A e B é igual a C.";

        System.out.println(resultado);

        input.close();

    }
}
