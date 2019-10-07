package br.usp.ime.maratona.warmup;

import java.io.File;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public interface Desafio<T> {
    
    T executar(File input);
}
