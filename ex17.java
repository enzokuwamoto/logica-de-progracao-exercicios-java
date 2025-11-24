package domain;

import java.util.Scanner;

public class ex17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tempFahrenheit, tempCelsius;
        System.out.println("Temperatura em °F: ");
        tempFahrenheit = sc.nextFloat();
        tempCelsius = (5 * (tempFahrenheit - 32) / 9);
        System.out.println("Temperatura em °C: " + tempCelsius);
    }
}
