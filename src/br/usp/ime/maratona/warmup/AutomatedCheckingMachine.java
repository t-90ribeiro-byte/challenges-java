package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2016
 * Problema A - Automated Checking Machine
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class AutomatedCheckingMachine implements Desafio<String> {
    
    private static final String YES = "Y";
    private static final String NO = "N";
    private static final int CONNECTION_POINTS = 5;
    
    public String executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            
            int plug;
            BitSet firstConnector = new BitSet(CONNECTION_POINTS);
            for (plug = 0; plug < CONNECTION_POINTS; ++plug) 
                firstConnector.set(plug, scan.nextInt() != 0);
            
            BitSet secondConnector = new BitSet(CONNECTION_POINTS);
            for (plug = 0; plug < CONNECTION_POINTS; ++plug) 
                secondConnector.set(plug, scan.nextInt() != 0);
            
            scan.close();
            
            firstConnector.xor(secondConnector);

            boolean compatible = true;
            for (plug = 0; plug < CONNECTION_POINTS; ++plug) {
                if (!firstConnector.get(plug)) {
                    compatible = false;
                    break;
                }
            }
            
            return compatible ? YES : NO;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
