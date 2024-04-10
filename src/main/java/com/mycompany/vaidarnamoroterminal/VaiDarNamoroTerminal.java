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
        while(true){
            System.out.println("Insira seu nome");
            voce.iniciarUsuario(nomeUsuario);

            if(voce.getNome() != null){
                System.out.println("Insira seu nome por favor");
                continue;
            }
            String proximaPergunta = perguntas.getNextQuestion();
            
        }
        
        
    }
}
