package com.mycompany.vaidarnamoroterminal.Entity;

public class Resposta {
    private String A;
    private String B;
    private String C;

    public Resposta(String respostaA, String respostaB, String respostaC) {
        this.A = respostaA;
        this.B = respostaB;
        this.C = respostaC;
    }
    public String getRespostaA() {
        return A;
    }
    public void setRespostaA(String respostaA) {
        A = respostaA;
    }
    public String getRespostaB() {
        return B;
    }
    public void setRespostaB(String respostaB) {
        B = respostaB;
    }
    public String getRespostaC() {
        return C;
    }
    public void setRespostaC(String respostaC) {
        C = respostaC;
    }
}
