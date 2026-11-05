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
public class MicroOndas extends Eletrodomesticos {
    int potenciaMinima, potenciaMaxima;
    
    public MicroOndas(){}
    public MicroOndas(String m){
        super(m);
    }
    public MicroOndas(String m, String ma){
        super(m, ma);
    }
    public MicroOndas(String m, String ma, int v){
        super(m, ma, v);
    }
    public MicroOndas(String m, String ma, int v, double pr){
        super(m, ma, v, pr);
    }
    public MicroOndas(String m, String ma, int v, double pr, Porta po){
        super(m, ma, v, pr, po);
    }
    public MicroOndas(String m, String ma, int v, double pr, Porta po,int pmi){
        super(m, ma, v, pr, po);
        potenciaMinima = pmi;
    }
    public MicroOndas(String m, String ma, int v, double pr, Porta po, int pmi, int pma){
        super(m, ma, v, pr, po);
        potenciaMinima = pmi;
        potenciaMaxima = pma;
    }
    
    void setPotenciaMinima(int pmi){
        potenciaMinima = pmi;
    }
    void setPotenciaMaxima(int pma){
        potenciaMaxima = pma;
    }
    
    int getPotenciaMinima(){
        return potenciaMinima;
    }
    int getPotenciaMaxima(){
        return potenciaMaxima;
    }
    
    @Override
    public void EntradaDados(){
        Scanner sc = new Scanner(System.in);
        super.EntradaDados();
        System.out.println("Entre com a temperatura mínima -> ");
        setPotenciaMinima(Integer.parseInt(sc.nextLine()));
        System.out.println("Entre com a temperatura máxima -> ");
        setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
    }
    
    public void Cadastrar(String m, String ma, int v, double pr, double c, double l, boolean p, int pma, int pmi, double c1, double l1, boolean p1){
        setPotenciaMinima(pmi);
        setPotenciaMaxima(pma);
        super.Cadastrar(m, ma, v, pr, c, l, p);
    }
    
    @Override
    public void Imprimir(){
        System.out.println("***** Microondas *****");
        System.out.println("Potencia Minima: "+ getPotenciaMinima());
        System.out.println("Potencia Maxima: "+ getPotenciaMaxima());
        super.Imprimir();
    }
}
