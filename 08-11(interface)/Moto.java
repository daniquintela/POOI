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
