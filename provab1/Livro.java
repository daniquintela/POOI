package com.mycompany.aula1810;
import java.util.*;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private List<Autor> autores;
    private Editora edt;

    public Livro(String titulo, int anoPublicacao, Editora edt) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.edt = edt;
        this.autores = new ArrayList<Autor>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    public void adicionarAutor(Autor a){
        this.autores.add(a);
    }
    
    public void removerAutor(Autor a){
        this.autores.remove(a);
    }

    public Editora getEdt() {
        return edt;
    }

    public void setEdt(Editora edt) {
        this.edt = edt;
    }
    
}

