public class Conta {
    
    public static int quantidade;
    
    private int numero;
    private int valor;

    public Conta(int n, int v){
        this.numero = n;
        this.valor = v;
    }
    
    public Conta(int n){
        this.numero = n;
        this.valor = 0;
    }

    public void sacar(int s){
        if ((this.valor - s)<0){
            System.out.println("Saldo insuficiente");
        }else{
         this.valor = this.valor - s;
        }
    }
    
    public void depositar(int s){
        this.valor = this.valor + s;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setNumero(int n){
        this.numero = n;
    }
    
    public static int getQuantidade(){
        return quantidade;
    }
}
