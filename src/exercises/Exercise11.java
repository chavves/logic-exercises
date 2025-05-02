package exercises;

import java.util.Scanner;

public class Exercise11 {

    // Constante que define a quantidade total de notas
    public static final int TOTAL_NOTAS = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[] notas = new double[TOTAL_NOTAS];
        double soma = 0;

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        for (int i = 0; i < TOTAL_NOTAS ; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double media = soma / TOTAL_NOTAS;


        System.out.println("Nome: " + nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7){
            System.out.println("Você foi aprovado!");
        }
        else{
            System.out.println("Você foi reprovado!");
        }

        input.close();
    }
}
