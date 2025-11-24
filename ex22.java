package domain;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex22 {
    static void main() {
        int dividendo, divisor, resto;
        float resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        dividendo = sc.nextInt();
        System.out.println("Digite o divisor: ");
        divisor = sc.nextInt();
        resto = dividendo % divisor;
        resultado = dividendo / divisor;
        System.out.println("Resultado: " + resultado);
        System.out.println("Resto: " + resto);
    }
}
