/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão;

/**
 *
 * @author David
 */
public class Tenis extends Fechados {
     boolean esportivo;

    // Construtores
    public Tenis() {}

    public Tenis(String marca) {
        super(marca);
    }

    public Tenis(String marca, double preco) {
        super(marca, preco);
    }

    public Tenis(String marca, double preco, int tamanho) {
        super(marca, preco, tamanho);
    }

    public Tenis(String marca, double preco, int tamanho, String cor) {
        super(marca, preco, tamanho, cor);
    }

    public Tenis(String marca, double preco, int tamanho, String cor, boolean cadarco, boolean esportivo) {
        super(marca, preco, tamanho, cor, cadarco);
        this.esportivo = esportivo;
    }

    public Tenis(boolean esportivo) {
        this.esportivo = esportivo;
    }

    // Getter & Setter
    public boolean getEsportivo() { return esportivo; }
    public void setEsportivo(boolean esportivo) { this.esportivo = esportivo; }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Esportivo: " + esportivo);
    }
}
