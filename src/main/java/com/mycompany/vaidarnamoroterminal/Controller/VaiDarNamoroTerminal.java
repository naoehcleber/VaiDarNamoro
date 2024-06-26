package com.mycompany.vaidarnamoroterminal.Controller;
import com.mycompany.vaidarnamoroterminal.Controller.EntradaInvalida;
import com.mycompany.vaidarnamoroterminal.Controller.QuestionarioController;
import com.mycompany.vaidarnamoroterminal.Controller.UsuarioController;
import com.mycompany.vaidarnamoroterminal.Controller.VerificarResposta;
import com.mycompany.vaidarnamoroterminal.Entity.Questao;
import com.mycompany.vaidarnamoroterminal.Entity.Usuario;



import java.util.Scanner;
import java.io.File;

import java.io.FileWriter;
import java.io.BufferedWriter;



import java.io.IOException;

public class VaiDarNamoroTerminal {

    public static void main(String[] args) throws EntradaInvalida {
        Scanner input = new Scanner(System.in);
        

        QuestionarioController perguntas = new QuestionarioController();
        VerificarResposta respostas = new VerificarResposta();
        Usuario usuario = new Usuario();
        UsuarioController voce = new UsuarioController(usuario);
        
        int IndexAtual;
        Questao proximaPergunta;
        String respostaJogo;
        String respostaCorreta;
        int opcaoMenu;
        int currentLineFile;
        int opcaoPerfil;
        String nomeUsuario;
       

        try {
            File file = new File("src\\main\\java\\com\\mycompany\\vaidarnamoroterminal\\Model\\respostas_padrao.txt");
            File arquivoUsuario = new File("src\\main\\java\\com\\mycompany\\vaidarnamoroterminal\\Model\\Perfil_Usuario.txt");
            if (arquivoUsuario.exists()) {
                Scanner leitorArquivo = new Scanner(arquivoUsuario);
                currentLineFile = 0;
                while (leitorArquivo.hasNextLine()) {
                    String respostasArquivo = leitorArquivo.nextLine();
                    respostas.salvarRespostas(respostasArquivo, currentLineFile);
                    currentLineFile++;
                }
                leitorArquivo.close();
            } else if (file.exists()) {
                Scanner leitorArquivo = new Scanner(file);
                currentLineFile = 0;

                while(leitorArquivo.hasNextLine()){
                    
                    //1) salva as linhas do arquivo em uma variavel String

                while (leitorArquivo.hasNextLine()) {

                    String respostasArquivo = leitorArquivo.nextLine();
                    respostas.salvarRespostas(respostasArquivo, currentLineFile);
                    currentLineFile++;
                }
                leitorArquivo.close();
                }
            } else {
                file.createNewFile();
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                    for(int i = 0; i < perguntas.getTamanhoPerguntas(); i++){
                        writer.write("A");
                        writer.newLine();
                    }
                } catch (IOException e){
                    System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Insira seu nome");
            nomeUsuario = input.nextLine().toUpperCase();

            if (nomeUsuario.equals("")) {
                throw new EntradaInvalida("Insira seu nome por favor");
            }

            usuario.setNome(nomeUsuario);
            System.out.println("Seja bem vindo " + usuario.getNome());
        } while (nomeUsuario.equals(""));

        while (true) {
            System.out.println("1 - Comecar Jogo");
            System.out.println("2 - Criar Perfil");
            System.out.println("0 - Sair");
            opcaoMenu = input.nextInt();

            if (opcaoMenu != 1 && opcaoMenu != 2 && opcaoMenu != 0) {
                throw new EntradaInvalida("Insira uma opcao valida por favor");
            }
            perguntas.restartCounter();

            if (opcaoMenu == 1) {
                System.out.println("Escolha qual perfil para ver a compatibilidade :");
                System.out.println("1 - Padrão");
                System.out.println("2 - Perfil do Usuario");
                opcaoPerfil = input.nextInt();
                if (opcaoPerfil == 1) {
                    respostas.lerRespostasArquivo("src\\\\main\\\\java\\\\com\\\\mycompany\\\\vaidarnamoroterminal\\\\Model\\\\respostas_padrao.txt");
                } else if (opcaoPerfil == 2) {
                    respostas.lerRespostasArquivo("src\\\\main\\\\java\\\\com\\\\mycompany\\\\vaidarnamoroterminal\\\\Model\\\\Perfil_Usuario.txt");
                }

                while (true) {
                    IndexAtual = perguntas.returnIndex();
                    proximaPergunta = perguntas.getNextQuestion();
                    System.out.println(proximaPergunta);

                    input.nextLine();
                    respostaJogo = input.nextLine().toUpperCase();

                    if (!respostaJogo.equals("A") && !respostaJogo.equals("B") && !respostaJogo.equals("C")) {
                        throw new EntradaInvalida("Alternativa invalida !");

                    } 
                //chama o map pra comparar a resposta da pergunta atual
                respostaCorreta = respostas.getResposta(IndexAtual);
                //debug
                System.out.println(respostaCorreta);
                // 
                //confere se a resposta dada é igual a resposta certa
                if(respostaJogo.equals(respostaCorreta)){
                    System.out.println("Resposta Certa!");
                    //aumenta os acertos
                    voce.increaseAcertos();
                } else {
                    System.out.println("Resposta Errada!");
                    voce.increaseErros();
                }   
                
                //condição de parada
                if(IndexAtual == perguntas.getTamanhoPerguntas() - 1){
                    if(usuario.getAcertos() > usuario.getErros()){
                        System.out.println("MATCH !");
                        break;
                    } else {
                        System.out.println("Hoje não foi seu dia... mais sorte da proxima vez!");
                        break;
                    } 
                }
                //passa para a proxima pergunta
                
                

                    }

                    respostaCorreta = respostas.getResposta(IndexAtual);

                    if (respostaJogo.equals(respostaCorreta)) {
                        System.out.println("Resposta Certa!");
                        voce.increaseAcertos();
                    } else {
                        System.out.println("Resposta Errada!");
                        voce.increaseErros();
                    }

                    if (IndexAtual == perguntas.getTamanhoPerguntas()) {
                        if (usuario.getAcertos() > usuario.getErros()) {
                            System.out.println("MATCH !");
                            break;
                        } else {
                            System.out.println("Hoje não foi seu dia... mais sorte da proxima vez!");
                            break;
                        }
                    }
                
            } else if (opcaoMenu == 2) {
                while (true) {
                    IndexAtual = perguntas.returnIndex();
                    proximaPergunta = perguntas.getNextQuestion();
                    System.out.println("Pergunta  " + IndexAtual + ":");
                    System.out.println(proximaPergunta);

                    //limpa o buffer
                    //to do : corrijir limpeza de buffer pra nao ficar tendo que inserir linha vazia
                    input.nextLine();
                    //pega a resposta com um scanner
                    respostaJogo = input.nextLine();
                    
                    //capitaliza a entrada 
                    respostaJogo = respostaJogo.toUpperCase();


                    if (!respostaJogo.equals("A") && !respostaJogo.equals("B") && !respostaJogo.equals("C")) {
                        throw new EntradaInvalida("Alternativa invalida !");
                    }

                    respostas.salvarRespostas(respostaJogo, IndexAtual);

                    
                     if(IndexAtual == perguntas.getTamanhoPerguntas() - 1){
                        //passa pra proxima pergunta e verifica se ela é null
                        respostas.arquivarRespostas(respostas.respostas, "src\\\\main\\\\java\\\\com\\\\mycompany\\\\vaidarnamoroterminal\\\\Model\\\\Perfil_Usuario.txt");
                        break;
                    }
                }
            
            } else if (opcaoMenu == 0) {
                System.out.println("Saindo do programa");
                break;
            }
        }
    

        input.close();
    }
}