/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Entity;

/**
 *
 * @author João Victor e Beatriz Romero
 */
public class Usuario extends Pessoa{
    private int Acertos;
    private int Erros;

    public Usuario(){
        
    }

    public int getAcertos() {
        return this.Acertos;
    }

    public int getErros() {
        return this.Erros;
    }

    public void setAcertos(int Acertos) {
        this.Acertos = Acertos;
    }

   

    public void setErros(int Erros) {
        this.Erros = Erros;
    }
    
    
}
