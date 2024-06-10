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
        respostas.add(new Resposta( "A -> Praia", "B -> Restaurante 5 estrelas", "C -> Festa clandestina"));
        respostas.add(new Resposta( "A -> Passear pelo shopping", "B -> Ler e ver filmes", "C -> Dormir"));
        respostas.add(new Resposta( "A -> Livros e filmes", "B -> Um MP3 Player", "C -> Quatro mil e oitocentas bolas de gude"));
        respostas.add(new Resposta( "A -> Forte e corajoso", "B -> Inteligente", "C -> Engracado"));
        respostas.add(new Resposta( "A -> Mantenho minha escolha", "B -> Mudo minha escolha", "C -> Morro"));

        
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
