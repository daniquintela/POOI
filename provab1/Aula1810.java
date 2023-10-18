package com.mycompany.aula1810;

public class Aula1810 {

    public static void main(String[] args) {
        Editora e1 = new Editora("Edt 1", "edt1@gmail.com");
        Editora e2 = new Editora("Edt 2", "edt2@gmail.com");
        
        Autor a1 = new Autor("Autor 1", "a1");
        Autor a2 = new Autor("Autor 2", "a2");
        
        Livro l1 = new Livro("Livro 1", 2023, e1);
        Livro l2 = new Livro("Livro 2", 2022, e2);
        
        a1.adicionarContato("celular", "27995430624");
        a2.adicionarContato("celular", "27996305020");
    }
}
