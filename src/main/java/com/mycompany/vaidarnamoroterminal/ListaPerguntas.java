/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal;
import java.util.*;

/**
 *
 * @author João Victor
 */
public class ListaPerguntas {
   
    List <String> perguntas;
    int perguntaAtualIndex;
    
    public ListaPerguntas(){
        perguntas = new ArrayList<>();
        perguntas.add("Pergunta 1");
        perguntas.add("Pergunta 2");
        perguntas.add("Pergunta 3");
        perguntas.add("Pergunta 4");
        perguntas.add("Pergunta 5");
        perguntas.add("Pergunta 6");
        Collections.shuffle(perguntas);
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
    
    
   
        
    
    
    
}
