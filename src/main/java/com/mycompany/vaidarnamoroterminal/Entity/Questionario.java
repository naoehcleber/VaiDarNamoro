/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Entity;
import java.util.*;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class Questionario {
   
    ArrayList <Questao> perguntas;
    
    private int perguntaAtualIndex;
    
    public Questionario(){
        
        perguntas = new ArrayList<Questao>();
        
        perguntas.add(new Questao("Pergunta 1"));
        perguntas.add(new Questao("Pergunta 2"));
        perguntas.add(new Questao("Pergunta 3"));
        perguntas.add(new Questao("Pergunta 4"));
        perguntas.add(new Questao("Pergunta 5"));
        
        
        
        
    }

    public ArrayList<Questao> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(ArrayList<Questao> perguntas) {
        this.perguntas = perguntas;
    }

    public int getPerguntaAtualIndex() {
        return perguntaAtualIndex;
    }

    public void setPerguntaAtualIndex(int perguntaAtualIndex) {
        this.perguntaAtualIndex = perguntaAtualIndex;
    }
     
    
    
    
    
    
    
   
        
    
    
    
}
