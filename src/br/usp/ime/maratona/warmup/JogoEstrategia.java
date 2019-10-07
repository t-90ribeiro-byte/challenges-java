package br.usp.ime.maratona.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Maratona de Programação da SBC - 2017
 * Problema B - Aquecimento
 * 
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class JogoEstrategia implements Desafio<Integer> {

    public Integer executar(File input) {
        
        try {
            Scanner scan = new Scanner(input);
            int numJogadores = scan.nextInt();
            scan.nextInt(); // numero de rodadas
            int[] pontuacao = new int[numJogadores];

            int jogador;
            for (jogador = 0; jogador < numJogadores; pontuacao[jogador++] = 0);

            jogador = 0;
            while (scan.hasNext()) 
               pontuacao[jogador++ % numJogadores] += scan.nextInt();

            int maxPontos = 0;
            int vencedor  = 0;
            for (jogador = 0; jogador < numJogadores; ++jogador) {
                if (pontuacao[jogador] >= maxPontos) {
                    vencedor = jogador;
                    maxPontos = pontuacao[jogador];
                }
            }
            
            scan.close();
            
            return ++vencedor;
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
                    
        return -1;
    }
}
