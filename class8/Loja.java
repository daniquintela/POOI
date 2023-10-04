public class Loja{
    private List<Produto> estoque;
    
    public Loja(){
        this.estoque = new ArrayList<Produto>();
    }
    
    public List<Produto> getEstoque() {
        return estoque;
    }
    
    public void adicionarProduto(int id, String n, String m, double p){
        Produto p = new Produto(id, n, m, p);
        estoque.add(p);
    }
    
    public void showProdutos(){
        for(Produto p:estoque){
            System.out.println("Produto:"+a.getId().getNome().getMarca().getPreco());
        }
    }
    
    Map<String, Produto>mapProduto = new HashMap<String, Produto>();
		mapProduto.put("a12", p1);
		mapProduto.put("s21", p2);
		mapProduto.put("m30", p3);
		mapProduto.put("a15", p4);
		
		for(String p: mapProduto.keySet()){
            System.out.println("Produto: "+mapProduto.get(p).getNome());
        }
}
