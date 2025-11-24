package domain;

import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        float salarioMinimo = 1518;
        float salarioUser;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        salarioUser = sc.nextFloat();
        float res = salarioUser / salarioMinimo;
        System.out.printf("O usuário recebe %.2f salários minímos.", res);
    }
}
