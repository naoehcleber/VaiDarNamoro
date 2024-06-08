/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaidarnamoroterminal.Controller;

import java.util.Map;

import com.mycompany.vaidarnamoroterminal.Entity.Questionario;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author João Victor
 */
public class VerificarResposta extends Questionario{
    public Map<Integer, String> respostasMap = new HashMap<>();
    public ArrayList <String> respostas = new ArrayList<>();
    
    public VerificarResposta(){
        //to do : passar como parametro as respostas da VITIMA.
        //inicia o arraylist
       
       //inicia todos os valores do arraylist com uma string vazia
       for(int i =0; i < 6; i++){
            respostas.add("");
        }
       
        MapRespostas(respostas);
    }
    
    
    public void salvarRespostas(String respostaMain, int index){
        
        respostas.set(index, respostaMain);
        MapRespostas(respostas);
    }
    
    public void arquivarRespostas(ArrayList<String> lista, String nomeArquivo){
        //função que passa o ArrayList de respostas para um arquivo de texto
        // Cria o FileWriter e BufferedWriter para escrever no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String item : lista) {
                writer.write(item);
                writer.newLine(); // Escreve uma nova linha no arquivo
            }
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    
    }
    
    

    public void MapRespostas(ArrayList<String> respostas){
        //mapa vai receber como key o index do arrayList Perguntas
        //o value vai ser uma string que seja a resposta
        //to do : mudar o value pra ser um elemento de outro arrayList para poder implementar novos perfis.
        respostasMap.put(1, respostas.get(0));
        respostasMap.put(2, respostas.get(1));
        respostasMap.put(3, respostas.get(2));
        respostasMap.put(4, respostas.get(3));
        respostasMap.put(5, respostas.get(4));
        
        
    }
    
    
    public String getResposta(int IndexAtual){
        return respostasMap.get(IndexAtual);
    }
    
    //ler as respostas a partir de um arquivo
    public void lerRespostasArquivo(String nomeArquivo){
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int index = 1; // Começando do índice 1, conforme a lógica da sua classe
            while ((linha = reader.readLine()) != null && index <= 5) {
                respostas.set(index - 1, linha); // Atualiza a resposta no ArrayList
                respostasMap.put(index, linha); // Atualiza o mapeamento no HashMap
                index++;
            }
            System.out.println("Respostas carregadas com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de respostas: " + e.getMessage());
        }
    }
    
    
}
