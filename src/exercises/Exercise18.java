package exercises;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double francisco = 1.50;
        double sara = 1.10;
        int anos = 0;

        while (francisco > sara) {
            francisco += 0.02;
            sara += 0.03;
            anos++;
        }

        System.out.println("Sara será maior que Francisco em " + anos + " anos.");

        input.close();
    }
}