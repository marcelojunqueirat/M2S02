package ex5;

import java.util.Scanner;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();

        System.out.println("Informe seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Informe sua data de nascimento(dd/MM/aaaa): ");
        String dataNascimento = sc.nextLine();

        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca(nome, sobrenome, dataNascimento);

        System.out.printf(
                "Olá %s %s, com base na sua data de nascimento: %s, segue dados sobre sua frequência cardíaca:%n" +
                        "Idade: %d.%n" +
                        "Frequência cardíaca máxima: %d.%n" +
                        "Frequência cardíaca alvo: %.2f - %.2f.%n",
                frequenciaCardiaca.getNome(),
                frequenciaCardiaca.getSobrenome(),
                frequenciaCardiaca.getDataNascimento(),
                frequenciaCardiaca.calculaIdade(),
                frequenciaCardiaca.frequenciaCardiacaMaxima(),
                frequenciaCardiaca.frequenciaCardiacaAlvo()[0],
                frequenciaCardiaca.frequenciaCardiacaAlvo()[1]
        );
    }
}
