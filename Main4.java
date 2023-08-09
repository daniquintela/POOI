import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
		System.out.println("Digite a frase");
		
		String frase = scan.nextLine();
		
		int quantidade = frase.length();
		
		System.out.println("O tamanho da frase é: "+quantidade);
		
	}
}
