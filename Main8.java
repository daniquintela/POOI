/*
 Escreva um programa em java que solicita ao usuário que 
 digite o valor de um produto e o código de desconto aplicado a ele.
 Desconto 1 - Se o produto for mais de 30 reais, da 30% de desconto. Se não, nada
 Desconto 2 - Dá 20% de desconto
 Desconto 3 - Se o produto for mais de 100 reais, da 10% de desconto, se não, 55.
 Utlize a estrutura de decisão switch-case para verificar o código digitado
 e calcular o desconto correspondente.
 */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double produto, desconto;
        int codigo;

        System.out.println("Digite o valor do produto: R$");
	    produto = scan.nextDouble();

        System.out.println("Digite o código de desconto: ");
	    codigo = scan.nextInt();

        switch (codigo) {
            case 1:
                if(produto>30){
                    desconto = produto*0.7;
                    System.out.println("Valor com desconto: R$"+desconto);
                }else{
                    desconto = produto;
                    System.out.println("Valor com desconto: R$"+desconto);
                }
                break;
            case 2:
            desconto = produto*0.8;
            System.out.println("Valor com desconto: R$"+desconto);
                break;
            case 3: 
                if(produto>100){
                    desconto = produto*0.9;
                    System.out.println("Valor com desconto: R$"+desconto);
                }else{
                    desconto = produto*0.95;
                    System.out.println("Valor com desconto: R$"+desconto);
                }
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
