/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosParesAnteriores;
import java.util.Scanner;

public class NumerosParesAnteriores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        int num;
        
        System.out.print("Informe um número: ");
        num = leitura.nextInt();
        
        System.out.print("Números pares abaixo de " + num + ":\n");
        for (int i=num; i>=0; --i) {
            if (i%2==0 && i!=num) {
                System.out.println(i);
            }
        }
    }
}
