package exercises;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();
        System.out.println("----------------------");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de idade");
        }

        input.close();
    }
}
