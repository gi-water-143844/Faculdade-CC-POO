/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiplosCinco;
import java.util.Scanner;

public class MultiplosCinco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Múltiplos de 5 (de 1 a 100):\n");
        for (int i=1; i<101; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        }
    }
}
