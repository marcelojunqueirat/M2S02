package ex4;

import java.util.Scanner;

public class TestaFatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da fatura:");
        String numero = sc.nextLine();

        System.out.println("Digite a descrição do item:");
        String descricao = sc.nextLine();

        System.out.println("Digite a quantidade comprada do item:");
        int quantidade = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o preço unitário do item:");
        double precoUnitario = Double.parseDouble(sc.nextLine().replace(",", "."));

        Fatura fatura = new Fatura(numero, descricao, quantidade, precoUnitario);
        System.out.printf("O valor da fatura é: %.2f.%n", fatura.getValorFatura());
    }
}
