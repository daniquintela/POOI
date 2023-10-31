package com.mycompany.aula3110;

import java.util.*;

public class Disciplina {
    public String nome;
    List<Professor> professors = new ArrayList<>();
    
    Disciplina(String nome){
        this.nome = nome;
    }
    
    public void adicionarProfessor(Professor professor
    ){
        professors.add(professor);
        professor.setDisciplina(this);
    }
}
