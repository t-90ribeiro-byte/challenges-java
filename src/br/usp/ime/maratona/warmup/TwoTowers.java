package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2014
 * Problema B - The two towers
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class TwoTowers implements Desafio<Integer> {

    @Override
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            BigDecimal height = new BigDecimal(scan.next());
            scan.close();
            
            return height.compareTo(BigDecimal.ONE) == 1 ? 1 : 2;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         
        return null;
    }
    
}
