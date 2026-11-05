/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerc.pkg2;

/**
 *
 * @author David
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadeira c1 = new Cadeira();
        c1.setMaterial("Madeira");
        c1.setEstofada(true);
        c1.setPernas(4);
        c1.setCodigoFabricacao(20525);
        c1.setPreco(30.0);
        c1.imprimir();
        
        Mesa m1 = new Mesa();
        m1.setMaterial("Marmore");
        m1.setAnoFabricacao((short)2024);
        m1.setAltura((byte)60);
        m1.setLargura(80);
        m1.setPreco(80.50);
        m1.imprimir();
        
        Televisao t3 = new Televisao();
        t3.setMarca("LG");
        t3.setPolegadas(50);
        t3.setPortasHdmi((byte)4);
        t3.setPeso(25);
        t3.setPreco(450.0);
        t3.imprimir();
        
        Geladeira g1 = new Geladeira();
        g1.setMarca("Samsumg");
        g1.setCapacidadeLitros(1000);
        g1.setCor('B');
        g1.setPortas((byte)4);
        g1.setPreco(2000);
        g1.imprimir();
        
        Carro ca1 = new Carro();
        ca1.setModelo("Dodge Ram");
        ca1.setAno(2024);
        ca1.setAutomatico(true);
        ca1.setPortas((short)2);
        ca1.setPreco(45000);
        ca1.imprimir();
    }
    
}
