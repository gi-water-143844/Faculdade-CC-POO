/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guest-rd0a7f
 */
public class Main {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(02, 10, 2012, "DIA DAS CRIANÇAS");
        agenda2.anote(07, 15, 2012, "INDEPENDÊNCIA DO BRASIL");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
}
