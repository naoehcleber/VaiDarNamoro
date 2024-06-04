
package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Model.ListaPerguntas;

import com.mycompany.vaidarnamoroterminal.Entity.Perguntas;

public class ListaPerguntasController {
    
    private ListaPerguntas lista;
    
    
    public ListaPerguntasController(ListaPerguntas lista) {
        this.lista = lista;
        
    }
    
    public void proximaPergunta() {
        Perguntas pergunta = lista.getNextQuestion();
    }
    
    public void reiniciarJogo() {
        lista.restartCounter();
    }
    
    public int getTamanhoPerguntas() {
        return lista.getTamanhoPerguntas();
    }
}
 
    

