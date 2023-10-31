
package com.mycompany.aula3110;
import java.util.*;

public class Professor extends Pessoa {
    public int id;
    public Disciplina disciplina;
    
    Professor(String nome, String cpf, int id){
        super(nome, cpf);
        this.id = id;
    } 
    
    @Override
    public void imprimir(){
        System.out.println("zzzzzz");
    }
    
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
}
