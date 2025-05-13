package exercises;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula: ");
        double valorHora = input.nextDouble();

        System.out.print("Digite o número de aulas no mês: ");
        int numeroAulas = input.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualINSS = input.nextDouble();


        double salarioBruto = valorHora * numeroAulas;
        double descontoINSS = (percentualINSS / 100) * salarioBruto;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        input.close();

    }
}
