package universidade.prova;

public abstract class ProvaUniversidade {
    // Atributos Notas e Pesos
    protected double av1, av2, av3;
    protected double p1, p2, p3;
    
    // Atributos de Regra
    protected double mediaMinima;
    protected boolean realizouProvaFinal; 

    // Métodos Abstratos
    public abstract double calcularMedia();
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    // Método Concreto
    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }

    // Método Auxiliar
    public void setNotas(double av1, double av2, double av3) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }
}