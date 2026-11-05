/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão;

/**
 *
 * @author David
 */
public class Fechados extends Calcado {
    private boolean cadarco;

    // 🔹 Construtores
    public Fechados() {}

    public Fechados(String marca) {
        super(marca);
    }

    public Fechados(String marca, double preco) {
        super(marca, preco);
    }

    public Fechados(String marca, double preco, int tamanho) {
        super(marca, preco, tamanho);
    }

    public Fechados(String marca, double preco, int tamanho, String cor) {
        super(marca, preco, tamanho, cor);
    }

    public Fechados(String marca, double preco, int tamanho, String cor, boolean c) {
        super(marca, preco, tamanho, cor);
        cadarco = c;
    }

    // 🔹 Getter & Setter
    public boolean getCadarco() { return cadarco; }
    public void setCadarco(boolean c) { cadarco = c; }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cadarço: " + cadarco);
    }
}
