package com.mycompany.vaidarnamoroterminal;

public class Pessoa {
    private String Nome;
    private String Idade;
    private String genero;
    
    public Pessoa() {

    }
    
    public Pessoa(String nome, String idade, String genero) {
        Nome = nome;
        Idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
