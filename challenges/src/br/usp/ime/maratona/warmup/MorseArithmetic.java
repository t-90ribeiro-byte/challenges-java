package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Maratona de Programação da SBC - 2013
 * Problema A - Arithmetic with Morse
 * 
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class MorseArithmetic implements Desafio<Integer> {

    private static final Set<String> morseOperators = 
            new HashSet<>(Arrays.asList(new String[] { "+", "*" }));
    
    private static Map<String, Integer> morseNumbers;    
    static {
        morseNumbers = new HashMap<>();
        morseNumbers.put(".", 1);
        morseNumbers.put("-", 5);
        morseNumbers.put(":", 2);
        morseNumbers.put("=", 10);
    }
    
    @Override
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            scan.nextInt(); // number of operators
            String  expression = new String();
            while (scan.hasNext())
            expression = expression.concat(scan.next());
            scan.close();
            int value = 0;
            
            String[] characters = expression.replaceAll("\\s", "").split("");
            
            int pos;
            for (pos = 0; pos < characters.length; ++pos) {
                
                if (characters[pos].equals("*")) {
                    int multiplying1 = 0;
                    int multiplying2 = 0;
                    
                    int temp = pos - 1;
                    while (temp >= 0 && !morseOperators.contains(characters[temp])) {
                        multiplying1 += morseNumbers.containsKey(characters[temp]) ? 
                            morseNumbers.get(characters[temp]) : Integer.valueOf(characters[temp]);
                        characters[temp--] = "0";
                    }
                    
                    temp = pos + 1;
                    while (temp < characters.length && !morseOperators.contains(characters[temp])) {
                        multiplying2 += morseNumbers.containsKey(characters[temp]) ? 
                            morseNumbers.get(characters[temp]) : Integer.valueOf(characters[temp]);
                        characters[temp++] = "0";
                    }
                    
                    characters[pos] = String.valueOf(multiplying1 * multiplying2);
                }
            }
            
            morseNumbers.put("+", 0);
            
            for (pos = 0; pos < characters.length; ++pos) 
                value += morseNumbers.containsKey(characters[pos]) ? 
                        morseNumbers.get(characters[pos]) : Integer.valueOf(characters[pos]);
            
            return value;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
                    
        return null;
    }
    
}
