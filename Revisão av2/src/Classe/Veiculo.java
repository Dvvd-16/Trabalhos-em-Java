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

abstract class Veiculo implements SegurancaVeicular {
protected double preco;
protected Motor motor;
protected String marca;
protected final int idadeMinimaMotorista = 18;
protected String placa;


// 6 construtores
public Veiculo() {}
public Veiculo(double preco) { this.preco = preco; }
public Veiculo(double preco, String marca) {
this.preco = preco; this.marca = marca;
}
public Veiculo(double preco, String marca, String placa) {
this.preco = preco; this.marca = marca; this.placa = placa;
}
public Veiculo(double preco, String marca, String placa, Motor motor) {
this.preco = preco; this.marca = marca; this.placa = placa; this.motor = motor;
}
public Veiculo(String marca, Motor motor) {
this.marca = marca; this.motor = motor;
}


public double getPreco() { return preco; }
public void setPreco(double preco) { this.preco = preco; }


public Motor getMotor() { return motor; }
public void setMotor(Motor motor) { this.motor = motor; }


public String getMarca() { return marca; }
public void setMarca(String marca) { this.marca = marca; }


public String getPlaca() { return placa; }
public void setPlaca(String placa) { this.placa = placa; }


public int getIdadeMinimaMotorista() { return idadeMinimaMotorista; }

public void cadastrar(double preco, String marca, String placa, Motor motor) {
    this.preco = preco;
    this.marca = marca;
    this.placa = placa;
    this.motor = motor;
}

public void imprimir() {
    System.out.println("Preço: " + preco);
    System.out.println("Marca: " + marca);
    System.out.println("Placa: " + placa);
    System.out.println("Motor:");
    if (motor != null) motor.imprimir();
}

public void entradaDados() {
    Scanner sc = new Scanner(System.in);
    boolean valido = false;

    while (!valido) {
        try {
            System.out.print("Preço: ");
            this.preco = sc.nextDouble();
            valido = true;
        } catch (Exception e) {
            System.out.println("Digite um número real válido.");
            sc.nextLine();
        }
    }

    sc.nextLine(); 
    System.out.print("Marca: ");
    this.marca = sc.nextLine();

    System.out.print("Placa: ");
    this.placa = sc.nextLine();

    System.out.println("Cadastro do Motor:");
    this.motor = new Motor();
    this.motor.entradaDados();
}

}
