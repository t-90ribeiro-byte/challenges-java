package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2017
 * Problema A - Fatorial
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class Fatorial implements Desafio<Integer> {
   
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            int numeroInteiro = scan.nextInt();
            scan.close();
            
            int parcela = (int) Math.sqrt(numeroInteiro);
            int soma = 0;
            int qtdNumeros = 0;
            
            while (soma <= numeroInteiro && parcela > 0) {
                long factParcela = 1;
                for (int i = 2; i <= parcela && factParcela < numeroInteiro; ++i)
                    factParcela *= i;
                
                while (soma + factParcela <= numeroInteiro) {
                    soma += factParcela;
                    qtdNumeros++;
                }
                --parcela;
            }
            
            return qtdNumeros;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            
        return -1;        
    }
}
