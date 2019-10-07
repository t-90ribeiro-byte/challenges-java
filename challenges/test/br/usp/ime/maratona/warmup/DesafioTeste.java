package br.usp.ime.maratona.warmup;

import br.usp.ime.maratona.util.FileHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public abstract class DesafioTeste<T> {
    
    protected static int SUCCESS;
    protected static int FAIL; 
    protected static DesafioTeste _instance;
    
    public abstract String getInputDirectory();
    public abstract String getOutputDirectory();
    public abstract Desafio<T> getDesafio();
    
    public void run() {
        
        SUCCESS = FAIL = 0;
        
        Desafio<T> desafio = getDesafio();
        FileHelper inputFileHelper = new FileHelper(getInputDirectory());
        inputFileHelper.getFiles().stream().filter(f -> !f.getName().endsWith(".sol"))
        .forEach(f -> {
            String inputFileName, outputFileName;    
            inputFileName = f.getName();
            outputFileName = inputFileName.endsWith(".in") ? 
                    inputFileName.replaceFirst("\\.in", "\\.sol") : inputFileName;
            
            T result = desafio.executar(new File(f.getAbsolutePath()));
            File outputFile = new File(getOutputDirectory().concat(outputFileName));
            try {
                try (Scanner scan = new Scanner(outputFile)) {
                    String expected =  scan.next(); 
                    if (String.valueOf(result).equals(expected)) {
                        System.out.println(inputFileName + " --- OK");
                        SUCCESS++;
                    }
                    else {
                        System.out.println(inputFileName + " --- Falha");
                        System.out.printf("Esperado: %s, Encontrado: %s\n", expected, result);
                        FAIL++;
                    }
                    scan.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        
        System.out.printf("Total de Sucessos: %d -- Total de Falhas: %d\n", SUCCESS, FAIL);
    }
    
    public static void main(String[] args) {
        _instance.run();
    }
}
