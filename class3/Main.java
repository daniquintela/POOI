import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Aluno a1 = new Aluno();
       Aluno a2 = new Aluno();
       Aluno a3 = new Aluno("laura", 2);

       a1.nome = "fulano";
       a1.curso = "relações internacionais";
       a1.turma = 'A';
       a1.nota1b = 7.2;
       a1.nota2b = 6.9;

       a2.nome = "ciclano";
       a2.curso = "engenharia de produção";
       a2.turma = 'C';
       a2.nota1b = 8.5;
       a2.nota2b = 9.1;

       a3.curso = "educação fisica";
       a3.turma = 'B';
       a3.nota1b = 8.1;
       a3.nota2b = 7.3;
       
       System.out.println("\n\tMatricula do aluno: " + a1.gerarMatricula());
       a1.imprimir();
       System.out.println("\n\tMatricula do aluno: " + a2.gerarMatricula());
       a2.imprimir();
       System.out.println("\n\tMatricula do aluno: " + a3.gerarMatricula());
       a3.imprimir();

       a1.passar();
    }
}
        
