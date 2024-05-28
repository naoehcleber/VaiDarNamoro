/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Model;
import java.util.*;

import com.mycompany.vaidarnamoroterminal.Entity.Perguntas;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class ListaPerguntas {
   
    ArrayList <Perguntas> perguntas;
    public int perguntaAtualIndex = 0;
    
    public ListaPerguntas(){
        perguntas = new ArrayList<Perguntas>();
        
        perguntas.add(new Perguntas("Pergunta 1", "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        perguntas.add(new Perguntas("Pergunta 2", "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        perguntas.add(new Perguntas("Pergunta 3", "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        perguntas.add(new Perguntas("Pergunta 4", "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        perguntas.add(new Perguntas("Pergunta 5", "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        
        
        
    }
    
    public Perguntas getNextQuestion(){
        if(perguntaAtualIndex >= perguntas.size()){
            return null;
        }

        Perguntas proximaPergunta = perguntas.get(perguntaAtualIndex);
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
