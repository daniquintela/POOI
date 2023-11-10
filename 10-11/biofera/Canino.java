package com.mycompany.biofera;

public class Canino extends Animal {
    @Override
    public void fazerBarulho(){
        System.out.println("au au");
    }
    
    @Override
    public void comer(){
        System.out.println("Comendo ");
    }
}
