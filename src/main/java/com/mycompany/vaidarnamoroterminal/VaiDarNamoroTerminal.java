/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vaidarnamoroterminal;

import java.util.Scanner;

/**
 *
 * @author João Victor
 */
public class VaiDarNamoroTerminal {
        
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaPerguntas perguntas = new ListaPerguntas();
        Usuario voce = new Usuario();
        
        String nomeUsuario = input.nextLine();           
        String proximaPergunta = perguntas.getNextQuestion();

        System.out.println("Insira seu nome");
        voce.iniciarUsuario(nomeUsuario);
        
        while(proximaPergunta != null){
            

            if(voce.getNome() == null){
                System.out.println("Insira seu nome por favor");
                continue;
            }
            
            System.out.println(proximaPergunta);
            proximaPergunta = perguntas.getNextQuestion();
            
        }
        
        
    }
}
