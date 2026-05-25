/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote4;

import pacote2.Secretaria;
import pacote3.Consulta;

/**
 *
 * @author User
 */
public class RelatorioConsulta { // secretaria usa esse
    protected Consulta consulta;
    protected Secretaria secretaria;
    
    public RelatorioConsulta(){
    }
    
    public RelatorioConsulta(Consulta consulta, Secretaria secretaria){
        this.consulta = consulta;
        this.secretaria = secretaria;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }
    
    public void mostraRelatoriaConsulta(){
        System.out.println("-----RELATORIO CONSULTA-----");
        System.out.println("DATA DA CONSULTA: "+ consulta.getData());
        System.out.println("HORARIO DA CONSULTA: "+ consulta.getHorario());
        System.out.println("SECRETARIA: "+ secretaria.getNome());
    }
}