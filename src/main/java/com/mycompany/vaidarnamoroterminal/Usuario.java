/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class Usuario extends Pessoa{
    //agreableness / concordabilidade
    private int alinhamentoA;
    //extroverssao
    private int alinhamentoE;
    //conciencidade
    private int alinhamentoC;
    //neutoricismo
    private int alinhamentoN;
    //abertura
    private int alinhamentoO;
    
    public Usuario(){
        
    }
    
    public Usuario(int alinhamentoA, int alinhamentoE, int alinhamentoC, int alinhamentoN, int alinhamentoO) {
        this.alinhamentoA = alinhamentoA;
        this.alinhamentoE = alinhamentoE;
        this.alinhamentoC = alinhamentoC;
        this.alinhamentoN = alinhamentoN;
        this.alinhamentoO = alinhamentoO;
    }

    public Usuario(String nome, String idade, String genero, int alinhamentoA, int alinhamentoE, int alinhamentoC,
            int alinhamentoN, int alinhamentoO) {
        super(nome, idade, genero);
        this.alinhamentoA = alinhamentoA;
        this.alinhamentoE = alinhamentoE;
        this.alinhamentoC = alinhamentoC;
        this.alinhamentoN = alinhamentoN;
        this.alinhamentoO = alinhamentoO;
    }

    

    public int getAlinhamentoA() {
        return alinhamentoA;
    }

    public void setAlinhamentoA(int alinhamentoA) {
        this.alinhamentoA = alinhamentoA;
    }

    public int getAlinhamentoE() {
        return alinhamentoE;
    }

    public void setAlinhamentoE(int alinhamentoE) {
        this.alinhamentoE = alinhamentoE;
    }

    public int getAlinhamentoC() {
        return alinhamentoC;
    }

    public void setAlinhamentoC(int alinhamentoC) {
        this.alinhamentoC = alinhamentoC;
    }

    public int getAlinhamentoN() {
        return alinhamentoN;
    }

    public void setAlinhamentoN(int alinhamentoN) {
        this.alinhamentoN = alinhamentoN;
    }

    public int getAlinhamentoO() {
        return alinhamentoO;
    }

    public void setAlinhamentoO(int alinhamentoO) {
        this.alinhamentoO = alinhamentoO;
    }
    
    public void iniciarUsuario(){
        
        this.alinhamentoA = 0;
        this.alinhamentoE = 0;
        this.alinhamentoN = 0;
        this.alinhamentoC = 0;
        this.alinhamentoO = 0;

        
    }
    
    public void increaseAlinhamento(int IndexAtual){
        //primeira pergunta eh pra A
        switch (IndexAtual) {
            case 1:
                this.alinhamentoA += 1;
                break;
            case 2:
                this.alinhamentoE += 1;
                break;
            case 3:
                this.alinhamentoN += 1;
                break;
            case 4:
                this.alinhamentoC += 1;
                break;
            case 5:
                this.alinhamentoO += 1;
                break;
            default:
                break;
        }
    }
    
}
