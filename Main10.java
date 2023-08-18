/*
Soma de Números Inteiros: Escreva um programa em Java que solicita ao usuário 
que digite uma sequência de números inteiros. Utilize uma estrutura de repetição
while para ler os números até que seja digitado um número negativo. Em seguida, 
exiba a soma dos números inteiros digitados (não incluindo o número negativo).
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int soma = 0;
        int x = 0;
        
        while (x >= 0) {
            System.out.println("Digite o número: ");
            x = scan.nextInt();
            
            if(x > 0){
                soma = soma+x;
            }
        }
        System.out.println("Resultado: "+soma);
	}
}
