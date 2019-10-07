package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2015
 * Problema B - The return of the King
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class ReturnKing implements Desafio<String> {
    
    private static final DecimalFormat decimalFormat = 
            new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
    
    @Override
    public String executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            String digits[] = scan.nextLine().split("");
            scan.close();
            
            double sum = 0;
            int numGrades = 0;
            for (int pos = 0; pos < digits.length; ++pos) {
                if (digits[pos].equals("1") && pos+1 < digits.length && digits[pos+1].equals("0")) {
                    sum += 10;
                    ++pos;
                    ++numGrades;
                }
                else {
                    sum += new Integer(digits[pos]);
                    ++numGrades;
                }
            }
            
            return decimalFormat.format(new BigDecimal(sum / numGrades)
                    .setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue());
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
