package exercises;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem (em horas): ");
        int tempViagem = input.nextInt();

        System.out.println("Digite a velocidade média durante a viagem (em km/h): ");
        int velocidadeMedia = input.nextInt();

        int distancia = tempViagem * velocidadeMedia;
        int litros = distancia / 12;

        System.out.println("A distância percorrida foi: " + distancia + " km");
        System.out.println("A quantidade de litros de combustível usados foi: " + litros + " litros");

        input.close();
    }
}
