import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Produto p1 = new Produto(537, "Iphone 12", "Apple", 3499.99);
		Produto p2 = new Produto(261, "Galaxy S21", "Samsung", 1999.99);
		Produto p3 = new Produto(158, "Edge 30 Ultra", "Motorola", 4399.99);
		Produto p4 = new Produto(526, "Iphone 15", "Apple", 6499.99);
		
		Loja e1 = new Loja("iPlace");
		e1.adicionarProduto(501, "Iphone 8 Plus", "Apple", 2000.00);
		e1.adicionarProduto(502, "Iphone X", "Apple", 2299.99);
		e1.adicionarProduto(502, "Iphone 11", "Apple", 2700.00);
		e1.adicionarProduto(502, "Iphone 13", "Apple", 4000.00);
		e1.adicionarProduto(502, "Iphone 14", "Apple", 4500.00);
		e1.adicionarProduto(502, "Iphone 14 Pro Max", "Apple", 7500.00);
	}
}
