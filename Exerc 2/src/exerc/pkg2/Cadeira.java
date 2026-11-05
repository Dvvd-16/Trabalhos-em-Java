/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerc.pkg2;

/**
 *
 * @author David
 */
public class Cadeira {
    String material;
    boolean estofada;
    int pernas;
    long codigoFabricacao;
    double preco;
    public void setMaterial(String m){
        if(!m.isEmpty()){
            material = m;
        }
    }
    public String getMaterial(){
        return material;
    }
    public void setEstofada(boolean e){
        estofada = e;
    }
    public boolean getEstofada(){
        return estofada;
    }
    public void setPernas(int p){
        if(p>=0){
            pernas = p;
        }
    }
    public int getPernas(){
        return pernas;
    }
    public void setCodigoFabricacao(long c){
        if(c>0){
            codigoFabricacao = c;
        }
    }
    public long getCodigoFabricacao(){
        return codigoFabricacao;
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
        System.out.println("***********************");
        System.out.println("C A D E I R A");
        System.out.println("***********************");
        System.out.println("Material            : " + getMaterial());
        System.out.println("Estofamento         : " + getEstofada());
        System.out.println("Quantidade de pernas: " + getPernas());
        System.out.println("Codigo de fabricação: " + getCodigoFabricacao());
        System.out.println("Preço               : " + getPreco());
    }
}
