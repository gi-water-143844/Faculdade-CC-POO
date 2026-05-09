/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Herança.Automovel;

/**
 *
 * @author guest-xx1ha8
 */
public class Heranca {
    
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        
        carro.setNumPlaca("GGG-0000");
        carro.setNumPortas(4);
        carro.setCapacidade(5);
        carro.setNumRodas(4);
        
        Automovel carro2 = new Automovel(4, 4, "GGG-1111", 4);
        carro.imprimeDadosAutomovel();
        carro2.imprimeDadosAutomovel();
    }
}
