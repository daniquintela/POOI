public class Main
{
    
    public static int imprimir(int n){
        n = n+2;
        System.out.println("\tValor de n: "+n+"\n");
        return n;
    }
    
	public static void main(String[] args) {
		System.out.println("Começou o programa");
		int n = 5;
        System.out.println("Valor de n: "+n);
        n = imprimir(n);
	}
}
