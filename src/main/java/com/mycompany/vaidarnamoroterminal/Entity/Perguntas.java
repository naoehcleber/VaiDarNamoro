package com.mycompany.vaidarnamoroterminal.Entity;

public class Perguntas {
    private String FraseP;
    private String A;
    private String B;
    private String C;

    public Perguntas() {
       
    }


    public Perguntas(String fraseP, String respostaA, String respostaB, String respostaC) {
        FraseP = fraseP;
        A = respostaA;
        B = respostaB;
        C = respostaC;
    }
    public String getFraseP() {
        return FraseP;
    }
    public void setFraseP(String fraseP) {
        FraseP = fraseP;
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
