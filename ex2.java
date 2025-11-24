package domain;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = sc.nextInt();
        if (num % 2 == 0 && num > 0) {
            System.out.println("O número " + num + " é par e positivo.");
        } else if (num % 2 == 0 && num < 0){
            System.out.println("O número " + num + " é par e negativo.");
        } else if (num % 2 != 0 && num > 0){
            System.out.println("O número " + num + " é ímpar e positivo.");
        } else {
            System.out.println("O número " + num + " é ímpar e negativo.");
        }
        }
}
