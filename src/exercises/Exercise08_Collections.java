package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise08_Collections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criação de uma lista dinâmica (ArrayList) para armazenar os números digitados
        ArrayList<Integer> arrayDeNumb = new ArrayList<>();
        int numb;

        // Laço que permite ao usuário digitar 3 números
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numb = input.nextInt();
            arrayDeNumb.add(numb); // Adiciona o número digitado à lista
        }

        // O Collections.sort() é usado para ordenar uma lista.
        // Dentro dos parênteses, você passa dois parâmetros:
        // 1. O primeiro parâmetro é a **lista** que você deseja ordenar (no caso, `arrayDeNumb`).
        // 2. O segundo parâmetro é um **comparador** que define como a lista será ordenada.
        // O reverseOrder() é um comparador pronto, fornecido pela classe Collections, que ordena os elementos de forma **decrescente**.
        // Ou seja, ele coloca o maior valor primeiro e o menor por último.
        // Se eu quiser uma ordem crescente devo usar 'Collections.sort(arrayDeNumb)' sem o reverseOrder().
        Collections.sort(arrayDeNumb, Collections.reverseOrder());


        for (int i = 0; i < arrayDeNumb.size(); i++) { // Percorre cada posição da lista (usando .size() para saber o tamanho)
            System.out.print(arrayDeNumb.get(i) + " "); // .get(i) acessa o número da posição i da lista
        }

        input.close();
    }
}
