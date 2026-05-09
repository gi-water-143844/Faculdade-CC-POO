/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercícios_aula1;
import java.util.Scanner;
/**
 *
 * @author guest-vksics
 */
public class Exercícios_aula1 {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float peso, altura;
        System.out.print("Informe seu peso: ");
        peso = leitura.nextFloat();
        System.out.print("Informe sua altura: ");
        altura = leitura.nextFloat();
        
        float imc = peso/(altura*altura);
        
        System.out.println("IMC = " + imc);
        
        if (imc < 18.5){
            System.out.println("Está abaixo do peso");
        }
        else if (imc>=18.5 && imc<=24.9){
            System.out.println("Peso normal");
        }
        else {
            System.out.println("Está acima do peso");
        }
    }
}
