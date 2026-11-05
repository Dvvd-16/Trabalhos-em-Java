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

public class Moto extends Veiculo {
private int volumeBagageiro;


// 8 construtores
public Moto() {}
public Moto(int bagageiro) { this.volumeBagageiro = bagageiro; }
public Moto(double preco) { super(preco); }
public Moto(double preco, String marca) { super(preco, marca); }
public Moto(double preco, String marca, String placa) { super(preco, marca, placa); }
public Moto(double preco, String marca, String placa, Motor m) { super(preco, marca, placa, m); }
public Moto(String marca, Motor m) { super(marca, m); }
public Moto(int bagageiro, Motor m) { this.volumeBagageiro = bagageiro; this.motor = m; }
public Moto(double preco, String marca, String placa, Motor m,int bagageiro) { super(preco, marca, placa); this.volumeBagageiro = bagageiro; }

public void cadastrar(int bagageiro, double preco, String marca, String placa, Motor motor) {
this.volumeBagageiro = bagageiro;
this.preco = preco;
this.marca = marca;
this.placa = placa;
this.motor = motor;
}


@Override
public void imprimir() {
    System.out.println("===== MOTO =====");
    System.out.println("Volume Bagageiro: " + volumeBagageiro);
    super.imprimir();
}

@Override
public void entradaDados() {
    Scanner sc = new Scanner(System.in);
    boolean valido = false;

    while (!valido) {
        try {
            System.out.print("Volume do bagageiro: ");
            this.volumeBagageiro = sc.nextInt();
            valido = true;
        } catch (Exception e) {
            System.out.println("Digite um inteiro válido.");
            sc.nextLine();
        }
    }

    super.entradaDados();
}


public double desconto() { return preco * 0.92; }


public void acelerar() { motor.setRpm(motor.getRpm() + 200); }
public void desacelerar() { motor.setRpm(motor.getRpm() - 200); }
public void frear() { System.out.println("Moto freando"); }
public void virarDireita() { System.out.println("Moto virando à direita"); }
public void virarEsquerda() { System.out.println("Moto virando à esquerda"); }
}