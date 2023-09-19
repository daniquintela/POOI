import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Aluno a1 = new Aluno();
       Aluno a2 = new Aluno();

       a1.nome = "Gabriel Vitral";
       a1.curso = "Educação física";
       a1.turma = "EF2Ma";
       a1.getPeriodo();
       a1.setMatricula("202308408");
       a1.nota1b = 7.6;
       a1.nota2b = 8.2;


       a2.nome = "Daniele Quintela";
       a2.curso = "Design de moda";
       a2.turma = "DM1Mb";
       a2.getPeriodo();
       a2.setMatricula("202308451");
       a1.nota1b = 7.4;
       a1.nota2b = 8.5;

    }
}
        
