package ex6;


import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();

        System.out.println("Informe seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Informe seu sexo:");
        String sexo = sc.nextLine();

        System.out.println("Informe sua data de nascimento(dd/MM/aaaa): ");
        String dataNascimento = sc.nextLine();

        System.out.println("Informe sua altura(m): ");
        double altura = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.println("Informe seu peso(kg): ");
        double peso = Double.parseDouble(sc.nextLine().replace(",", "."));

        PerfilDeSaude perfilDeSaude = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);


        System.out.printf(
                "Olá %s %s, segue dados sobre seu perfil de saúde:%n" +
                        "Sexo: %s.%n" +
                        "Data Nascimento: %s.%n" +
                        "Idade: %d.%n" +
                        "Altura: %.2f.%n" +
                        "Peso: %.2f.%n" +
                        "Frequência cardíaca máxima: %d.%n" +
                        "Frequência cardíaca alvo: %.2f - %.2f.%n" +
                        "IMC: %.2f.%n",
                perfilDeSaude.getNome(),
                perfilDeSaude.getSobrenome(),
                perfilDeSaude.getSexo(),
                perfilDeSaude.getDataNascimento(),
                perfilDeSaude.calculaIdade(),
                perfilDeSaude.getAltura(),
                perfilDeSaude.getPeso(),
                perfilDeSaude.frequenciaCardiacaMaxima(),
                perfilDeSaude.frequenciaCardiacaAlvo()[0],
                perfilDeSaude.frequenciaCardiacaAlvo()[1],
                perfilDeSaude.imc()
        );
    }
}
