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

public class Onibus extends Veiculo {
private int numeroPassageiros;
private boolean banheiro;


// 8 construtores
public Onibus() {}
public Onibus(int passageiros) { this.numeroPassageiros = passageiros; }
public Onibus(boolean banheiro) { this.banheiro = banheiro; }
public Onibus(double preco) { super(preco); }
public Onibus(double preco, String marca) { super(preco, marca); }
public Onibus(double preco, String marca, String placa) { super(preco, marca, placa); }
public Onibus(double preco, String marca, String placa, Motor m) { super(preco, marca, placa, m); }
public Onibus(int passageiros, boolean banheiro, Motor m) {
this.numeroPassageiros = passageiros; this.banheiro = banheiro; this.motor = m;
}
public Onibus(double preco, String marca, String placa, Motor m, int passageiros, boolean banheiro){super(preco, marca, placa, m);this.numeroPassageiros = passageiros; this.banheiro = banheiro; this.motor = m;}


public void cadastrar(int passageiros, boolean banheiro, double preco, String marca, String placa, Motor motor) {
this.numeroPassageiros = passageiros;
this.banheiro = banheiro;
this.preco = preco;
this.marca = marca;
this.placa = placa;
this.motor = motor;
}


@Override
public void imprimir() {
    System.out.println("===== ÔNIBUS =====");
    System.out.println("Passageiros: " + numeroPassageiros);
    System.out.println("Banheiro: " + banheiro);
    super.imprimir();
}

@Override
public void entradaDados() {
    Scanner sc = new Scanner(System.in);
    boolean valido = false;

    while (!valido) {
        try {
            System.out.print("Número de passageiros: ");
            this.numeroPassageiros = sc.nextInt();
            valido = true;
        } catch (Exception e) {
            System.out.println("Digite um inteiro válido.");
            sc.nextLine();
        }
    }

    valido = false;
    while (!valido) {
        try {
            System.out.print("Ônibus possui banheiro? (1 = sim, 0 = não): ");
            int op = sc.nextInt();
            if (op == 0 || op == 1) {
                this.banheiro = (op == 1);
                valido = true;
            } else {
                System.out.println("Digite 1 ou 0.");
            }
        } catch (Exception e) {
            System.out.println("Digite 1 ou 0.");
            sc.nextLine();
        }
    }

    super.entradaDados();
}

public double desconto() { return preco * 0.85; }


public void acelerar() { motor.setRpm(motor.getRpm() + 50); }
public void desacelerar() { motor.setRpm(motor.getRpm() - 50); }
public void frear() { System.out.println("Ônibus freando"); }
public void virarDireita() { System.out.println("Ônibus virando à direita"); }
public void virarEsquerda() { System.out.println("Ônibus virando à esquerda"); }
}
