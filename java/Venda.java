/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunolab03
 */
public class Venda {
    private int id;
    private double venda;
    public Comercio comercio;
    
    Venda(int id, double venda){
        this.id = id;
        this.venda = venda;
    }
    
    public void setComercio(Comercio comercio){
        this.comercio = comercio;
    }

    public int getId() {
        return id;
    }

    public double getVenda() {
        return venda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
    
    
}
