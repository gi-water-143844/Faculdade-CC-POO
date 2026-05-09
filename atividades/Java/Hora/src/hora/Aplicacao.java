/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author guest-y4npu4
 */
public class Aplicacao {
    
    public static void main(String[] args) {
        Hora horaDoAlmoco;
        
        horaDoAlmoco = new Hora();
        horaDoAlmoco.setHorario(12,30,00);
        
        Hora horaAtual = new Hora(12,30,00);
        System.out.println(horaAtual.getHorario());
        
        Hora pooInicio = new Hora();
        pooInicio.setHora(7);
        
        
        Hora horarioNovo = new Hora();
        horarioNovo.setHorario(13, 30, 00);
        System.out.println(horarioNovo.getHorario());
        horarioNovo.setHora(14);
        System.out.println(horarioNovo.getHorario());
    }
}
