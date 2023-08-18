/*
Contagem Crescente: Escreva um programa em Java que solicita ao usuário um
número inteiro positivo. Em seguida, utilize uma estrutura de repetição while para 
exibir uma contagem crescente a partir de 1 até o número informado pelo usuário.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int numero;
        
        System.out.println("Digite um número inteiro");
	    numero = scan.nextInt();
        
        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
	}
}
