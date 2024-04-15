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
        perguntas.add("Pergunta de A");
        perguntas.add("Pergunta de E");
        perguntas.add("Pergunta de C");
        perguntas.add("Pergunta de N");
        perguntas.add("Pergunta de O");
        perguntas.add("Pergunta de todas");
        
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
