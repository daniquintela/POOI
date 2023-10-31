package com.mycompany.aula3110;
import java.util.*; 

public class Curso {
    public String nome;
    List<Aluno>alunos = new ArrayList<>();
    
    Curso(String nome){
        this.nome = nome;
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        aluno.setCurso(this);
    }
}
