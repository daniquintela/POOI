
package com.mycompany.animais;

public class Anfibio {
    private String nome;
    private int idade;
    private int membros;
    private String corEscama;

Anfibio(String nome, int idade, int membros, String corEscama){
    this.nome = nome;
    this.idade = idade;
    this.membros = membros;
    this.corEscama = corEscama;
}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

 
}
