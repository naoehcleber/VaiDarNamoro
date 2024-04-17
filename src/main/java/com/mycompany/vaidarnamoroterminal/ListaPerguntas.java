/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal;
import java.util.*;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class ListaPerguntas {
   
    List <String> perguntas;
    int perguntaAtualIndex;
    
    public ListaPerguntas(){
        perguntas = new ArrayList<>();
        perguntas.add("Pergunta de A \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta de E \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta de C \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta de N \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta de O \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        perguntas.add("Pergunta de todas \n A ->Tal coisa \n B -> Tal coisa \n C -> Tal coisa");
        
        perguntaAtualIndex = 0;
    }
    
    public String getNextQuestion(){
        if(perguntaAtualIndex >= perguntas.size()){
            return null;
        }
        String proximaPergunta = perguntas.get(perguntaAtualIndex);
        perguntaAtualIndex += 1;
        return proximaPergunta;
    }
    public int returnIndex(){
        return perguntaAtualIndex;
    }
    
    
   
        
    
    
    
}
