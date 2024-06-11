
package com.mycompany.vaidarnamoroterminal.Controller;


import com.mycompany.vaidarnamoroterminal.Entity.Questao;
import com.mycompany.vaidarnamoroterminal.Entity.Questionario;


public class QuestionarioController {

    private Questionario questionario;
    Questao questao = new Questao();

    public QuestionarioController() {
        this.questionario = new Questionario();
        
    }

    public Questao getNextQuestion() {
        if (questionario.getPerguntaAtualIndex() >= questionario.getPerguntas().size()) {
            return null;
        }

        Questao proximaPergunta = questionario.getPerguntas().get(questionario.getPerguntaAtualIndex());
        questionario.setPerguntaAtualIndex(questionario.getPerguntaAtualIndex() + 1);
        return proximaPergunta;
    }

    public void restartCounter() {
        questionario.setPerguntaAtualIndex(0);
    }

    public int returnIndex() {
        return questionario.getPerguntaAtualIndex();
    }

    public int getTamanhoPerguntas() {
        return questionario.getPerguntas().size();
    }

    
}
