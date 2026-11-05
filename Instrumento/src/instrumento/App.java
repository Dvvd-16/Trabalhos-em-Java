/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumento;

/**
 *
 * @author David
 */
import java.util.Scanner;

public class App {
    public static void main(String[]args) {
        String marca, tipo;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca do violão: ");
        marca = sc.nextLine();
        System.out.println("Digite o tipo do violão: ");
        tipo = sc.nextLine();
        Violao v2 = new Violao(marca, tipo);
        v2.Imprimir();
        
        System.out.println("-------------------------");
        Teclado t1 = new Teclado("Toshiba", "Teclas");
        t1.Imprimir();
        Teclado t2 = new Teclado("Amazon", "Teclas", 250.0, 32.0);
        t2.Imprimir();
        System.out.println("-------------------------");
        Violao v1 = new Violao("Tagima", "Cordas", 200.0, "Madeira", 6.0, true);
        v1.Imprimir();
        
        
}
}
