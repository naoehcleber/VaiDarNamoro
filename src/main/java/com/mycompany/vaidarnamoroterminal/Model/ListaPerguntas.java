/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Model;
import java.util.*;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class ListaPerguntas {
   
    ArrayList <String> perguntas;
    public int perguntaAtualIndex = 0;
    
    public ListaPerguntas(){
        perguntas = new ArrayList<>();
        perguntas.add("Pergunta  1 \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta  2 \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta  3 \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta  4 \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta  5 \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        
        
        
        
    }
    
    public String getNextQuestion(){
        if(perguntaAtualIndex >= perguntas.size()){
            return null;
        }
        String proximaPergunta = perguntas.get(perguntaAtualIndex);
        this.perguntaAtualIndex += 1;
        return proximaPergunta;
        
    }
    
    public void restartCounter(){
        this.perguntaAtualIndex = 0;
    }
    public int returnIndex(){
        return perguntaAtualIndex;
    }
    
    
   
        
    
    
    
}
