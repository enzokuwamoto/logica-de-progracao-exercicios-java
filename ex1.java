package domain;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        int a, b, c, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        a = sc.nextInt();
        System.out.println("Digite o valor de b:");
        b = sc.nextInt();
        System.out.println("Digite o valor de c:");
        c = sc.nextInt();
        soma = a + b;
        if (soma > c) {
            System.out.println("A soma entre " + a + " e " + b + " é maior que " + c);
        } else if (soma < c) {
            System.out.println("A soma entre " + a + " e " + b + " é menor que " + c);
        } else {
            System.out.println("A soma entre " + a + " e " + b + " é igual a " + c);
        }
    }
}
