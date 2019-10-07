package br.usp.ime.maratona.warmup;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class TwoTowersTeste extends DesafioTeste<Integer> {

    static {
        _instance = new TwoTowersTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/TwoTowers/";
    }

    @Override
    public String getOutputDirectory() {
        return getInputDirectory();
    }

    @Override
    public Desafio<Integer> getDesafio() {
        return new TwoTowers();
    }
    
}
