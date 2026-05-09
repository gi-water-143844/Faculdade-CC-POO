/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int fator, resultado=1;
        
        System.out.print("Qual fator deseja fatorar? (n!): ");
        fator = leitura.nextInt();
        
        for (int i=1; i<=fator; i++){
            resultado *= i;
        }
        
        System.out.println(fator + "! = " + resultado + "\n");
    }
}
