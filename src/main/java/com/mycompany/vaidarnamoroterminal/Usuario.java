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
    
    private int alinhamentoA;
    private int alinhamentoE;
    private int alinhamentoC;
    private int alinhamentoN;
    private int alinhamentoO;

    
    public Usuario() {
        
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
    
}
