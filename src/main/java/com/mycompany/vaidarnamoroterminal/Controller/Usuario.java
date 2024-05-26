/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Model.Pessoa;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class Usuario extends Pessoa{
    private int Acertos;
    private int Erros;

    public int getAcertos() {
        return Acertos;
    }

    public int getErros() {
        return Erros;
    }

    public void setAcertos(int Acertos) {
        this.Acertos = Acertos;
    }

    public void setErros(int Erros) {
        this.Erros = Erros;
    }
    
    public void increaseAcertos(){
        this.Acertos = this.Acertos + 1; 
    }
    
    public void increaseErros(){
        this.Erros = this.Erros + 1; 
    }
}
