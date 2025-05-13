package exercises;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int valorA = input.nextInt();

        System.out.println("Digite o valor B: ");
        int valorB = input.nextInt();

        int quociente = valorA / valorB;
        int resto = valorA % valorB;

        System.out.println("O quociente de A dividido por B é: " +quociente);
        System.out.println("O resto de A dividido por B é: " + resto);










        input.close();
    }
}
