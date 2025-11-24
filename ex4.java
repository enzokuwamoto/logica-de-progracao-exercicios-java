package domain;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        int num, ant, suc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para descobrir o seu antecessor e sucessor:");
        num = sc.nextInt();
        ant = num - 1;
        suc = num + 1;
        System.out.println("O antecessor de " + num + " é " + ant + " e o seu sucessor é " + suc);
    }
}
