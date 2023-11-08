/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunodev07
 */
public class Moto extends veiculo implements iTerrestre {
    @Override
    public void andar(){
        System.out.println("Andando...");
    }
    
    @Override
    public void abastecer(){
        System.out.println("Abastecendo com gasolina");
    }
}
