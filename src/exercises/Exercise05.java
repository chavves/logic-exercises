package exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioMin = 1293.20;

        System.out.println("Informe o seu Salário: ");
        double salarioUsuario = input.nextDouble();

        double quantosSalariosMinimos =  salarioUsuario / salarioMin;

        System.out.println("Você ganha " + quantosSalariosMinimos + " salário(s) mínimo(s).");

        input.close();
    }
}
