package br.usp.ime.maratona.warmup.solutions;

import br.usp.ime.maratona.warmup.Desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Fatorial
 * 
 * @author Nome do autor 1 - Cristianocristiano099@gmail.com
 * @author Nome do autor 2 - Rafaeldesouza220789@gmail.com
 * @author Nome do autor 3 - wilsonjuan2018@gmail.com 
 * @author Nome do autor 4 - felipeleonardors@gmail.com 
 */
public class Fatorial implements Desafio<Integer> {
   
    @Override
    public Integer executar(File input) {
       
        try {    
            int res;
            int n;
            try (Scanner scan = new Scanner(input)) {
                res = 0;
                n = scan.nextInt();
            }
            
            
            
                while(n >=24){
                    n=n-24;
                    res++;
                }
                while(n >=6){
                    n=n - 6;
                    res++;
                }
                while(n >=2){
                    n=n - 2;
                    res++;
                }
                while(n >=1){
                    n=n - 1;
                    res++;
                }
           
                return res;        
        }catch(FileNotFoundException ex)  {
            
        }
            return null;
    }
}
          
            

            
        

            
       
        
        
    

