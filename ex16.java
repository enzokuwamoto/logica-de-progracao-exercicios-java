package domain;

import java.util.Scanner;

public class ex16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o valor do primeiro lado do triângulo:");
        a = sc.nextInt();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        b = sc.nextInt();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        c = sc.nextInt();
        if (a == b && b == c && a == c){
            System.out.println("Triângulo Equilátero.");
        } else if (a != b && b != c && a != c){
            System.out.println("Triângulo Escaleno.");
        } else {
            System.out.println("Triângulo Isósceles.");
        }
    }
}
