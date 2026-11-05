/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author David
 */
import java.util.ArrayList;
import Classe.Carro;
import Classe.Moto;
import Classe.Onibus;
import Classe.Motor;

class App {
public static void main(String[] args) {
ArrayList<Carro> carros = new ArrayList<>();
ArrayList<Moto> motos = new ArrayList<>();
ArrayList<Onibus> onibus = new ArrayList<>();


for(int i=1; i<=5; i++){
carros.add(new Carro(50000+i*1000, "MarcaC"+i, "ABC-10"+i, new Motor(100+i, 1000*i, "Gasolina"), i+2, 100+i));
motos.add(new Moto(12000+i*800, "MarcaM"+i, "XYZ-20"+i, new Motor(50+i, 2000*i, "Gasolina"), 20+i));
onibus.add(new Onibus(300000+i*5000, "MarcaO"+i, "BUS-30"+i, new Motor(200+i, 800*i, "Diesel"), 30+i, i%2==0));
}


System.out.println("=== CARROS ===");
carros.forEach(Carro::imprimir);
System.out.println("=== MOTOS ===");
motos.forEach(Moto::imprimir);
System.out.println("=== ÔNIBUS ===");
onibus.forEach(Onibus::imprimir);
}
}
