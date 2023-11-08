public class Aviao extends veiculo {
    public void voar(){
        System.out.println("Voando");
    }
    
    @Override
    public void abastecer(){
        System.out.println("Abastecendo como querosene");
    }
}
