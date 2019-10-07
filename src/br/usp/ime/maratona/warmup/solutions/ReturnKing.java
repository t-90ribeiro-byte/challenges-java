package br.usp.ime.maratona.warmup.solutions;

import br.usp.ime.maratona.warmup.Desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * A tecla ENTER do Sr. King
 * 
 * @author Andrei Xavier - andrei_xavier@outlook.com
 * @author Edy Lopes Ferreira - edylopes_95@hotmail.com 
 * @author Cristoffer Morais Cardoso - cristoffer.bds@gmail.com 
 * @author Krhistopher Kauling Novak  - krhiskk@gmail.com  
 */
public class ReturnKing implements Desafio<String> {
    
    @Override
    public String executar(File input) {
        
        String notas = "";
        int[] mencoes = new int[100];
        int count = 0;
        float media = 0;
        DecimalFormat mediaStr = new DecimalFormat("#0.00");
        
        try{
            Scanner scan = new Scanner(input);
            notas = scan.next();
            scan.close();
            
            for (int i = notas.length() - 1; i >= 0; i--) {
                
                if (notas.charAt(i) == '0') {
                    
                    mencoes[count] = Integer.parseInt(notas.substring(i-1, i+1));
                    i--;
                }
                else{
                    mencoes[count] = Character.getNumericValue(notas.charAt(i));
                }
                
                count++;
            }
            
            for (int i = 0; i < count; i++) {
                media += mencoes[i];
            }
            
            media /= count;
            
            return mediaStr.format(media).replace(",", ".");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}