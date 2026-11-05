/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Carro extends Veiculo {
private int numeroPassageiros, volumeMala;
public Carro() {}
public Carro(int passageiros) { this.numeroPassageiros = passageiros; }
public Carro(int passageiros, int mala) { this.numeroPassageiros = passageiros; this.volumeMala = mala; }
public Carro(double preco) { super(preco); }
public Carro(double preco, String marca) { super(preco, marca); }
public Carro(double preco, String marca, String placa) { super(preco, marca, placa); }
public Carro(double preco, String marca, String placa, Motor m) { super(preco, marca, placa, m); }
public Carro(String marca, Motor m) { super(marca, m); }
public Carro(double preco, String marca, String placa, Motor m, int passageiros, int mala) { super(preco, marca, placa, m); this.numeroPassageiros = passageiros; this.volumeMala = mala; }


public void cadastrar(int passageiros, int mala, double preco, String marca, String placa, Motor motor) {
this.numeroPassageiros = passageiros;
this.volumeMala = mala;
this.preco = preco;
this.marca = marca;
this.placa = placa;
this.motor = motor;
}

@Override
public void imprimir() {
    System.out.println("===== CARRO =====");
    System.out.println("Passageiros: " + numeroPassageiros);
    System.out.println("Volume Mala: " + volumeMala);
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
            System.out.print("Volume da mala: ");
            this.volumeMala = sc.nextInt();
            valido = true;
        } catch (Exception e) {
            System.out.println("Digite um inteiro válido.");
            sc.nextLine();
        }
    }

    super.entradaDados();
}


public double desconto() { return preco * 0.90; }


public void acelerar() { motor.setRpm(motor.getRpm() + 100); }
public void desacelerar() { motor.setRpm(motor.getRpm() - 100); }
public void frear() { System.out.println("Carro freando"); }
public void virarDireita() { System.out.println("Carro virando à direita"); }
public void virarEsquerda() { System.out.println("Carro virando à esquerda"); }
}
