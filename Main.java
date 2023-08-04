/*
Exercício de Conversão de Temperatura: Crie um programa que peça ao usuário para digitar uma temperatura em graus Celsius e converta-a para Fahrenheit. Em seguida, exiba o resultado na tela.
*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    float c, f;

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus Celsius: ");
    c = scan.nextFloat();

    f = (c * 9 / 5) + 32;
    
    System.out.println("Temperatura em fahrenheit: "+ f);
  }
}
