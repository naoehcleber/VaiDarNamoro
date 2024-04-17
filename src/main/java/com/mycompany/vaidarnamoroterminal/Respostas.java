/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author João Victor
 */
public class Respostas {
    Map<Integer, String> respostasMap = new HashMap<>();


    private void MapRespostas(){
        //mapa vai receber como key o index do arrayList Perguntas
        //o value vai ser uma string que seja a resposta
        respostasMap.put(1, "A");
        respostasMap.put(2, "C");
        respostasMap.put(3, "B");
        respostasMap.put(4, "A");
        respostasMap.put(4, "A");
        
        
    }
    
    public Respostas(){
        MapRespostas();
    }
    
    public String getResposta(int IndexAtual){
        return respostasMap.get(IndexAtual);
    }

    
    
    
    
}
