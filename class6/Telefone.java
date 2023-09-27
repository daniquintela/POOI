public class Telefone {
    private String numero;
    private Chip c;
    private Ddd d;
    private Pessoa p;
    
    public Telefone(String numero, Ddd d, String nome, String rg){
        this.numero = numero;
        this.d = d;
        this.p = New Pessoa(Pessoa p);
    }
    
    public String getNumero(){
        return numero;
    }
    
    public Chip getC(){
        return c;
    }
    
    public void setC(Chip c){
        this.c = c;
    }
    
    public Ddd getD(){
        return d;
    }
    
    public void setD(Ddd d){
        this.d = d;
    }
}
