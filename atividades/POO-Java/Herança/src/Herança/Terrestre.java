/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author guest-xx1ha8
 */
public class Terrestre extends Transporte{
    protected int numRodas;
    
    public Terrestre() {
        
    }
    
    public Terrestre(int capacidade, int numRodas) {
        super(capacidade);
        this.numRodas = numRodas;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
}
