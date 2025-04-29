package exercises;

import java.util.Scanner;

public class Exercise08_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criação de um array de inteiros com tamanho fixo 3 para armazenar os números digitados
        int[] numb = new int[3];

        // Laço para ler 3 números do usuário e armazená-los no array
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numb[i] = input.nextInt();
        }
        // Ordenação do array em ordem decrescente utilizando o metodo de ordenação manual
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                // Verifica se o número na posição i é menor que o número na posição j
                if (numb[i] < numb[j]) {
                    // Se for, realiza a troca de posições entre os elementos
                    int temp = numb[i]; // Armazena temporariamente o valor de numb[i] para não perder o valor durante a troca
                    numb[i] = numb[j];  // Sobrescreve numb[i] com o valor de numb[j]
                    numb[j] = temp;     // Atribui o valor de temp (original de numb[i]) para numb[j]
                }
            }
        }

        System.out.println("Números em ordem decrescente:");
        for (int i = 0; i < 3; i++) {
            System.out.print(numb[i] + " ");
        }

        input.close();
    }
}
