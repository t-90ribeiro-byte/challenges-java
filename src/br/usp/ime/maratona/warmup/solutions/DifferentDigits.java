package br.usp.ime.maratona.warmup.solutions;

import br.usp.ime.maratona.warmup.Desafio;

/**
 * Digitos Diferentes
 * 
 * @author Derick de lima xavier - dericklimalr@gmail.com
 * @author Felipe Muhlmann Graf - felipegraf.mg@gmail.com
 * @author Danillo de Oliveira Sanches Gasoto 
 * @author Kleber Freitas dos Santos 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DifferentDigits implements Desafio<Integer> {

    public Integer executar(File input) {
        try {
            Scanner scan=new Scanner(input);
            
        int nInicial=1; 
        int nFinal = 5000;
        boolean repita = false;
        int count = 0, count2=0; 
        String numero = "";
        
        nInicial = scan.nextInt();
        nFinal = scan.nextInt();
        scan.close();
        
        for (int cont = nInicial; cont <= nFinal; cont++) { 
            numero = String.valueOf(cont);
            for (int cont2 = 0; cont2 < numero.length()-1; cont2++) {
                for (int cont3 = cont2+1; cont3 <= numero.length()-1; cont3++) {                  
                    if (numero.charAt(cont2) == numero.charAt(cont3)) {
                        repita = true; 
                        count2++;
                    }
                }
            }
            if (repita==false) {
                count++;
            }
            repita = false;   
        }
        return count;
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DifferentDigits.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}





  