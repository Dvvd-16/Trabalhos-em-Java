/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerc.pkg2;

/**
 *
 * @author David
 */
public class Televisao {
    String marca;
    int polegadas;
    byte portasHdmi;
    float peso;
    double preco;
    
    public void setMarca(String m){
        if(!m.isEmpty()){
            marca = m;
        }
    }
    public String getMarca(){
        return marca;
    }
    public void setPolegadas(int p){
        if (p>=0){
            polegadas = p;
        }
    }
    public int getPolegadas(){
        return polegadas;
    }
    public void setPortasHdmi(byte ph){
        if(ph>=0){
            portasHdmi = ph;
        }
    }
    public byte getPortasHdmi(){
        return portasHdmi;
    }
    public void setPeso(float pe){
        if(pe>0.0f){
            peso = pe;
        }
    }
    public float getPeso(){
        return peso;
    }
    public void setPreco(double pr){
        if(pr>=0){
            preco = pr;
        }
    }
    public double getPreco(){
        return preco;
    }
    public void imprimir(){
        System.out.println("*******************");
        System.out.println("T E L E V I S Ã O");
        System.out.println("*******************");
        System.out.println("Marca      : " + getMarca());
        System.out.println("Polegadas  : " + getPolegadas());
        System.out.println("Portas HDMI: " + getPortasHdmi());
        System.out.println("Peso       : " + getPeso());
        System.out.println("Preço      : " + getPreco());
    }
}
