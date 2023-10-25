/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2510;

/**
 *
 * @author alunodev07
 */
public class CD extends Midia {
    public int faixas;
    
    CD(String nome, double preco, String artista, int faixas){
        this.nome = nome;
        this.preco = preco;
        this.artista = artista;
        this.faixas = faixas;
    }
}
