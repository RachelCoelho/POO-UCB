package universidade.prova;

public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB() {
        this.mediaMinima = 7.0; // Regra UCB
        this.p1 = 1; this.p2 = 1; this.p3 = 1; // Pesos iguais a 1
    }

    @Override
    public double calcularMedia() {
        // Regra: Substitui a menor nota entre AV1 e AV2
        if (av3 > 0) {
            double menor = Math.min(av1, av2);
            if (av3 > menor) {
                this.realizouProvaFinal = true;
                return (av1 + av2 + av3 - menor) / 2;
            }
        }
        return (av1 + av2) / 2;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}

class ProvaAV3UCB extends ProvaFinalUniversidade {
    public ProvaAV3UCB(ProvaUCB prova) {
        this.provaOriginal = prova;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return true; 
    }
}
