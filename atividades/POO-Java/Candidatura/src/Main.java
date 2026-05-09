/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author guest-b1afsy
 */
public class Main {
    public static void main(String[] args){
        Candidato cand1 = new Candidato();
        Candidato cand2 = new Candidato();
        Scanner sc = new Scanner(System.in);
        
        cand1.cadastrar("Guilherme");
        cand2.cadastrar("Giovana");
        
        System.out.println("--Inicio--");
        cand1.mostra();
        cand2.mostra();
        
        int opcao;
        do {
            System.out.print("Escolha um candidato para votar:\n1- Guilherme\n2- Giovana\n-- opção (digite 0 para finalizar): ");
            opcao = sc.nextInt();
            if(opcao == 1){
                cand1.votacao();
            } else {
                cand2.votacao();
            }
        } while (opcao != 0);
        
        System.out.println("--Fim--");
        cand1.mostra();
        cand2.mostra();
    }
}
