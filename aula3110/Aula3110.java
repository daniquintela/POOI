

package com.mycompany.aula3110;
import java.util.*;

public class Aula3110 {

    public static void main(String[] args) {
      Pessoa p1 = new Pessoa("pessoa 1", "123456");
      Pessoa p2 = new Pessoa("pessoa 2", "123457");
      Pessoa p3 = new Pessoa("pessoa 3", "123458");
      
      Disciplina d1 = new Disciplina("matematica");
      
      Curso c1 = new Curso("nutricao");
      Curso c2 = new Curso("adm");
      Curso c3 = new Curso("filosofia");
        
      List<Pessoa> dados = new ArrayList<>();
      
      dados.add(p1);
      
      
      Set<Disciplina> disciplinas = new HashSet<>();
      
      disciplinas.add(d1);
      
      
      Map<String, Curso> cursos = new HashMap<>();
      
      cursos.put("n", c1);
      cursos.put("a", c2);
      cursos.put("f", c3);
      
      
    }
}
