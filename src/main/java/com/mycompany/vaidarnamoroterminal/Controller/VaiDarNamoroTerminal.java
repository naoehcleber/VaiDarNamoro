/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Controller.EntradaInvalida;
import com.mycompany.vaidarnamoroterminal.Controller.Usuario;
import com.mycompany.vaidarnamoroterminal.Model.ListaPerguntas;
import com.mycompany.vaidarnamoroterminal.Model.Pessoa;
import com.mycompany.vaidarnamoroterminal.Model.Respostas;

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
      
        
        ListaPerguntas perguntas = new ListaPerguntas();
        Respostas respostas = new Respostas();
        Pessoa pessoa = new Pessoa();
        Usuario voce = new Usuario();
        
        String proximaPergunta = perguntas.getNextQuestion();
        String nomeUsuario ;
        int opcaoMenu;
        
        
        
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
            //to do: trocar para interface de usuario Swing/JFrame
            //menu e selecao de "modo" de jogo
            System.out.println("1 - Comecar Jogo");
            System.out.println("2 - Criar Perfil");
            System.out.println("0 - Sair");
            opcaoMenu = input.nextInt();
           
            if(opcaoMenu != 1 && opcaoMenu != 2 && opcaoMenu != 3){
                throw new EntradaInvalida("Insira uma opcao valida por favor");
            }
            
            //caso selecione a opcao 1 no menu
            if(opcaoMenu == 1){
                while(true){
                //imprime a pergunta
                int IndexAtual = perguntas.returnIndex();
                System.out.println("Pergunta  " + IndexAtual + ":");
                System.out.println(proximaPergunta);


                //pega a resposta com um scanner
                String resposta = input.nextLine();
                //capitaliza a entrada 
                resposta.toUpperCase();
            
                //ve se a resposta eh uma alternativa valida
                if(!resposta.equals("A")&& !resposta.equals("C")&& !resposta.equals("C")){
                        throw new EntradaInvalida("Alternativa invalida !");
                    }
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
                
                //passa para a proxima pergunta
                proximaPergunta = perguntas.getNextQuestion();
                }
            } else if (opcaoMenu == 2){
                while(true){
                    //imprime a pergunta
                    int IndexAtual = perguntas.returnIndex();
                    System.out.println("Pergunta  " + IndexAtual + ":");
                    System.out.println(proximaPergunta);
                    //limpa o buffer
                    //to do : corrijir limpeza de buffer pra nao ficar tendo que inserir linha vazia
                    input.nextLine();
                    //pega a resposta com um scanner
                    String resposta = input.nextLine();
                    //capitaliza a entrada 
                    resposta.toUpperCase();

                    //ve se a resposta eh uma alternativa valida
                    if(!resposta.equals("A")&& !resposta.equals("B")&& !resposta.equals("C")){
                        throw new EntradaInvalida("Alternativa invalida !");
                    }


                    respostas.salvarRespostas(resposta, IndexAtual);
                    if(proximaPergunta == null){
                        break;
                    }
                    //passa para a proxima pergunta
                    proximaPergunta = perguntas.getNextQuestion();
                }
            }else if(opcaoMenu == 0){
                System.out.println("Saindo do programa");
                break;
                
            }
            
            
        }
        
        input.close();  
    }
}
