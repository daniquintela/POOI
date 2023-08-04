/*
Exercício de Cálculo de Média: Crie um programa que solicite ao usuário três notas (números de ponto flutuante) e calcule a média aritmética das notas. Em seguida, exiba a média na tela.
*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    float n1, n2, n3;

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite sua nota 1: ");
    n1 = scan.nextFloat();

    System.out.println("Digite a sua nota 2: ");
    n2 = scan.nextFloat();

    System.out.println("Digite a sua nota 3: ");
    n3 = scan.nextFloat();

    float media = (n1 + n2 + n3) / 3;
    
    System.out.println("Sua média é: "+ media);
  }
}
