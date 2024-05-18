/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Controller;

/**
 *
 * @author João Victor
 */
public class EntradaInvalida extends Exception {
    public EntradaInvalida(String errorMessage){
        super(errorMessage);
    }
}
