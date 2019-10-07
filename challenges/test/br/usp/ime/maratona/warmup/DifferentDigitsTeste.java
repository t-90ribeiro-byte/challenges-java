package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class DifferentDigitsTeste extends DesafioTeste<Integer> {
    
    static {
        _instance = new DifferentDigitsTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/DifferentDigits/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-input/DifferentDigits/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new DifferentDigits();
    }
}
