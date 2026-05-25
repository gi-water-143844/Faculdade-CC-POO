/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote2;
import pacote1.Paciente;
import pacote1.Funcionario;
import pacote2.Medico;

import java.time.LocalDate; //pegar data de amanh�
import java.time.format.DateTimeFormatter;
import pacote3.Consulta;
import pacote4.RelatorioConsulta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/**
 *
 * @author User
 */
public class Secretaria extends Funcionario{
    ArrayList<Paciente> pacientes = new ArrayList();
    ArrayList<Consulta> consultas = new ArrayList();
    // remover objeto: meuObjeto = null;
    public Secretaria(){
    }
    
    public Secretaria(String nome, String sobrenome, int cpf, String genero, String dataNascimento,String email,int telefone, String endereco,String cargo, double salario, String dataAdmissao, int cargaHorariaSemanal, int numeroRegistro, String status, String turno) {
        super(nome,sobrenome,cpf,genero,dataNascimento,email,telefone,endereco,cargo,salario,dataAdmissao,cargaHorariaSemanal, numeroRegistro, status, turno);
    }
    
    public void cadastrarPaciente(Paciente paciente){
        pacientes.add(paciente);
        System.out.println("PACIENTE CADASTRADO!");
    }
    
    public void mostraPaciente() {
        Iterator<Paciente> i = pacientes.iterator();
        while(i.hasNext()) {
            i.next().mostraPaciente();
        }
    }
    
    public void ataulizaConvenioPaciente(Paciente paciente,String novoConvenio) {
        paciente.setConvenio(novoConvenio);
    }
    
    public void ataulizaAlturaPaciente(Paciente paciente,double novaAltura) {
        paciente.setAltura(novaAltura);
    }
    
    public void ataulizaPesoPaciente(Paciente paciente,double novoPeso) {
        paciente.setPeso(novoPeso);
    }
    
    public void ataulizaDoencasPaciente(Paciente paciente,String novaDoenca) {
        paciente.setDoencasPreExistentes(novaDoenca);
    }
    
    public void ataulizaUltimaConsultaPaciente(Paciente paciente,String ultimaConsultaAtualizada) {
        paciente.setUltimaConsulta(ultimaConsultaAtualizada);
    }
    
    public void ataulizaProximaConsultaPaciente(Paciente paciente,String proximaConsultaAtualizada) {
        paciente.setProximaConsulta(proximaConsultaAtualizada);
    }
    
    public void ataulizaMedicoResponsaveltaPaciente(Paciente paciente,Medico NovomedicoResponsavel) {
        paciente.setMedicoResponsavel(NovomedicoResponsavel);
    }
    
    public void removerPaciente(Paciente paciente){
        pacientes.remove(paciente);
        System.out.println("PACIENTE REMOVIDO!");
    }
    
    public void cadastrarConsulta(Consulta consulta){
        consultas.add(consulta);
        System.out.println("CONSULTA CADASTRADA!");
    }
    
    public void mostraConsulta() {
        Iterator<Consulta> i = consultas.iterator();
        while(i.hasNext()) {
            i.next().mostraConsulta();
        }
    }
    
    public void atualizaDataConsulta(Consulta consulta,String data){
        consulta.setData(data);
    }
    
    public void atualizaHorarioConsulta(Consulta consulta,String horario){
        consulta.setHorario(horario);
    }
    
    public void atualizaMedicoConsulta(Consulta consulta,Medico medico){
        consulta.setMedico(medico);
    }
    
    public void atualizaPacienteConsulta(Consulta consulta,Paciente paciente){
        consulta.setPaciente(paciente);
    }
    
    public void atualizaDuracaoConsulta(Consulta consulta,float duracaoConsulta){
        consulta.setDuracaoConsulta(duracaoConsulta);
    }
    
    public void atualizaDuracaoRetorno(Consulta consulta,float duracaoRetorno){
        consulta.setDuracaoRetorno(duracaoRetorno);
    }
    
    public void removerConsulta(Consulta consulta){
        consultas.remove(consulta);
        System.out.println("CONSULTA REMOVIDA!");
    }
    
    public void gerarRelatorioConsulta(RelatorioConsulta relatorioConsulta){
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // amanha.format(formatter));
        if (relatorioConsulta.getConsulta().getData().equals(amanha.format(formatter))){
            if (relatorioConsulta.getConsulta().getPaciente().getEmail() != null || relatorioConsulta.getConsulta().getPaciente().getTelefone() != 0) {
                System.out.println("COM CONTATO: " + relatorioConsulta.getConsulta().getPaciente().getNome());
            } else {
                System.out.println("SEM CONTATO: " + relatorioConsulta.getConsulta().getPaciente().getNome());
            }
        }
    }
    
    public void mostrarSecretaria(){
        System.out.println("-----SECRETARIA-----");
        System.out.println("NOME: " + this.getNome());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("TURNO: "+ this.getTurno());
    }
}