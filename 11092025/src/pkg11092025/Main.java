/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11092025;

/**
 *
 * @author uezo
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PenDrive p1 = new PenDrive();
    p1.setMarca("Kingston");
    p1.setCapacidade(64);
    p1.setComprimento(10);
    p1.setLargura(5);
    p1.setProfundidade(2.5);
    p1.setPeso(1.5);
    p1.setPreco(120.00);
    p1.imprimir();
    }
    
}
