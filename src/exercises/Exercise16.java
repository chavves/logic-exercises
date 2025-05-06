package exercises;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado A do Triângulo: ");
        double ladoA = input.nextDouble();

        System.out.print("Digite o lado B do Triângulo: ");
        double ladoB = input.nextDouble();

        System.out.print("Digite o lado C do Triângulo: ");
        double ladoC = input.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Triângulo Equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }

        input.close();
    }
}
