package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class CompetitionTeste extends DesafioTeste<Integer> {
    
    static {
        _instance = new CompetitionTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/Competition/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-input/Competition/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new Competition();
    }
}
