
package com.mycompany.aula1810;

public class Contato {
    private String tipo;
    private String contato;

    public Contato(String tipo, String contato) {
        this.tipo = tipo;
        this.contato = contato;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTipo() {
        return tipo;
    }

    public String getContato() {
        return contato;
    }
    
    
}
