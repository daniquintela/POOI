public class Time {
    private String nome;
    private List<Atleta> jogadores;
    
    
    public Time(String nome){
        this.nome = nome;
        this.jogador = new Atleta();
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public List<Atleta> setJogadores(){
        
    }
    
    public List<Atleta> getJogadores(){
        return jogador;
    }
    
    public void cadastraAtleta(String n, Esporte e){
        Atleta a = new Atleta(n, e);
        jogadores.add(a);
    }
    
    public void imprimirAtletas(){
        for(Atleta a:jogadores){
            System.out.println("Nome: "+a.getnome());
            System.out.println("Esporte: "+a.getE().getNome());
        }
    }
    
}
