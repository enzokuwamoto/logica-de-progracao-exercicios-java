package domain;

import java.util.Scanner;

public class ex11 {
    static void main(String[] args) {
        String nome;
        float n1, n2, n3, n4, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        nome = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno:");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota do aluno:");
        n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota do aluno:");
        n3 = sc.nextFloat();
        System.out.println("Digite a quarta nota do aluno:");
        n4 = sc.nextFloat();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Aluno: " + nome);
        System.out.printf("Média do aluno: %.2f", media);
        if (media >= 7){
            System.out.println("\nAprovado!");
        } else {
            System.out.println("\nReprovado!");
        }
    }
}
