package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Maratona de Programação da SBC - 2016
 * Problema C - Competition
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class Competition implements Desafio<Integer> {
    
    private enum competitor { ALICE, BOB, NO_ONE };
    
    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            
            scan.nextInt(); // number of problems
            int aliceCapacity  = scan.nextInt();
            int bobCapacity    = scan.nextInt();
            
            Set<Integer> problems = new HashSet<>();
          
            int nprob;
            Set<Integer> aliceProbs = new HashSet<>();
            for (nprob = 0; nprob < aliceCapacity; nprob++) 
                aliceProbs.add(scan.nextInt());
            
            Set<Integer> bobProbs = new HashSet<>();
            for (nprob = 0; nprob < bobCapacity; nprob++)
                bobProbs.add(scan.nextInt());
            
            scan.close();
            
            problems.addAll(aliceProbs);
            problems.addAll(bobProbs);
            List<Integer> sortedProblems = new ArrayList<>(problems);
            Collections.sort(sortedProblems);
            
            int switches = -1;
            competitor whoIsSolving = competitor.NO_ONE;
            
            for (Integer prob : sortedProblems) {
                if (aliceProbs.contains(prob) == bobProbs.contains(prob)) continue;
                if (aliceProbs.contains(prob) && whoIsSolving != competitor.ALICE) {
                    whoIsSolving = competitor.ALICE;
                    ++switches;
                }
                else if (bobProbs.contains(prob) && whoIsSolving != competitor.BOB) {
                    whoIsSolving = competitor.BOB;
                    ++switches;
                }
            }
            
            return switches == -1 ? 0 : switches;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
