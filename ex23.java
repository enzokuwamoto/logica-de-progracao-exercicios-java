package domain;

import java.util.Scanner;

public class ex23 {
    static void main(String[] args) {
        float valorHoraAula, percentualINSS, salarioLiquido;
        int aulasLecionadasMes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora aula:");
        valorHoraAula = sc.nextFloat();
        System.out.println("Digite o quantas aulas lecionadas:");
        aulasLecionadasMes = sc.nextInt();
        System.out.println("Digite o percentual de desconto INSS:");
        percentualINSS = sc.nextFloat();
        salarioLiquido = (valorHoraAula * aulasLecionadasMes) * (1 - (percentualINSS / 100));
        System.out.println("Salário liquido: R$" + salarioLiquido);
    }
}
