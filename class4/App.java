import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Uno";
        c2.nome = "Celta";
        c1.marca = "Fiat";
        c2.marca = "Chevrolet";
        c1.ano = 2015;
        c2.ano = 2018;
        c1.velocidade = 80;
        c2.velocidade = 20;

        c2.acelerar(60);
        c1.frear(15);

        System.out.println("Velocidade do celta: "+c2.velocidade);
        System.out.println("Velocidade do uno: "+c1.velocidade);

        c2.buzinar();
    }
}
        
