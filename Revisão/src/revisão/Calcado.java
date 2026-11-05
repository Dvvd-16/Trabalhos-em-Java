/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisão;

/**
 *
 * @author David
 */
public class Calcado {
     String marca;
     double preco;
     int tamanho;
     String cor;

    // 🔹 Construtores (mínimo 5)
    public Calcado() {}

    public Calcado(String marca) {
        this.marca = marca;
    }

    public Calcado(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public Calcado(String marca, double preco, int tamanho) {
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public Calcado(String marca, double preco, int tamanho, String cor) {
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    // 🔹 Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getTamanho() { return tamanho; }
    public void setTamanho(int tamanho) { this.tamanho = tamanho; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    // 🔹 Métodos comuns
    public void cadastrar(String marca, double preco, int tamanho, String cor) {
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
}

