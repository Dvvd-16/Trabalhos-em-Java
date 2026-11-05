/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11092025;

/**
 *
 * @author uezo
 */
public class PenDrive {
    String marca;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;
    public void setMarca(String m){
        if(!m.isEmpty()){
            marca = m;
        }
    }
    public String getMarca(){
        return marca;
    }
    public void setCapacidade(int ca){
        if (ca>=0){
            capacidade = ca;
        }
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setComprimento(double co){
        if (co>=0){
            comprimento = co;
        }
    }
    public double getComprimento(){
        return comprimento;
    }
    public void setLargura(double la){
        if (la>=0){
            largura = la;
        }
    }
    public double getLargura(){
        return largura;
    }
    public void setProfundidade(double pro){
        if (pro>=0){
            profundidade = pro;
        }
    }
    public double getProfundidade(){
        return profundidade;
    }
    public void setPeso(double pe){
        if(pe>=0){
            peso = pe;
        }
    }
    public double getPeso(){
        return peso;
    }
    public void setPreco(double pre){
        if(pre>=0){
            preco = pre;
        }
    }
    public double getPreco(){
        return preco;
    }
    public void imprimir(){
        System.out.println("***********************************");
        System.out.println("Marca       : " + getMarca());
        System.out.println("Capacidade  : " + getCapacidade());
        System.out.println("Comprimento : " + getComprimento());
        System.out.println("Largura     : " + getLargura());
        System.out.println("Profundidade: " + getProfundidade());
        System.out.println("Peso        : " + getPeso());
        System.out.println("Preco       : " + getPreco());
    }
}
