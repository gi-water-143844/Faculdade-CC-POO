/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author guest-xx1ha8
 */
public class Automovel extends Terrestre{
    private String numPlaca;
    private int numPortas;
    
    public Automovel() {
        
    }
    
    public Automovel(int capacidade, int numRodas, String numPlaca, int numPortas) {
        super(capacidade, numRodas);
        this.numPlaca = numPlaca;
        this.numPortas = numPortas;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public void imprimeDadosAutomovel() {
        System.out.println("CAPACIDADE: " + capacidade);
        System.out.println("NUMERO DE RODAS: " + numRodas);
    }
}
