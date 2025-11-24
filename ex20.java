package domain;

import java.util.Scanner;

public class ex20 {
    static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para printar a sua tabuada:");
        num = sc.nextInt();
        System.out.println("Tabuada do " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
