// Verificar maior de idade
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      int idade;
	      
	      System.out.println("Digite a sua idade: ");
          idade = scan.nextInt();
          
          if(idade>=18){
              System.out.println("Você é maior de idade");
          }else{
              System.out.println("Você é menor de idade");
          }
	}
}
