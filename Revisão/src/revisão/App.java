/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisão;

/**
 *
 * @author David
 */
public class App {
    public static void main(String[] args) {
        // Criando 3 objetos Chinelo
        Chinelo ch1 = new Chinelo("Havaianas", 30.0, 39, "Azul", true, true);
        Chinelo ch2 = new Chinelo("Ipanema", 25.0);
        Chinelo ch3 = new Chinelo(true, false);

        // Criando 3 objetos Tenis (agora herdando de Fechados)
        Tenis t1 = new Tenis("Nike", 399.0, 42, "Preto", true, true);
        Tenis t2 = new Tenis("Adidas", 350.0);
        Tenis t3 = new Tenis(true); // apenas esportivo

        // Criando 3 objetos Sapato (também herdando de Fechados)
        Sapato s1 = new Sapato("Ferracini", 450.0, 41, "Marrom", true, "Social");
        Sapato s2 = new Sapato("Democrata", 299.0);
        Sapato s3 = new Sapato("Casual"); // apenas modelo

        // Impressão dos objetos
        System.out.println("\n--- Chinelos ---");
        ch1.imprimir();
        ch2.imprimir();
        ch3.imprimir();

        System.out.println("\n--- Tênis ---");
        t1.imprimir();
        t2.imprimir();
        t3.imprimir();

        System.out.println("\n--- Sapatos ---");
        s1.imprimir();
        s2.imprimir();
        s3.imprimir();
    }
}

