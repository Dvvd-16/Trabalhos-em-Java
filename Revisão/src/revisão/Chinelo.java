/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão;

/**
 *
 * @author David
 */
public class Chinelo extends Calcado {
     boolean acessorio;
     boolean tiras;

    // 🔹 Construtores (8 exemplos)
    public Chinelo() {}

    public Chinelo(String marca) {
        super(marca);
    }

    public Chinelo(String marca, double preco) {
        super(marca, preco);
    }

    public Chinelo(String marca, double preco, int tamanho) {
        super(marca, preco, tamanho);
    }

    public Chinelo(String marca, double preco, int tamanho, String cor) {
        super(marca, preco, tamanho, cor);
    }

    public Chinelo(String marca, double preco, int tamanho, String cor, boolean acessorio) {
        super(marca, preco, tamanho, cor);
        this.acessorio = acessorio;
    }

    public Chinelo(String marca, double preco, int tamanho, String cor, boolean acessorio, boolean tiras) {
        super(marca, preco, tamanho, cor);
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    public Chinelo(boolean acessorio, boolean tiras) {
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    // Getters e Setters
    public boolean getAcessorio() { return acessorio; }
    public void setAcessorio(boolean acessorio) { this.acessorio = acessorio; }

    public boolean getTiras() { return tiras; }
    public void setTiras(boolean tiras) { this.tiras = tiras; }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Acessório: " + acessorio);
        System.out.println("Tiras: " + tiras);
    }
}
