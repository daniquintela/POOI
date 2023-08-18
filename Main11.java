/*
Contagem Regressiva: Escreva um programa em Java que solicita ao usuário um
número inteiro positivo. Utilize uma estrutura de repetição do-while para exibir
uma contagem regressiva a partir do número informado pelo usuário até 1.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int x = scan.nextInt();
        
        while (x >= 0) {
            System.out.println(x);
            x--;
        }
	}
}
