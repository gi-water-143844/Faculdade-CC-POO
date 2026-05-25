/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote2;
import pacote3.Consulta;

import java.time.LocalDate; //pegar data de amanh�
import java.time.format.DateTimeFormatter;
import pacote1.Funcionario;
/**
 *
 * @author User
 */
public class GerenciadorMensagem extends Funcionario{
    public GerenciadorMensagem(){
    }
    
    public GerenciadorMensagem(String nome, String sobrenome, int cpf, String genero, String dataNascimento,String email,int telefone, String endereco,String cargo, double salario, String dataAdmissao, int cargaHorariaSemanal, int numeroRegistro, String status, String turno){
        super(nome,sobrenome,cpf,genero,dataNascimento,email,telefone,endereco,cargo,salario,dataAdmissao,cargaHorariaSemanal, numeroRegistro, status, turno);
    }
    
    public void enviarMensagemPaciente(Consulta consulta){
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // amanha.format(formatter));
        if (consulta.getData().equals(amanha.format(formatter))){
            System.out.println("Oi, "+consulta.getPaciente().getNome()+"! AmanhA tem sua consulta as "+ consulta.getHorario()+"! At� l�!");
        }
    }
    
    public void mostrarGerenciadorMensagem(){
        System.out.println("-----GERENCIADOR DE MENSAGEM-----");
        System.out.println("NOME: " + this.getNome());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("TURNO: "+ this.getTurno());
    }
}