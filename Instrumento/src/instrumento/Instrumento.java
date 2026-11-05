/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrumento;

/**
 *
 * @author David
 */
public class Instrumento {
    String marca, tipo;
    double preco;
    
    public Instrumento(){}
    
    public Instrumento(String m){
        marca = m;
    }
    
    public Instrumento(String m, String t){
        marca = m;
        tipo = t;
    }
    
    public Instrumento(String m, String t, double p){
        marca = m;
        tipo = t;
        preco = p;
    }
    
    public Instrumento(String m, double p, String t){
        marca = m;
        preco = p;
        tipo = t;
    }
    
    public String getMarca(){return marca;}
    public void setMarca(String m){marca = m;}
    public String getTipo() {return tipo;}
    public void setTipo(String t) {tipo = t;}
    public double getPreco(){return preco;}
    public void setPreco(double p){preco = p;}
    
    public void Imprimir(){
        System.out.println("Marca : "+ marca);
        System.out.println("Tipo : "+ tipo);
        System.out.println("Preço : "+ preco);
    }
}
