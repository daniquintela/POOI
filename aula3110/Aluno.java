package com.mycompany.aula3110;
import java.util.*;

public class Aluno extends Pessoa{
    public int matricula;
    public Curso curso;
    
    Aluno(String nome, String cpf, int matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
