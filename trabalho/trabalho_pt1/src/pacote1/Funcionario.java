/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

/**
 *
 * @author User
 */
public class Funcionario extends Pessoa {
    protected String cargo;
    protected double salario;
    protected String dataAdmissao;
    protected int cargaHorariaSemanal;
    protected int numeroRegistro;
    protected String status; // (ativo, afastado, férias)
    protected String turno; // (manhã, tarde, noite)

    protected Funcionario(){
    }
    
    protected Funcionario(String nome, String sobrenome, int cpf, String genero, String dataNascimento,String email,int telefone, String endereco, String cargo, double salario, String dataAdmissao, int cargaHorariaSemanal, int numeroRegistro, String status, String turno){
        super(nome,sobrenome,cpf,genero,dataNascimento,email,telefone,endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.numeroRegistro = numeroRegistro;
        this.status = status;
        this.turno = turno;
    }
    
    protected String getCargo() {
        return cargo;
    }

    protected void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    protected String getDataAdmissao() {
        return dataAdmissao;
    }

    protected void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    protected int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    protected void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    protected int getNumeroRegistro() {
        return numeroRegistro;
    }

    protected void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    protected String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    protected String getTurno() {
        return turno;
    }

    protected void setTurno(String turno) {
        this.turno = turno;
    }
    
    
}