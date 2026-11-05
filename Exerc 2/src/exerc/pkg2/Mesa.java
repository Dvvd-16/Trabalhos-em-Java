/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerc.pkg2;

/**
 *
 * @author David
 */
public class Mesa {
    String material;
    short anoFabricacao;
    byte altura;
    float largura;
    double preco;
    public void setMaterial(String m){
        if(!m.isEmpty()){
            material = m;
        }
    }
    public String getMaterial(){
        return material;
    }
    public void setAnoFabricacao(short af){
        if(af>=1900 && af<=2025){
            anoFabricacao = af;
        }
    }
    public short getAnoFabricacao(){
        return anoFabricacao;
    }
    public void setAltura(byte a){
        if(a>10 && a<75){
            altura = a;
        }
    }
    public byte getAltura(){
        return altura;
    }
    public void setLargura(float l){
        if(l>0.0f){
            largura = l;
        }
    }
    public float getLargura(){
        return largura;
    }
    public void setPreco(double p){
        if(p>=0){
            preco = p;
        }
    }
    public double getPreco(){
        return preco;
    }
    public void imprimir(){
        System.out.println("*********************");
        System.out.println("M E S A");
        System.out.println("*********************");
        System.out.println("Material         : " + getMaterial());
        System.out.println("Ano de fabircação: " + getAnoFabricacao());
        System.out.println("Altura           : " + getAltura());
        System.out.println("Largura          : " + getLargura());
        System.out.println("Preço            : " + getPreco());
    }
}
