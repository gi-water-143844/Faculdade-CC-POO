/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote3;
import pacote1.Paciente;
import pacote2.Medico;
/**
 *
 * @author User
 */
public class ProntuarioPaciente {
    private Medico medico;
    private Paciente paciente;
    private String sintomas;
    private String diagnostico;
    private String prescricaoTratamento;

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
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricaoTratamento() {
        return prescricaoTratamento;
    }

    public void setPrescricaoTratamento(String prescricaoTratamento) {
        this.prescricaoTratamento = prescricaoTratamento;
    }
    
    public void mostraProntuario(){
        System.out.println("-----PRONTUARIO-----");
        System.out.println("NOME DO MEDICO: "+ this.medico.getNome());
        System.out.println("NOME DO PACIENTE: "+this.paciente.getNome());
        System.out.println("SINTOMAS: "+sintomas);
        System.out.println("DIAGNOSTICO: "+diagnostico);
        System.out.println("PRESCRICAO DE TRATAMENTO: "+prescricaoTratamento);
    }
    
}