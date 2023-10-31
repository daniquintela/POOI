package com.mycompany.animais;

public class Mamifero {
    private String nome;
    private int idade;
    private int membros;
    private String corPelo;
    
    Mamifero(String nome, int idade, int membros, String corPelo){
        this.nome = nome;
        this.idade = idade;
        this.membros = membros;
        this.corPelo = corPelo;
    }
    
    public String getNome() {
        return nome;
    }
    
    
}
