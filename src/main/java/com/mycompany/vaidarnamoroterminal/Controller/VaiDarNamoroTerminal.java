package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Controller.EntradaInvalida;
import com.mycompany.vaidarnamoroterminal.Controller.Usuario;
import com.mycompany.vaidarnamoroterminal.Entity.Perguntas;
import com.mycompany.vaidarnamoroterminal.Entity.Pessoa;
import com.mycompany.vaidarnamoroterminal.Entity.Questionario;
import com.mycompany.vaidarnamoroterminal.Model.ListaPerguntas;
import com.mycompany.vaidarnamoroterminal.Model.Respostas;

import java.util.Scanner;
import java.io.File;

import java.io.FileWriter;
import java.io.BufferedWriter;



import java.io.IOException;

public class VaiDarNamoroTerminal {

    public static void main(String[] args) throws EntradaInvalida {
        Scanner input = new Scanner(System.in);

        //ListaPerguntas perguntas = new ListaPerguntas();
        //Respostas respostas = new Respostas();
        //Pessoa pessoa = new Pessoa();
        //Usuario voce = new Usuario();

        int opcaoMenu;
        int currentLineFile;
        int IndexAtual;
        int opcaoPerfil;
        String nomeUsuario;
        String respostaJogo;
        String respostaCorreta;
        Questionario proximaPergunta;

        

        do {
            System.out.println("Insira seu nome");
            nomeUsuario = input.nextLine().toUpperCase();

            if (nomeUsuario.equals("")) {
                throw new EntradaInvalida("Insira seu nome por favor");
            }

            voce.setNome(nomeUsuario);
            System.out.println("Seja bem vindo " + voce.getNome());
        } while (nomeUsuario.equals(""));

        while (true) {
            System.out.println("1 - Comecar Jogo");
            System.out.println("2 - Criar Perfil");
            System.out.println("0 - Sair");
            opcaoMenu = input.nextInt();

            if (opcaoMenu != 1 && opcaoMenu != 2 && opcaoMenu != 0) {
                throw new EntradaInvalida("Insira uma opcao valida por favor");
            }

            if (opcaoMenu == 1) {
                
            } else if (opcaoMenu == 2) {
                while (true) {
                    IndexAtual = perguntas.returnIndex();
                    proximaPergunta = perguntas.getNextQuestion();
                    System.out.println("Pergunta  " + IndexAtual + ":");
                    System.out.println(proximaPergunta);

                    //limpa o buffer
                    //to do : corrijir limpeza de buffer pra nao ficar tendo que inserir linha vazia
                    input.nextLine();
                    //pega a resposta com um scanner
                    respostaJogo = input.nextLine();
                    
                    //capitaliza a entrada 
                    respostaJogo = respostaJogo.toUpperCase();


                    if (!respostaJogo.equals("A") && !respostaJogo.equals("B") && !respostaJogo.equals("C")) {
                        throw new EntradaInvalida("Alternativa invalida !");
                    }

                    respostas.salvarRespostas(respostaJogo, IndexAtual);

                    
                     if(IndexAtual == perguntas.getTamanhoPerguntas() - 1){
                        //passa pra proxima pergunta e verifica se ela é null
                        respostas.arquivarRespostas(respostas.respostas, "Perfil_usuario.txt");
                        break;
                    }
                }
            
            } else if (opcaoMenu == 0) {
                System.out.println("Saindo do programa");
                break;
            }
        }
    

        input.close();
    }
}
