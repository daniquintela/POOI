// Calcular bonus do salario
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      int salario;
	      float bonus;
	      float total;
	      
	      System.out.println("Digite seu salário mensal: ");
	      salario = scan.nextInt();
	      
	      if(salario<1000){
	          bonus = (salario/100)*10;
	          total = salario + bonus;
	          System.out.println("Seu bonus é de: R$"+bonus);
	          System.out.println("Seu total é: R$"+total);
	      }else if(salario >=1000 && salario <=2000){
	          bonus = (salario/100)*5;
	          total = salario + bonus;
	          System.out.println("Seu bonus é de: R$"+bonus);
	          System.out.println("Seu total é: R$"+total);
	      }
	      else{
	          bonus = (salario/100)*2;
	          total = salario + bonus;
	          System.out.println("Seu bonus é de: R$"+bonus);
	          System.out.println("Seu total é: R$"+total);
	      }
	}
}
