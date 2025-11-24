package domain;

import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        boolean operador1, operador2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro operador booleano:");
        operador1 = sc.nextBoolean();
        System.out.println("Digite o segundo operador booleano:");
        operador2 = sc.nextBoolean();
        if (operador1 == false && operador2 == false) {
            System.out.println("Ambos operadores falsos.");
        } else if (operador1 == true && operador2 == true) {
            System.out.println("Ambos operadores verdadeiros.");
        } else {
            System.out.println("Operadores distintos.");
        }
    }
}