/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leitoresvariaveis;
import java.util.Scanner;

/**
 *
 * @author guest-vksics
 */
public class LeitorScanner {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        boolean bool;
        System.out.print("Entre com um valor do tipo boolean: ");
        bool = leitura.nextBoolean();
        System.out.println("Valor do booleano: " + bool + "\n");
        
        byte byt;
        System.out.print("Entre com um valor do tipo byte: ");
        byt = leitura.nextByte();
        System.out.println("Valor do Byte: " + byt + "\n");
        
        short shor;
        System.out.print("Entre com um valor do tipo short: ");
        shor = leitura.nextShort();
        System.out.println("Valor do short: " + shor + "\n");
        
        int i;
        System.out.print("Entre com um valor do tipo int: ");
        i = leitura.nextInt();
        System.out.println("Valor do inteiro: " + i + "\n");
        
        long lon;
        System.out.print("Entre com um valor do tipo long: ");
        lon = leitura.nextLong();
        System.out.println("Valor do long: " + lon + "\n");
        
        float f;
        System.out.print("Entre com um valor do tipo float: ");
        f = leitura.nextFloat();
        System.out.println("Valor do float: " + f + "\n");
        
        double d;
        System.out.print("Entre com um valor do tipo double: ");
        d = leitura.nextDouble();
        System.out.println("Valor do double: " + d + "\n");
        
        char c;
        System.out.print("Entre com um valor do tipo char: ");
        c = leitura.next().charAt(0);
        System.out.println("Valor do char: " + c + "\n");
        
        String str;
        System.out.print("Entre com um valor do tipo string: ");
        str = leitura.next();
        System.out.println("Valor da string: " + str + "\n");
        
        String lin;
        System.out.print("Entre com um valor do tipo string: ");
        lin = leitura.next();
        System.out.println("Valor da string: " + lin + "\n");
        leitura.nextLine();
    }
}


