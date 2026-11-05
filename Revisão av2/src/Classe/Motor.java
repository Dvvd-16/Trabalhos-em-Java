/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author David
 */

import java.util.Scanner;

public class Motor {
private int potencia;
private int rpm;
private String tipoCombustivel;


// 5 Construtores mínimos
public Motor() {}
public Motor(int potencia) { this.potencia = potencia; }
public Motor(int potencia, int rpm) { this.potencia = potencia; this.rpm = rpm; }
public Motor(int potencia, int rpm, String tipoCombustivel) {
this.potencia = potencia; this.rpm = rpm; this.tipoCombustivel = tipoCombustivel;
}
public Motor(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }


public int getPotencia() { return potencia; }
public void setPotencia(int potencia) { this.potencia = potencia; }


public int getRpm() { return rpm; }
public void setRpm(int rpm) { this.rpm = rpm; }


public String getTipoCombustivel() { return tipoCombustivel; }
public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }


public void cadastrar(int potencia, int rpm, String tipoCombustivel) {
this.potencia = potencia;
this.rpm = rpm;
this.tipoCombustivel = tipoCombustivel;
}


public void imprimir() {
System.out.println("Potência: " + potencia);
System.out.println("RPM: " + rpm);
System.out.println("Tipo Combustível: " + tipoCombustivel);
}

public void entradaDados() {
    Scanner sc = new Scanner(System.in);
    boolean valido = false;

    // Potência (inteiro, >= 0)
    while (!valido) {
        try {
            System.out.print("Potência (int, >=0): ");
            this.potencia = sc.nextInt();
            if (this.potencia < 0) {
                System.out.println("Potência não pode ser negativa.");
            } else {
                valido = true;
            }
        } catch (Exception e) {
            System.out.println("Digite um número inteiro válido para potência.");
            sc.nextLine();
        }
    }

    // RPM (inteiro, >= 0)
    valido = false;
    while (!valido) {
        try {
            System.out.print("RPM (int, >=0): ");
            this.rpm = sc.nextInt();
            if (this.rpm < 0) {
                System.out.println("RPM não pode ser negativo.");
            } else {
                valido = true;
            }
        } catch (Exception e) {
            System.out.println("Digite um número inteiro válido para RPM.");
            sc.nextLine();
        }
    }

    sc.nextLine(); // limpar buffer
    System.out.print("Tipo de combustível: ");
    this.tipoCombustivel = sc.nextLine();
}

}
