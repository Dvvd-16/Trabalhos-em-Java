/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumento;

/**
 *
 * @author David
 */
public class Teclado extends Instrumento{
    double numteclas;
    boolean eletrico;
    
    public Teclado(){}
    
    public Teclado(String m, String t){
        super(m, t);    
    }
    
    public Teclado(String m, String t, double p){
        super(m, t, p);    
    }
    
    public Teclado(String m, String t, double p, double n){
        super(m, t, p);
        numteclas = n;
    }
    
    public Teclado(String m, String t, double p, double n, boolean e){
        super(m, t, p);
        numteclas = n;
        eletrico = e;
    }
    
    public double getNumteclas(){ return numteclas;}
    public void setNumteclas(double n){ numteclas = n;}
    public boolean getEletrico(){ return eletrico;}
    public void setEletrico(boolean e){ eletrico = e;}
    
    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Número de teclas>: "+ numteclas);
        System.out.println("Eletrico :"+ eletrico);
    }
}
