package com.mycompany.vaidarnamoroterminal.Entity;

import java.util.ArrayList;

public class Questao {
    private String FraseP;
    ArrayList <Resposta> respostas;


    
    public Questao(){
        
    }


    public Questao(String fraseP) {
        this.FraseP = fraseP;
        respostas = new ArrayList<Resposta>();
        respostas.add(new Resposta( "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        respostas.add(new Resposta( "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        respostas.add(new Resposta( "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        respostas.add(new Resposta( "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));
        respostas.add(new Resposta( "A -> Tal coisa", "B -> Tal coisa", "C -> Tal coisa"));

        
    }
    public String getFraseP() {
        return FraseP;
    }
    public void setFraseP(String fraseP) {
        FraseP = fraseP;
    }
   
    //essa parte tem q ta no view
    /*@Override
    public String toString() {
        return "Pergunta: " + FraseP + "\n" +
               "A: " + A + "\n" +
               "B: " + B + "\n" +
               "C: " + C + "\n";
    }*/
    
}
