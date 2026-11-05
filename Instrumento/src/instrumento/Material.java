/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumento;

/**
 *
 * @author David
 */
public class Material extends Instrumento {
    String material;
    
    public Material(){}
    
    public Material(String m){
        super(m);
    }
    
    public Material(String m, String t){
        super(m, t);
    }
    
    public Material(String m, String t, double p){
        super(m, t, p);
    }
    
    public Material(String m, String t, double p, String ma){
        super(m, t, p);
        material = ma;
    }
    
    public String getMaterial(){ return material; }
    public void setMaterial(String ma){ material = ma;}
    
    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Material: "+ material);
    }
}
