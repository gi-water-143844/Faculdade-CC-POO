/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hora;

/**
 *
 * @author guest-y4npu4
 */
public class Hora {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora() {
        
    }
    
    public Hora(int h, int m, int s) {
        setHorario(h, m, s);
    }
    
    public Hora(int h) {
        setHorario(h,0,0);
    }
    
    public void setHorario(int h, int m, int s) {
        hora = h;
        minuto = m;
        segundo = s;
    }
    public void setHora(int h) {
        hora = h;
    }
    public void setMinutos(int m) {
        minuto = m;
    }
    public void setSegundos(int s) {
        segundo = s;
    }
    
    public String getHorario() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
