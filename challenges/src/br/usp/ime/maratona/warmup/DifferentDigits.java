package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2016
 * Problema B - Different Digits
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class DifferentDigits implements Desafio<Integer> {
    
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            int min = scan.nextInt();
            int max = scan.nextInt();
            scan.close();
            
            int numHouses = 0;
            
            int[] countDigits = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            boolean hasRepeated;
            for (int house = min; house <= max; ++house) {
                
                String houseDigits[] = String.valueOf(house).split("");
                hasRepeated = false;
                
                for (String digit : houseDigits) 
                    ++countDigits[new Integer(digit)];
                
                for (int d = 0; d < countDigits.length; ++d) {
                    if (countDigits[d] > 1) hasRepeated = true;
                    countDigits[d] = 0;
                }
                
                if (!hasRepeated) ++numHouses;
            }

            return numHouses;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
