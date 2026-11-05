/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão;

/**
 *
 * @author David
 */
public class Sapato extends Fechados {
     String modelo;

    // Construtores
    public Sapato() {}

    public Sapato(String marca) {
        super(marca);
    }

    public Sapato(String marca, double preco) {
        super(marca, preco);
    }

    public Sapato(String marca, double preco, int tamanho) {
        super(marca, preco, tamanho);
    }

    public Sapato(String marca, double preco, int tamanho, String cor) {
        super(marca, preco, tamanho, cor);
    }

    public Sapato(String marca, double preco, int tamanho, String cor, boolean cadarco, String modelo) {
        super(marca, preco, tamanho, cor, cadarco);
        this.modelo = modelo;
    }

    // Getter & Setter
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Modelo: " + modelo);
    }
}
