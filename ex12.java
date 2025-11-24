package domain;

import java.util.Scanner;

public class ex12 {
    static void main(String[] args) {
        String produto;
        int opcao;
        double preco, precoFinal;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite o nome do produto:");
            produto = sc.nextLine();
            System.out.println("Digite o valor do produto:");
            preco = sc.nextDouble();

            System.out.println("Tecle a forma de pagamento:");
            System.out.println("[1]. À Vista em Dinheiro ou Pix, recebe 15% de desconto");
            System.out.println("[2]. À Vista no cartão de crédito, recebe 10% de desconto");
            System.out.println("[3]. Parcelado no cartão em duas vezes, preço normal do produto sem juros");
            System.out.println("[4]. Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
            System.out.println("[5]. Sair");
            opcao = sc.nextByte();

            switch (opcao) {
                case 1:
                    precoFinal = preco * 0.85;
                    System.out.println("Parabéns pela compra do " + produto + "! \n Valor final: R$" + precoFinal);
                    break;
                case 2:
                    precoFinal = preco * 0.90;
                    System.out.println("Parabéns pela compra do " + produto + "! \n Valor final: R$" + precoFinal);
                    break;
                case 3:
                    System.out.println("Parabéns pela compra do " + produto + "! \n Valor final: R$" + preco);
                    break;
                case 4:
                    precoFinal = preco * 1.10;
                    System.out.println("Parabéns pela compra do " + produto + "! \n Valor final: R$" + precoFinal);
                    break;
                case 5:
                    System.out.println("Sistema encerrando...");
                    break;
                default:
                    System.out.println("Opção não identificada. Tente novamente!\n");
            }
            } while (opcao != 5);
        }
    }

