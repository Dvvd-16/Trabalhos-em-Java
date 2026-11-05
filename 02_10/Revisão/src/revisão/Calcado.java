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

public Calcado(String m) {
    marca = m;
}

public Calcado(String m, double p) {
    marca = m;
    preco = p;
}

public Calcado(String m, double p, int t) {
    marca = m;
    preco = p;
    tamanho = t;
}

   public Calcado(String m, double p, int t, String c) {
    marca = m;
    preco = p;
    tamanho = t;
    cor = c;
    }


    // 🔹 Getters e Setters
    public void setMarca(String m) { marca = m; }
    public void setPreco(double p) { preco = p; }
    public void setTamanho(int t) { tamanho = t; }
    public void setCor(String c) { cor = c; }
    public String getMarca() { return marca; }
    public String getCor() { return cor; }
    public int getTamanho() { return tamanho; }
    public double getPreco() { return preco; }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
}

