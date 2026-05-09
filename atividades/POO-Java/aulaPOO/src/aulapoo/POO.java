/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo;
import java.util.Scanner;
/**
 *
 * @author guest-0uerlu
 */
public class POO {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Carro meuCarro = new Carro();
        Carro outroCarro = new Carro("HB20","Branco","AFS2654",4);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Guilherme", "Loiro", 20);
        
        //atribuição direta
        meuCarro.setTipo("Fusca");
        meuCarro.setCor("Azul");
        meuCarro.setPlaca("WBT1675");
        meuCarro.setNumPortas(2);
        
        //atribuição com scanner
        System.out.print("Informe o nome da pessoa: ");
        pessoa1.setNome(leitura.next());
        System.out.print("Informe a cor do Cabelo: ");
        pessoa1.setCorDoCabelo(leitura.next());
        System.out.print("Informe a idade: ");
        pessoa1.setIdade(leitura.nextInt());
        
        
        System.out.println("\n----CARRO1----");
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("n° de portas: " + meuCarro.getNumPortas());
        
        System.out.println("\n----PESSOA1----");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Cor do cabelo: " + pessoa1.getCorDoCabelo());
        System.out.println("Idade: " + pessoa1.getIdade());
        
        System.out.println("\n----CARRO2----");
        System.out.println("Tipo: " + outroCarro.getTipo());
        System.out.println("Cor: " + outroCarro.getCor());
        System.out.println("Placa: " + outroCarro.getPlaca());
        System.out.println("n° de portas: " + outroCarro.getNumPortas());
        
        System.out.println("\n----PESSOA2----");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Cor do cabelo: " + pessoa2.getCorDoCabelo());
        System.out.println("Idade: " + pessoa2.getIdade());
        
        System.out.println("\n");
        
        pessoa2.setCarro(outroCarro);
        pessoa2.ligarCarro();
        pessoa2.setCambioMarcha(1);
        pessoa2.getCarro().getCambio();
        pessoa2.acelerarCarro();
        
        System.out.println();
        
        pessoa2.setCambioMarcha(2);
        pessoa2.getCarro().getCambio();
        pessoa2.acelerarCarro();
        
        System.out.println();
        
        pessoa2.setCambioMarcha(3);
        pessoa2.getCarro().getCambio();
        pessoa2.acelerarCarro();
        
        System.out.println();
        
        pessoa2.setCambioMarcha(2);
        pessoa2.getCarro().getCambio();
        pessoa2.acelerarCarro();
        
        System.out.println();
        
        pessoa2.setCambioMarcha(1);
        pessoa2.getCarro().getCambio();
        pessoa2.acelerarCarro();
        
        System.out.println();
        
        pessoa2.setCambioMarcha(0);
        pessoa2.getCarro().getCambio();
        pessoa2.frearCarro();
        pessoa2.desligarCarro();
    }    
}