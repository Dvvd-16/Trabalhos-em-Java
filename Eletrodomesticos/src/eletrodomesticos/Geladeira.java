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

public class Geladeira extends Eletrodomesticos {
    double temperaturaMinima, temperaturaMaxima;
    Porta porta2 = new Porta();
    
    public Geladeira(){}
    public Geladeira(String m){
        super(m);
    }
    public Geladeira(String m, String ma){
        super(m, ma);
    }
    public Geladeira(String m, String ma, int v){
        super(m, ma, v);
    }
    public Geladeira(String m, String ma, int v, double pr){
        super(m, ma, v, pr);
    }
    public Geladeira(String m, String ma, int v, double pr, Porta po){
        super(m, ma, v, pr, po);
    }
    public Geladeira(String m, String ma, int v, double pr, Porta po,double tmi){
        super(m, ma, v, pr, po);
        temperaturaMinima = tmi;
    }
    public Geladeira(String m, String ma, int v, double pr, Porta po,double tmi, double tma){
        super(m, ma, v, pr, po);
        temperaturaMinima = tmi;
        temperaturaMaxima = tma;
    }
    public Geladeira(String m, String ma, int v, double pr, Porta po,double tmi, double tma, Porta po2){
        super(m, ma, v, pr, po);
        temperaturaMinima = tmi;
        temperaturaMaxima = tma;
        porta2 = po2;
    }
    
    void setTemperaturaMinima(double tmi){
        temperaturaMinima = tmi;
    }
    void setTemperaturaMaxima(double tma){
        temperaturaMaxima = tma;
    }
    
    double getTemperaturaMinima(){
        return temperaturaMinima;
    }
    double getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
    
    @Override
    public void EntradaDados(){
        Scanner sc = new Scanner(System.in);
        super.EntradaDados();
        System.out.println("Entre com a temperatura mínima -> ");
        setTemperaturaMinima(Double.parseDouble(sc.nextLine()));
        System.out.println("Entre com a temperatura máxima -> ");
        setTemperaturaMaxima(Double.parseDouble(sc.nextLine()));
        porta2.EntradaDados();
    }
    
    public void Cadastrar(String m, String ma, int v, double pr, double c, double l, boolean p, double tma, double tmi, double c1, double l1, boolean p1){
        setTemperaturaMinima(tmi);
        setTemperaturaMaxima(tma);
        super.Cadastrar(m, ma, v, pr, c, l, p);
        porta2.Cadastrar(c1, l1, p1);
    }
    
    @Override
    public void Imprimir(){
        System.out.println("***** Geladeira *****");
        System.out.println("Temperatura Minima: "+ getTemperaturaMinima());
        System.out.println("Temperatura Maxima: "+ getTemperaturaMaxima());
        super.Imprimir();
        porta2.Imprimir();
    }
}