package universidade.prova;

/*
 * Implementação das regras específicas da Fafifo.
 * Herda de ProvaUniversidade para utilizar a estrutura base.
 */
public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo() {
        // Requisito 1: Média mínima para aprovação na Fafifo é 7.0
        this.mediaMinima = 7.0;
        
        // Requisito 2: Pesos específicos (AV1=1, AV2=1, AV3=3)
        this.p1 = 1; 
        this.p2 = 1; 
        this.p3 = 3;
    }

    @Override
    public double calcularMedia() {
        // Se AV3 for maior que 0, significa que o aluno realizou a prova final
        if (av3 > 0) {
            this.realizouProvaFinal = true; // Atualiza o indicador booleano
            
            // Requisito 4: AV3 é somada às outras notas com seu respectivo peso
            // A soma dos pesos é 5 (1 + 1 + 3)
            return (av1 * p1 + av2 * p2 + av3 * p3) / 5;
        }
        
        // Se não fez AV3, a média é a simples entre AV1 e AV2
        return (av1 + av2) / 2;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        // Retorna o objeto específico de prova final da Fafifo
        return new ProvaFinalFafifo(this);
    }
}

/*
 * Classe de Prova Final específica para a Fafifo.
 */
class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaFafifo prova) {
        // Guarda a referência da prova original para consultar as notas
        this.provaOriginal = prova;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        // Requisito 4: Na Fafifo, só faz AV3 se ainda não atingiu a média mínima
        // Calculamos a média parcial (AV1 e AV2) para verificar a habilitação
        double mediaParcial = (provaOriginal.av1 + provaOriginal.av2) / 2;
        
        return mediaParcial < provaOriginal.mediaMinima;
    }
}
