package com.mycompany.vaidarnamoroterminal.View;

import java.util.Scanner;
import com.mycompany.vaidarnamoroterminal.Controller.EntradaInvalida;
import com.mycompany.vaidarnamoroterminal.Controller.QuestionarioController;
import com.mycompany.vaidarnamoroterminal.Controller.UsuarioController;
import com.mycompany.vaidarnamoroterminal.Controller.VerificarResposta;
import com.mycompany.vaidarnamoroterminal.Entity.Questao;
import com.mycompany.vaidarnamoroterminal.Entity.Usuario;

public class JogarView {
    public static void main(String[] args) throws EntradaInvalida{
        int opcaoPerfil;
        Scanner input = new Scanner(System.in);

        QuestionarioController perguntas = new QuestionarioController();
        VerificarResposta respostas = new VerificarResposta();
        UsuarioController voce = new UsuarioController();
        Usuario usuario = new Usuario();
        int IndexAtual;
        Questao proximaPergunta;
        String respostaJogo;
        String respostaCorreta;

        perguntas.restartCounter();
        System.out.println("Escolha qual perfil para ver a compatibilidade :");
        System.out.println("1 - Padrão");
        System.out.println("2 - Perfil do Usuario");
        opcaoPerfil = input.nextInt();
        if (opcaoPerfil == 1) {
            respostas.lerRespostasArquivo("respostas_padrao.txt");
        } else if (opcaoPerfil == 2) {
            respostas.lerRespostasArquivo("Perfil_usuario.txt");
        }

        while (true) {
            IndexAtual = perguntas.returnIndex();
            proximaPergunta = perguntas.getNextQuestion();
            System.out.println(proximaPergunta);

            input.nextLine();
            respostaJogo = input.nextLine().toUpperCase();

            if (!respostaJogo.equals("A") && !respostaJogo.equals("B") && !respostaJogo.equals("C")) {
                throw new EntradaInvalida("Alternativa invalida !");
            }

            //chama o map pra comparar a resposta da pergunta atual
            respostaCorreta = respostas.getResposta(IndexAtual);

            //debug
            System.out.println(respostaCorreta);
            
            //confere se a resposta dada é igual a resposta certa
            if (respostaJogo.equals(respostaCorreta)) {
                System.out.println("Resposta Certa!");
                //aumenta os acertos
                voce.increaseAcertos();
            } else {
                System.out.println("Resposta Errada!");
                voce.increaseErros();
            }

            //condição de parada
            if (IndexAtual == perguntas.getTamanhoPerguntas() - 1) {
                if (usuario.getAcertos() > usuario.getErros()) {
                    System.out.println("MATCH !");
                    break;
                } else {
                    System.out.println("Hoje não foi seu dia... mais sorte da proxima vez!");
                    break;
                }
            }
        }
        input.close();
    }
}
