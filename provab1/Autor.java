package com.mycompany.aula1810;
import java.util.*;

public class Autor {
    private String nome;
    private String abreviatura;
    private List<Contato> contatos;

    public Autor(String nome, String abreviatura) {
        this.nome = nome;
        this.abreviatura = abreviatura;
        this.contatos = new ArrayList<Contato>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
    
    public void adicionarContato(String t, String c){
        Contato contatoTemporario = new Contato(t, c);
        this.contatos.add(contatoTemporario);
    }
    
}
