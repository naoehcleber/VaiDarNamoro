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
            

            if(voce.getNome() == null){
                System.out.println("Insira seu nome por favor");
                continue;
            }
            System.out.println("Seja bem vindo " + voce.getNome());
            //imprime a pergunta
            System.out.println(proximaPergunta);
            int IndexAtual = perguntas.returnIndex();
            //passa para a proxima pergunta
            proximaPergunta = perguntas.getNextQuestion();
            
            //pega a resposta com um scanner
            String resposta = input.nextLine();
            // a função get não esta funcionando e não estou sabendo retornar ela
            String respostaCorreta = respostas.get(IndexAtual);
            
            if(resposta.equals(respostas.get(perguntas.returnIndex()))){
                System.out.println("Resposta Certa!");
            }
        }
        
        input.close();  
    }
}
