public class barco extends veiculo{
    public void navegar(){
        System.out.println("Navegando...");
    }
    
    @Override
    public void abastecer(){
       System.out.println("Abastecendo com diesel");
    }
}
