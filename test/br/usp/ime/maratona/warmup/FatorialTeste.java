package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class FatorialTeste extends DesafioTeste<Integer> {
    
    static {
        _instance = new FatorialTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/Fatorial/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-output/Fatorial/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new Fatorial();
    }
}
