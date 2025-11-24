package domain;

import java.util.Random;

public class ex21 {
    static void main(String[] args) {
        Random gerador = new Random();
        System.out.println("Número aleátorio entre 0 e 100.");
        System.out.println(gerador.nextInt(100));
    }
}
