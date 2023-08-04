/*
Exercício de Concatenação de Strings: Peça ao usuário que digite seu nome e sobrenome separadamente (duas strings). Em seguida, concatene os dois valores para formar o nome completo e exiba-o na tela
*/
import java.util.*;
class Main {
  public static void main(String[] args) {
String  nome, sobrenome, nomecompleto;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite o primeiro nome: ");
    nome = scan.nextLine();

    nomecompleto = nome+" "+sobrenome;
    System.out.println("O nome completo é: "+nomecompleto);
  }
}
