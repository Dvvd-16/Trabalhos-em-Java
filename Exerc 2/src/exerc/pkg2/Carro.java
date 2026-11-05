/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerc.pkg2;

/**
 *
 * @author David
 */
public class Carro {
    String modelo;
    int ano;
    boolean automatico;
    short portas;
    double preco;
    
    public void setModelo(String m){
        if(!m.isEmpty()){
            modelo = m;
        }
    }
    public String getModelo(){
        return modelo;
    }
    public void setAno(int a){
        if(a>1000){
            ano = a;
        }
    }
    public int getAno(){
        return ano;
    }
    public void setAutomatico(boolean au){
        automatico = au;
    }
    public boolean getAutomatico(){
        return automatico;
    }
    public void setPortas(short p){
        if(p>0){
            portas = p;
        }
    }
    public short getPortas(){
        return portas;
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
        System.out.println("*********************");
        System.out.println("C A R R O");
        System.out.println("*********************");
        System.out.println("Modelo           : " + getModelo());
        System.out.println("Ano              : " + getAno());
        System.out.println("Automatico       : " + getAutomatico());
        System.out.println("Númerod de portas: " + getPortas());
        System.out.println("Preço            : " + getPreco());
        
    }
}
