public class Carro extends veiculo {
    public void andar(){
        System.out.println("Andando...");
    }
    
    @Override
    public void abastecer(){
        System.out.println("Abastecendo com gasolina");
    }
}
