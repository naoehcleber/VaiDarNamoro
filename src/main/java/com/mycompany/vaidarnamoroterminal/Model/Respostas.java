/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Model;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


/**
 *
 * @author João Victor
 */
public class Respostas {
    Map<Integer, String> respostasMap = new HashMap<>();
    ArrayList <String> respostas;
    
    public Respostas(){
        //to do : passar como parametro as respostas da VITIMA.
        //inicia o arraylist
       respostas = new ArrayList<>(5);
       //inicia todos os valores do arraylist com uma string vazia
       for(int i =0; i < 5; i++){
            respostas.add("");
        }
       
        MapRespostas(respostas);
    }
    
    
    public void salvarRespostas(String respostaMain, int index){
        
        respostas.set(index, respostaMain);
    
    }
        
    
    public void updateResposta(String resposta, int index){
        respostas.set(index, resposta);
    }

    public void MapRespostas(ArrayList<String> respostas){
        //mapa vai receber como key o index do arrayList Perguntas
        //o value vai ser uma string que seja a resposta
        //to do : mudar o value pra ser um elemento de outro arrayList para poder implementar novos perfis.
        respostasMap.put(1, respostas.get(0));
        respostasMap.put(2, respostas.get(1));
        respostasMap.put(3, respostas.get(2));
        respostasMap.put(4, respostas.get(3));
        respostasMap.put(5, respostas.get(4));
        
        
    }
    
    
    public String getResposta(int IndexAtual){
        return respostasMap.get(IndexAtual);
    }
    
}
