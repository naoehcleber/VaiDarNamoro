package com.mycompany.vaidarnamoroterminal.Entity;



public class Questao {
    private String FraseP;
    private String A;
    private String B;
    private String C;

    
    public Questao(){
        
    }


    public Questao(String fraseP,String respostaA, String respostaB, String respostaC) {
        this.FraseP = fraseP;
        this.A = respostaA;
        this.B = respostaB;
        this.C = respostaC;
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

    @Override
    public String toString() {
        return "Pergunta: " +  FraseP  + "\n" +
               "A: " + A + "\n" +
               "B: " + B + "\n" +
               "C: " + C + "\n";
    }
    
    
    
}
