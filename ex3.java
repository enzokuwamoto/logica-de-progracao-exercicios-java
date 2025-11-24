package domain;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        a = sc.nextInt();
        System.out.println("Digite o valor de b:");
        b = sc.nextInt();
        if (a == b) {
            c = a + b;
            System.out.println("O valor de a e b são iguais, portanto a soma entre os dois valores é " + c);
        } else {
            c = a * b;
            System.out.println("O valor de a e b são diferentes, portanto a multiplicação entre os dois valores é " + c);
        }
    }
}
