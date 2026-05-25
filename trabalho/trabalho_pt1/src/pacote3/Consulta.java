/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote3;
import pacote2.Medico;
import pacote1.Paciente;
/**
 *
 * @author User
 */
public class Consulta {
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;
    private float duracaoConsulta;
    private float duracaoRetorno;
    
    public Consulta(){
    }
    
    public Consulta(String data,String horario,Medico medico,Paciente paciente,float duracaoConsulta,float duracaoRetorno){
        this.data = data;
        this.horario= horario;
        this.medico = medico;
        this.paciente = paciente;
        this.duracaoConsulta = duracaoConsulta;
        this.duracaoRetorno = duracaoRetorno;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public float getDuracaoConsulta() {
        return duracaoConsulta;
    }

    public void setDuracaoConsulta(float duracaoConsulta) {
        this.duracaoConsulta = duracaoConsulta;
    }

    public float getDuracaoRetorno() {
        return duracaoRetorno;
    }

    public void setDuracaoRetorno(float duracaoRetorno) {
        this.duracaoRetorno = duracaoRetorno;
    }
    
    public void mostraConsulta(){
        System.out.println("-----DADOS DA CONSULTA-----");
        System.out.println("DATA: " +data);
        System.out.println("HORARIO: "+horario);
        System.out.println("MEDICO: "+medico.getNome());
        System.out.println("PACIENTE: " + paciente.getNome());
        System.out.println("DURA��O DA CONSULTA: "+ duracaoConsulta);
        System.out.println("DURA��O DO RETORNO: "+ duracaoRetorno);
    }
}