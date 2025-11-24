package domain;

import java.util.Scanner;

public class ex13 {
    static void main(String[] args) {
        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = sc.nextLine();
        System.out.println("Digite a idade:");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("O usuário " + nome + " é maior de idade.");
        } else {
            System.out.println("O usuário " + nome + " é menor de idade.");
        }
    }
}
