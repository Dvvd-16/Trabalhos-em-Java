/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletrodomesticos;

/**
 *
 * @author David
 */
import java.util.Scanner;

public class Porta {
    double comprimento, largura;
    boolean possuiVidro;
    
    public Porta(){}
    
    public Porta(double c){
        comprimento = c;
    }
    
    public Porta(double c, double l){
        comprimento = c;
        largura = l;
    }
    
    public Porta(double c, double l, boolean p){
        comprimento = c;
        largura = l;
        possuiVidro = p;
    }
    
    void setComprimento(double c){
        comprimento = c;
    }
    void setLargura(double l){
        largura = l;
    }
    void setPossuiVidro(boolean p){
        possuiVidro = p;
    }
    
    double getComprimento(){
        return comprimento;
    }
    double getLargura(){
        return largura;
    }
    boolean getPossuiVidro(){
        return possuiVidro;
    }
    
    public void EntradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o comprimento da porta -> ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre com a largura da porta -> ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("A porta possui vidro? (true/false) -> ");
        setPossuiVidro(sc.nextBoolean());
    }
    
    public void Cadastrar(double c, double l, boolean p){
        setComprimento(c);
        setLargura(l);
        setPossuiVidro(p);
    }
    
    public void Imprimir(){
        System.out.println("Comprimento da porta: "+ getComprimento());
        System.out.println("Largura da porta: "+ getLargura());
        System.out.println("A porta possui vidro: "+ getPossuiVidro());
    }
}