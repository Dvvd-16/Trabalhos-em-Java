/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumento;

/**
 *
 * @author David
 */
public class Violao extends Material{
    double numcordas;
    boolean eletrico;
    
    public Violao(){}
    
    public Violao(String m, String t){
        super(m, t);
    }
    
    public Violao(String m, String t, double p){
        super(m, t, p);
    }
    
    public Violao(String m, String t, double p, String ma){
        super(m, t, p, ma);
    }
    
    public Violao(String m, String t, double p, String ma, double n){
        super(m, t, p, ma);
        numcordas = n;
    }
    
    public Violao(String m, String t, double p, String ma, double n, boolean e){
        super(m, t, p, ma);
        numcordas = n;
        eletrico = e;
    }
    
    public double getNumcordas(){return numcordas;}
    public void setNumcordas(double n){numcordas = n;}
    public boolean getEletrico(){return eletrico;}
    public void setEletrico(boolean e){eletrico = e;}
    
    
    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Número de cordas: "+ numcordas);
        System.out.println("Elétrico: "+ eletrico);
    }
}