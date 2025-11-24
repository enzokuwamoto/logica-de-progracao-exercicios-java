package domain;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex9 {
    static void main(String[] args) {
        int peso;
        float altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        peso = sc.nextInt();
        System.out.println("Digite sua altura:");
        altura = sc.nextFloat();
        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal (Parabéns).");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II. (severa)");
        } else {
            System.out.println("Obesidade grau III. (mórbida)");
        }
    }
}
