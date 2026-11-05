/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletrodomesticos;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Eletrodomesticos {
    String modelo, marca;
    int volume; 
    double preco;
    Porta porta1 = new Porta();
    
    public Eletrodomesticos(){}
    
    public Eletrodomesticos(String m){
        modelo = m;
    }
    public Eletrodomesticos(String m, String ma){
        modelo = m;
        marca = ma;
    }
    public Eletrodomesticos(String m, String ma, int v){
        modelo = m;
        marca = ma;
        volume = v;
    }
    public Eletrodomesticos(String m, String ma, int v, double pr){
        modelo = m;
        marca = ma;
        volume = v;
        preco = pr;
    }
    public Eletrodomesticos(String m, String ma, int v, double pr, Porta p){
        modelo = m;
        marca = ma;
        volume = v;
        preco = pr;
        porta1 = p;
    }
    
    void setModelo(String m){
        modelo = m;
    }
    void setMarca(String ma){
        marca = ma;
    }
    void setVolume(int v){
        volume = v;
    }
    void setPreco(double p){
        preco = p;
    }
    
    String getModelo(){
        return modelo;
    }
    String getMarca(){
        return marca;
    }
    int getVolume(){
        return volume;
    }
    double getPreco(){
        return preco;
    }
    
    public void EntradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o modelo -> ");
        setModelo(sc.nextLine());
        System.out.println("Entre com a marca -> ");
        setMarca(sc.nextLine());
        System.out.println("Entre com o volume -> ");
        setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre com o preço -> ");
        setPreco(Double.parseDouble(sc.nextLine()));
        porta1.EntradaDados();
    }
    
    public void Cadastrar(String m, String ma, int v, double pr, double c, double l, boolean p){
        setModelo(m);
        setMarca(ma);
        setVolume(v);
        setPreco(pr);
        porta1.Cadastrar(c, l, p);
    }
    
    public void Imprimir(){
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Volume: "+ getVolume());
        System.out.println("Preço: "+ getPreco());
        porta1.Imprimir();
    }
}
