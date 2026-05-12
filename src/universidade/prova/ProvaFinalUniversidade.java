package universidade.prova;

public abstract class ProvaFinalUniversidade {
    protected double notaFinal;
    protected double pesoFinal;
    protected boolean realizouProva;
    protected ProvaUniversidade provaOriginal;

    public abstract boolean habilitadoRealizarProva();
}

// Classe para a Prova Final da UCB
class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade prova) {
        this.provaOriginal = prova;
        this.pesoFinal = 1.0; // Peso padrão da UCB
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Regra: Pode fazer AV3 mesmo já aprovado
        return true; 
    }
}

// Classe para a Prova Final da Fafifo
class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade prova) {
        this.provaOriginal = prova;
        this.pesoFinal = 3.0; // Peso padrão da Fafifo para AV3
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Regra: Só faz AV3 se ainda não atingiu a média (6.0)
        double mediaParcial = (provaOriginal.av1 + provaOriginal.av2) / 2;
        return mediaParcial < provaOriginal.mediaMinima;
    }
}