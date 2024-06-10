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
        
        perguntas.add(new Questao("Aonde voce gostaria que fosse seu date ideal ?"));
        perguntas.add(new Questao("O que voce gosta de fazer no tempo livre ?"));
        perguntas.add(new Questao("O que voce levaria para uma ilha deserta ?"));
        perguntas.add(new Questao("O seu parceiro ideal tem que ser alguem : "));
        perguntas.add(new Questao("O problema de Monty Hall consiste em um progama de televisao aonde existem 3 portas. Por tras de uma das tres portas existe um carro que sera seu se voce acertar a porta a qual ele esta detras. Voce escolhe uma porta, e o apresentador abre uma das outras duas, sabendo que o carro nao estava detras da porta aberta, o que voce faz ?"));
        
        
        
        
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
