public class Produto {
    String nome;
    String marca;
    int valor;

    Produto(){

    }

    Produto(String nome){
        this.nome = nome;
    }

    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, int valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
