import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Conta c1 = new Conta(3653);
		Conta c2 = new Conta(3653, 1000);
		
		c2.sacar(2000);
		
		System.out.println("Saldo: "+ c2.getValor());
	}
}
