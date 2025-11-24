package domain;

import java.util.Scanner;

public class ex10 {
    static void main(String[] args) {
        float n1, n2, n3, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota do aluno:");
        n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota do aluno:");
        n3 = sc.nextFloat();
        media = (n1 + n2 + n3) / 3;
        System.out.printf("Média do aluno: %.2f", media);
    }
}
