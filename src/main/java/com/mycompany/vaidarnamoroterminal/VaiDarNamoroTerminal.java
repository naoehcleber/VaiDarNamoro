/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vaidarnamoroterminal;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class VaiDarNamoroTerminal {
    
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaPerguntas perguntas = new ListaPerguntas();
        Respostas respostas = new Respostas();
        Pessoa pessoa = new Pessoa();
        Usuario voce = new Usuario();
       
        String proximaPergunta = perguntas.getNextQuestion();

        System.out.println("Insira seu nome");
        String nomeUsuario = input.nextLine();           
        voce.iniciarUsuario();
        voce.setNome(nomeUsuario);
        
        while(proximaPergunta != null){
            
            while(voce.getNome() == null){
                if(voce.getNome() == null){
                    System.out.println("Insira seu nome por favor");
                    
                }
                System.out.println("Seja bem vindo " + voce.getNome());
            }
            
            
            //imprime a pergunta
            System.out.println(proximaPergunta);
            int IndexAtual = perguntas.returnIndex();
            System.out.println("Pergunta  " + IndexAtual + ":");
            //passa para a proxima pergunta
            
            
            //pega a resposta com um scanner
            String resposta = input.nextLine();
            //chama o map pra salvar a resposta da pergunta atual
            String respostaCorreta = respostas.getResposta(IndexAtual);
            
            //confere se a resposta dada é igual a resposta certa
            if(resposta.equals(respostaCorreta)){
                System.out.println("Resposta Certa!");
                //aumenta o alinhamento respectivo
                voce.increaseAlinhamento(IndexAtual);
            }
            System.out.println("Estatisticas atuais : \n" + "A = "+ voce.getAlinhamentoA() + " " + "E = " + voce.getAlinhamentoE()+ " "  + "C = " + voce.getAlinhamentoC() + " " + "N = " + voce.getAlinhamentoN()+ " "  + "O = " + voce.getAlinhamentoO()+ " " );
            proximaPergunta = perguntas.getNextQuestion();
        }
        
        input.close();  
    }
}
