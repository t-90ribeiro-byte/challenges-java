package br.usp.ime.maratona.warmup.solutions;

import br.usp.ime.maratona.warmup.Desafio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Jogo de Estratégia
 * 
 * @author Nome do autor 1 - email
 * @author Nome do autor 2 - email 
 * @author Nome do autor 3 - email 
 * @author Nome do autor 4 - email 
 */
public class JogoEstrategia implements Desafio<Integer> {

    @Override
    public Integer executar(File input) {
    
        
        try {
            Scanner scan = new Scanner(input);
            
            int nJogadores = 0;                     //recebe o numero de jogadores
            int nRodadas = 0;                       //recebe o numero de rodadas
            int[] pontos;                           //vetor para ler os pontos feitos em cada rodadas
            int[] pontosJogadores;                  //armazena a pontuação final de cada jogador
            int jogador = 0;                        //indica qual o jogador na vez para somar seu total de pontos feitos
            int pontuacao = 0;                      //utilizada para verificar o maior pontuador
            int vencedor = 0;                       //armazena o numero correspondente ao jogador vencedor
            
            nJogadores = scan.nextInt();
            nRodadas = scan.nextInt();
            
            pontos = new int[nJogadores*nRodadas];
            pontosJogadores = new int[nJogadores];
            
            //armazenando os pontos de todos os jogadores feitos nas rodadas
            for (int i = 0; i < pontos.length; i++) {
                pontos[i] = scan.nextInt();
            }
            
            scan.close();   //finaliza leitura dos dados
            
            //passando a pontuação total para cada jogador
            for (int i = 0; i < pontos.length; i++) {
                pontosJogadores[jogador] += pontos[i];
                
                jogador++;
                
                if (jogador == nJogadores) {    //voltando ao jogador 1
                    jogador = 0;
                }
            }
            
            //processo de verificação do vencedor
            for (int i = 0; i < nJogadores; i++) {
                for (int j = 0; j < nJogadores; j++) {
                    if (pontosJogadores[i] >= pontosJogadores[j]) {
                        pontuacao++;
                    }
                }
                
                if (pontuacao == nJogadores) {
                    vencedor = i + 1;
                }
                
                pontuacao = 0;
            }
            
            return vencedor;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JogoEstrategia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
