/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Model.ListaPerguntas;
import com.mycompany.vaidarnamoroterminal.Model.Pessoa;
import com.mycompany.vaidarnamoroterminal.Model.Respostas;
import com.mycompany.vaidarnamoroterminal.View.Menu;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class VaiDarNamoroTerminal {
    
        
    public static void main(String[] args) throws EntradaInvalida {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        
        ListaPerguntas perguntas = new ListaPerguntas();
        Respostas respostas = new Respostas();
        Pessoa pessoa = new Pessoa();
        Usuario voce = new Usuario();
        
        String proximaPergunta = perguntas.getNextQuestion();
        String nomeUsuario ;
                
        
        //menu e selecao de "modo" de jogo
        menu.exibirMenu();
        int opcaoMenu = input.nextInt();
        
        

        //loop pra inserção de nome
        do{
            System.out.println("Insira seu nome");
            nomeUsuario = input.nextLine().toUpperCase();

                if(nomeUsuario == ""){    
                    throw new EntradaInvalida("Insira seu nome por favor");
                }
                voce.iniciarUsuario();
                voce.setNome(nomeUsuario);
                System.out.println("Seja bem vindo " + voce.getNome());
        }while(nomeUsuario == "");
        
        
        //loop principal do jogo
        while(true){
            //imprime a pergunta
            System.out.println(proximaPergunta);
            int IndexAtual = perguntas.returnIndex();
            System.out.println("Pergunta  " + IndexAtual + ":");
            
            //pega a resposta com um scanner
            String resposta = input.nextLine();
            //capitaliza a entrada 
            resposta.toUpperCase();
            
            while(true){    
                //ve se a resposta eh uma alternativa valida
                if(resposta != "A"|| resposta != "B"|| resposta != "C"){
                    System.out.println("Alternativa invalida");
                } else {break;}
            }
            
            //caso selecione a opcao 1 no menu
            if(opcaoMenu == 1){
                //chama o map pra salvar a resposta da pergunta atual
                String respostaCorreta = respostas.getResposta(IndexAtual);

                //confere se a resposta dada é igual a resposta certa
                if(resposta.equals(respostaCorreta)){
                    System.out.println("Resposta Certa!");
                    //aumenta o alinhamento respectivo
                    voce.increaseAlinhamento(IndexAtual);
                }   
                //condição de parada
                if(proximaPergunta == null){
                    break;
                }

                //debug
                System.out.println("Estatisticas atuais : \n" + "A = "+ voce.getAlinhamentoA() + " " + "E = " + voce.getAlinhamentoE()+ " "  + "C = " + voce.getAlinhamentoC() + " " + "N = " + voce.getAlinhamentoN()+ " "  + "O = " + voce.getAlinhamentoO()+ " " );

                
                } else if (opcaoMenu == 2){
                    respostas.Respostas(resposta);
                    if(proximaPergunta == null){
                        perguntas.perguntaAtualIndex = -1;
                    }
                }
                //passa para a proxima pergunta
                proximaPergunta = perguntas.getNextQuestion();
            
        }
        
        input.close();  
    }
}
