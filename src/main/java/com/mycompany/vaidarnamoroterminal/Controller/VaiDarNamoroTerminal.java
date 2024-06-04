/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Controller.EntradaInvalida;
import com.mycompany.vaidarnamoroterminal.Controller.Usuario;
import com.mycompany.vaidarnamoroterminal.Entity.Perguntas;
import com.mycompany.vaidarnamoroterminal.Entity.Pessoa;
import com.mycompany.vaidarnamoroterminal.Model.ListaPerguntas;
import com.mycompany.vaidarnamoroterminal.Model.Respostas;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.File;

import java.io.IOException;


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
        
        int opcaoMenu;
        int currentLineFile;
        int IndexAtual;
        int opcaoPerfil;
        String nomeUsuario ;
        String respostaJogo;
        String respostaCorreta;
        Perguntas proximaPergunta;
        
        
        //uso de arquivo + error handling
        try {    
            File file = new File("respostas_padrao.txt");
            File arquivoUsuario = new File("Perfil_Usuario.txt");
            //so abre respostas_padrao.txt se o perfil do usuario nao existir
            if(arquivoUsuario.exists()){
                Scanner leitorArquivo = new Scanner(arquivoUsuario);
                currentLineFile = 0;
                while(leitorArquivo.hasNextLine()){
                    //salva as linhas do arquivo no hashmap de respostas
                    
                    //1) salva as linhas do arquivo em uma variavel String
                    String respostasArquivo = leitorArquivo.nextLine();
                    //2)chama funcao salvarRespostas do objeto respostas pra salvar as respostas(string) e a linha atual do arquivo(index do hashmap)
                    respostas.salvarRespostas(respostasArquivo, currentLineFile);
                    //3)aumenta o contador de linha atual do arquivo
                    currentLineFile++;
                }
                leitorArquivo.close();
            }else if(file.exists()){
                //se o arquivo ja existir a gente le ele com um scanner
                Scanner leitorArquivo = new Scanner(file);
                currentLineFile = 0;
                while(leitorArquivo.hasNextLine()){
                    //salva as linhas do arquivo no hashmap de respostas
                    
                    //1) salva as linhas do arquivo em uma variavel String
                    String respostasArquivo = leitorArquivo.nextLine();
                    //2)chama funcao salvarRespostas do objeto respostas pra salvar as respostas(string) e a linha atual do arquivo(index do hashmap)
                    respostas.salvarRespostas(respostasArquivo, currentLineFile);
                    //3)aumenta o contador de linha atual do arquivo
                    currentLineFile++;
                }
                leitorArquivo.close();
                
            } else {
               //se o arquivo respostas_padrao.txt nao existir ele criar esse arquivo
                file.createNewFile();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
        
        //loop pra inserção de nome
        do{
            System.out.println("Insira seu nome");
            nomeUsuario = input.nextLine().toUpperCase();

                if(nomeUsuario == ""){    
                    throw new EntradaInvalida("Insira seu nome por favor");
                }
                
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
           
            if(opcaoMenu != 1 && opcaoMenu != 2 && opcaoMenu != 0){
                throw new EntradaInvalida("Insira uma opcao valida por favor");
            }
            perguntas.restartCounter();
            //proximaPergunta = perguntas.getNextQuestion();
            
            //caso selecione a opcao 1 no menu
            if(opcaoMenu == 1){
                //seleção de qual perfil vai jogar
                System.out.println("Escolha qual perfil para ver a compatibilidade :");
                System.out.println("1 - Padrão");
                System.out.println("2 - Perfil do Usuario");
                opcaoPerfil = input.nextInt();
                if(opcaoPerfil == 1){
                    respostas.lerRespostasArquivo("respostas_padrao.txt");
                }else if(opcaoPerfil == 2){
                    respostas.lerRespostasArquivo("Perfil_usuario.txt");
                }
                
                while(true){
                //imprime a pergunta
                IndexAtual = perguntas.returnIndex();
                proximaPergunta = perguntas.getNextQuestion();
                System.out.println("Pergunta  " + IndexAtual + ":");
                System.out.println(proximaPergunta);

                input.nextLine();
                //pega a resposta com um scanner
                respostaJogo = input.nextLine();
                //capitaliza a entrada 
                respostaJogo = respostaJogo.toUpperCase();
            
                //ve se a resposta eh uma alternativa valida
                if(!respostaJogo.equals("A")&& !respostaJogo.equals("B")&& !respostaJogo.equals("C")){
                        throw new EntradaInvalida("Alternativa invalida !");
                    } 
                //chama o map pra comparar a resposta da pergunta atual
                respostaCorreta = respostas.getResposta(IndexAtual);
                //debug
                System.out.println(respostaCorreta);
                // 
                //confere se a resposta dada é igual a resposta certa
                if(respostaJogo.equals(respostaCorreta)){
                    System.out.println("Resposta Certa!");
                    //aumenta os acertos
                    voce.increaseAcertos();
                } else {
                    System.out.println("Resposta Errada!");
                    voce.increaseErros();
                }   
                
                //condição de parada
                if(IndexAtual == perguntas.getTamanhoPerguntas()){
                    if(voce.getAcertos() > voce.getErros()){
                        System.out.println("MATCH !");
                        break;
                    } else {
                        System.out.println("Hoje não foi seu dia... mais sorte da proxima vez!");
                        break;
                    } 
                }
                //passa para a proxima pergunta
                
                

                //debug
                //System.out.println("Estatisticas atuais : \n" + "A = "+ voce.getAlinhamentoA() + " " + "E = " + voce.getAlinhamentoE()+ " "  + "C = " + voce.getAlinhamentoC() + " " + "N = " + voce.getAlinhamentoN()+ " "  + "O = " + voce.getAlinhamentoO()+ " " );
                
                
                }
            } else if (opcaoMenu == 2){
                while(true){
                    //imprime a pergunta
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
                    respostaJogo.toUpperCase();

                    //ve se a resposta eh uma alternativa valida
                    if(!respostaJogo.equals("A")&& !respostaJogo.equals("B")&& !respostaJogo.equals("C")){
                        throw new EntradaInvalida("Alternativa invalida !");
                    }


                    respostas.salvarRespostas(respostaJogo, IndexAtual);
                    
                    //condição de parada
                    if(IndexAtual == perguntas.getTamanhoPerguntas()){
                        //passa pra proxima pergunta e verifica se ela é null
                        respostas.arquivarRespostas(respostas.respostas, "Perfil_usuario.txt");
                        break;
                    }
                }
            }else if(opcaoMenu == 0){
                System.out.println("Saindo do programa");
                break;
                
            }
            
            
        }
        
        input.close();  
    }
}
