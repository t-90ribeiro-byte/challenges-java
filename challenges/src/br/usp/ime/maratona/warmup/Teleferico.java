package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2017
 * Problema C - Teleferico
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class Teleferico implements Desafio<Integer> {
    
    @Override
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            int capacidade = scan.nextInt();
            int alunos = scan.nextInt(); 
            scan.close();
            
            --capacidade; // lugar do monitor
            
            int telefericoCheio = alunos / capacidade;
            int excedente = alunos % capacidade;
            
            if (excedente == 0)
                return telefericoCheio;
            else 
                return telefericoCheio + 1;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            
        return null;
    }
}
