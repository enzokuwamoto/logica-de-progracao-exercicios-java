package domain;

import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        int valor;
        double ajustado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        valor = sc.nextInt();
        ajustado = valor + (valor * 0.05);
        System.out.println("Valor reajustado: " + ajustado);
    }
}
