package exercises;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempF = input.nextDouble();

        double formula = (5 *(tempF - 32) / 9);

        System.out.printf("Temperatura em Celsius: %.2f\n", formula);











        input.close();
    }
}
