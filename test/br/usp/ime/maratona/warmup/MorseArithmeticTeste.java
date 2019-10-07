package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class MorseArithmeticTeste extends DesafioTeste<Integer> {
    
    static {
        _instance = new MorseArithmeticTeste();
    }

    @Override
    public String getInputDirectory() {
        return "./maratona-input/MorseArithmetic/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-output/MorseArithmetic/";
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new MorseArithmetic();
    }
    
}
