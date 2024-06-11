
package com.mycompany.vaidarnamoroterminal.Controller;


import com.mycompany.vaidarnamoroterminal.Entity.Questao;
import com.mycompany.vaidarnamoroterminal.Entity.Questionario;
import com.mycompany.vaidarnamoroterminal.Entity.Resposta;

public class QuestionarioController {

    private Questionario questionario;
    Questao questao = new Questao();
    Resposta resposta = new Resposta();
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

    @Override
    public String toString() {
        return "Pergunta: " +  questao.getFraseP()  + "\n" +
               "A: " + resposta.getRespostaA()+ "\n" +
               "B: " + resposta.getRespostaB()+ "\n" +
               "C: " + resposta.getRespostaC() + "\n";
    }
}
