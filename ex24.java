package domain;

import java.util.Scanner;

public class ex24 {
    static void main(String[] args) {
        int kmporlitro = 12, tempoGasto, velocidadeMedia;
        float distanciaPercorrida, litrosUsados;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tempo gasto na viagem (h):");
        tempoGasto = sc.nextInt();
        System.out.println("Digite a velocidade média na viagem:");
        velocidadeMedia = sc.nextInt();
        distanciaPercorrida = tempoGasto * velocidadeMedia;
        litrosUsados = distanciaPercorrida / kmporlitro;
        System.out.println("A distância percorrida foi de " + distanciaPercorrida + "km.");
        System.out.printf("Foram utilizados %.2f l.", litrosUsados);
    }
}
