package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex8 {
    static void main(String[] args) {
        int num1, num2, num3;
        List<Integer> lista = new ArrayList<>(); // metodo utilizando o array

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        num1 = sc.nextInt();
        lista.add(num1);
        System.out.println("Digite o segundo valor:");
        num2 = sc.nextInt();
        lista.add(num2);
        System.out.println("Digite o terceiro valor:");
        num3 = sc.nextInt();
        lista.add(num3);

        System.out.println("Ordenação Condicional:");
        if ((num1 > num2 && num1 > num3) && (num2 > num3)) { // num1 > num2 > num3
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if ((num1 > num2 && num1 > num3) && (num3 > num2)) { // num1 > num3 > num2
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if ((num2 > num1 && num2 > num3) && (num1 > num3)) { // num2 > num1 > num3
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if ((num2 > num3 && num2 > num1) && (num3 > num1)) { // num2 > num3 > num1
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if ((num3 > num1 && num3 > num2) && (num1 > num2)) { // num3 > num1 > num2
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if ((num3 > num2 && num3 > num1) && (num2 > num1)) { // num3 > num2 > num1
            System.out.println(num3 + " " + num2 + " " + num1);
        }
        // solução inputando na lista e utilizando o metodo de observacao
        System.out.println("Ordenação com lista e método de ordenação");
        bubbleSort(lista);
        System.out.println(lista);

    }

    public static void bubbleSort(List<Integer> lista) {
        int i, j;
        int n = lista.size();
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (lista.get(j) < lista.get(j+1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                }
            }
        }
    }
}

