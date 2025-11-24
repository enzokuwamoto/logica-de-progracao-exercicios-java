package domain;

import java.util.Calendar;
import java.util.Scanner;

public class ex15 {
    static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int anoNasc, ano;
        Integer anoAtual = dataAtual.get(Calendar.YEAR);
        Integer mesAtual = dataAtual.get(Calendar.MONTH)+1;
        Integer diaDoMesAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

        System.out.println("Digite o ano do seu nascimento");
        anoNasc = sc.nextInt();
        ano = anoAtual - anoNasc;
        System.out.println("Considerando o nascimento no dia 01/01 do ano descrito:");
        System.out.println(ano + " anos, " + mesAtual + " meses e " + diaDoMesAtual + " dias vividos.");
    }
}
