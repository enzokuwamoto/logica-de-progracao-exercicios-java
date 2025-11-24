package domain;

import java.util.Scanner;

public class ex14 {
    static void main(String[] args) {
        int valorA, valorB, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        valorA = sc.nextInt();
        System.out.println("Digite o primeiro valor:");
        valorB = sc.nextInt();
        System.out.println("Valor antigo de A: " + valorA);
        System.out.println("Valor antigo de B: " + valorB);
        temp = valorA;
        valorA = valorB;
        valorB = temp;
        System.out.println("Valor atual de A: " + valorA);
        System.out.println("Valor atual de B: " + valorB);
    }
}
