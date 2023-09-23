package ex1;

import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o mês:");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o dia:");
        int dia = Integer.parseInt(sc.nextLine());

        Data novaData = new Data(dia, mes, ano);

        System.out.printf("Data: %d/%d/%d.%n", dia, mes, ano);
    }
}
