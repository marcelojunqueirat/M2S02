package ex3;

public class Retangulo {
    private double comprimento = 1.0;
    private double largura = 1.0;

    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0.0 && comprimento < 20.0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Comprimento deve ser entre 0 e 20.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Largura deve ser entre 0 e 20.");
        }
    }

    public double perimettro() {
        return (this.largura + this.comprimento) * 2;
    }

    public double area() {
        return this.largura * this.comprimento;
    }
}
