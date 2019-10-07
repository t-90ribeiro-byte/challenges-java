package br.usp.ime.maratona.warmup;

import br.usp.ime.maratona.warmup.solutions.AutomatedCheckingMachine;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class AutomatedCheckingMachineTeste extends DesafioTeste<String> {
    
    static {
        _instance = new AutomatedCheckingMachineTeste();
    }
    
    @Override
    public String getInputDirectory() {
        return "./maratona-input/AutomatedCheckingMachine/";
    }

    @Override
    public String getOutputDirectory() {
        return "./maratona-input/AutomatedCheckingMachine/";
    }

    @Override
    public Desafio<String> getDesafio() {
        return new AutomatedCheckingMachine();
    }
}
