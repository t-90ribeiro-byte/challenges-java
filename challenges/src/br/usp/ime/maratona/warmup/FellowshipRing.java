package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2015
 * Problema A - The Fellowship of the ring
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class FellowshipRing implements Desafio<Integer> {
    
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            
            int waist = scan.nextInt();
            int neck = scan.nextInt();
            int numPunches = scan.nextInt();
            
            int fairPunches = 0;
            int punch;
            for (int p = 0; p < numPunches; ++p) {
                punch = scan.nextInt();
                if (punch >= waist && punch <= neck) ++fairPunches;
            }
            
            scan.close();
            
            return fairPunches;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return -1;
    }    
}
