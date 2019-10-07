package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class TelefericoTeste extends DesafioTeste<Integer> {

    static {
        _instance = new TelefericoTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/Teleferico/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-output/Teleferico/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new Teleferico();
    }
}
