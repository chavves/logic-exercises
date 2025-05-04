package exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double produto = input.nextDouble();

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em 2x (sem juros");
        System.out.println("4 - Parcelado em 3x ou mais no Cartão (10% de juros)");

        int escolha = input.nextInt();
        double precoFinal = 0;

        switch (escolha){
            case 1:
                precoFinal = produto * 0.85;
                System.out.printf("Pagamento à vista em Dinheiro/Pix.%nPreço com desconto: R$ %.2f%n", precoFinal);
                break;

            case 2:
                precoFinal = produto * 0.90;
                System.out.printf("Pagamento à vista em Dinheiro/Pix.%nPreço com desconto: R$ %.2f%n", precoFinal);
                break;

            case 3:
                precoFinal = produto;
                System.out.printf("Pagamento parcelado em 2x no Cartão.%nPreço normal: R$ %.2f%n", precoFinal);
                break;

            case 4: precoFinal = produto * 1.10;
                System.out.printf("Pagamento parcelado em 3x no Cartão.%nPreço com juros R$ %.2f%n", precoFinal);
                break;

            default:
                System.out.println("Opção inválida");
        }

        input.close();
    }
}
