package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class ReturnKingTeste extends DesafioTeste<String> {
    
    static {
        _instance = new ReturnKingTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/ReturnKing/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-input/ReturnKing/";
    }

    @Override
    public Desafio<String> getDesafio() {
        return new ReturnKing();
    } 
}
