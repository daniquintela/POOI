import java.util.*;
import java.time.Year;

public class Aluno {
    private String matricula;
    String nome;
    String curso;
    char turma;
    int periodo;
    double nota1b;
    double nota2b;
    double notaf;
    static int qntalunos;
    Scanner scan = new Scanner(System.in);

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    Aluno(){
        qntalunos++;
    }

    Aluno(String nome, int periodo){
        qntalunos++;
    }

    void imprimir(){
        System.out.printf("Nome do aluno: " + this.nome);
        System.out.printf("\nCurso: %s", this.curso);
        System.out.printf("\nTurma: " + this.turma);
        System.out.printf("\nNota final: %.2f\n", this.notaf);
    }

    void mediaF(){
        this.notaf = nota1b + nota2b / 2;
    }

    void passar(){
        this.periodo++;
        System.out.printf("\nO aluno %s passou para o periodo %d, em qual turma vai ser alocado: ", this.nome, this.periodo);
        this.turma = scan.nextLine().charAt(0);
    }

    int gerarMatricula(){
        int anoAtual = Year.now().getValue();
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10000);
        int m = anoAtual * 10000 + numeroAleatorio;
        return m;
    }
}
