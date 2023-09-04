import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto();
        p1.nome = "Caneta preta";
        p1.marca = "Stabilo";
        p1.valor = 5;

        Produto p2 = new Produto("Caneta vermelha", "Faber");
        p2.valor = 2;

        Produto p3 = new Produto("Borracha", "Mercur", 3);


        System.out.println("Nome: "+ p1.nome +"\nMarca: "+ p1.marca+"\nValor: R$"+ p1.valor +",00");

        System.out.println("Nome: "+ p2.nome +"\nMarca: "+ p2.marca+"\nValor: R$"+ p2.valor +",00");

        System.out.println("Nome: "+ p3.nome +"\nMarca: "+ p3.marca+"\nValor: R$"+ p3.valor +",00");

    }
}
        
