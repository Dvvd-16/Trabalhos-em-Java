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

    public Chinelo(String marca, double preco, int tamanho, String cor, boolean a) {
        super(marca, preco, tamanho, cor);
        acessorio = a;
    }

    public Chinelo(String marca, double preco, int tamanho, String cor, boolean a, boolean t) {
        super(marca, preco, tamanho, cor);
        acessorio = a;
        tiras = t;
    }

    public Chinelo(boolean a, boolean t) {
        acessorio = a;
        tiras = t;
    }

    // Getters e Setters
    public boolean getAcessorio() { return acessorio; }
    public void setAcessorio(boolean a) { acessorio = a; }

    public boolean getTiras() { return tiras; }
    public void setTiras(boolean t) { tiras = t; }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Acessório: " + acessorio);
        System.out.println("Tiras: " + tiras);
    }
}
