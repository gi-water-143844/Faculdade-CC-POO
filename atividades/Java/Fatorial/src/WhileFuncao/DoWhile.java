/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileFuncao;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        byte opcao;
        int a, b;
        float resultado=0;
        
        do {
            System.out.print("Escolha uma opção:\n"
                    + "(0) SAIR\n"
                    + "(1) SOMAR\n"
                    + "(2) SUBTRAIR\n"
                    + "(3) MULTIPLICAR\n"
                    + "(4) DIVIDIR\n"
                    + "--- opção: ");
            opcao = leitura.nextByte();
            
            if (opcao!=0) {
                System.out.print("\nInforme valor a: ");
                a = leitura.nextInt();
                System.out.print("\nInforme valor b: ");
                b = leitura.nextInt();
                
                if (opcao==1)
                    resultado = a+b;
                else {
                    if (opcao==2)
                        resultado = a-b;
                    else {
                        if (opcao==3)
                            resultado = a*b;
                        else {
                            if (opcao==4) {
                                if (b!=0)
                                    resultado = a/b;
                                else {
                                    System.out.println("b deve ser diferente de zero para ocorrer a divisão!\n");
                                }
                            }
                        }
                    }
                }
                System.out.println("Resultado: " + resultado + "\n");
                resultado = 0;  //reseta o resultado
            }
        } while ((opcao!=0) && (opcao<=4));
    }
}
