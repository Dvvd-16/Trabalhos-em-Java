/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerc.pkg2;

/**
 *
 * @author David
 */
public class Geladeira {
    String marca;
    int capacidadeLitros;
    char cor;
    byte portas;
    double preco;
    
    public void setMarca(String m){
        if(!m.isEmpty()){
            marca = m;
        }
    }
    public String getMarca(){
        return marca;
    }
    public void setCapacidadeLitros(int cl){
        if(cl>0){
            capacidadeLitros = cl;
        }
    }
    public int getCapacidadeLitros(){
        return capacidadeLitros;
    }
    public void setCor(char c){
        if(c == 'P'|| c == 'B'|| c == 'C'){
            cor = c;
        }
    }
    public char getCor(){
        return cor;
    }
    public void setPortas(byte p){
        if(p>0){
            portas = p;
        }
    }
    public byte getPortas(){
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
        System.out.println("*************************");
        System.out.println("G E L A D E I R A");
        System.out.println("*************************");
        System.out.println("Marca               : " + getMarca());
        System.out.println("Capacidade de litros: " + getCapacidadeLitros());
        System.out.println("Cor                 : " + getCor());
        System.out.println("Número de portas    : " + getPortas());
        System.out.println("Preço               : " + getPreco());
    }
}
