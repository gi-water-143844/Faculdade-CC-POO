/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematica;
import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int a, b, c, delta;
        double x1, x2;
        
        System.out.print("Informe a, b, c pertencentes a equação de 2º grau:\nax²+bx+c=0\na= ");
        a = leitura.nextInt();
        if (a!=0){
            System.out.print("\nb= ");
            b = leitura.nextInt();
            System.out.print("\nc= ");
            c = leitura.nextInt();
            
            delta = (b*b) - (4*a*c);
            
            if (delta>=0) {
                double raiz = Math.sqrt(delta);
                x1 = (-b + raiz)/(2*a);
                x2 = (-b - raiz)/(2*a);
                
                System.out.println("Raízes:\nx_1 = " + x1 + "\nx_2 = " + x2 + "\n");
            }
            else {
                System.out.print("\n---erro: Delta negativo!\n");
            }
        }
        else {
            System.out.print("\n'a' deve ser diferente de zero!\n");
        }
    }   
}
