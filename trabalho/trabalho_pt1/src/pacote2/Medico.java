/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote2;
import pacote3.ProntuarioPaciente;
import pacote1.Funcionario;
import pacote1.Paciente;
/**
 *
 * @author User
 */
public class Medico extends Funcionario{
    public String areaAtuacao;
    
    public Medico(){
    }
    
    public Medico(String nome, String sobrenome, int cpf, String genero, String dataNascimento,String email,int telefone, String endereco,String cargo, double salario, String dataAdmissao, int cargaHorariaSemanal, int numeroRegistro, String status, String turno,String areaAtuacao){
        super(nome,sobrenome,cpf,genero,dataNascimento,email,telefone,endereco,cargo,salario,dataAdmissao,cargaHorariaSemanal, numeroRegistro, status, turno);
        this.areaAtuacao = areaAtuacao;
    }

    public void cadastrarDadosAdicionaisPaciante(Paciente paciente, String fuma, String bebe, float colesterol, String diabete, String doencaCardiaca, String cirurgias, String alergias){
        paciente.setFuma(fuma, this);
        paciente.setBebe(bebe, this);
        paciente.setColesterol(colesterol, this);
        paciente.setDiabete(diabete, this);
        paciente.setDoencaCardiaca(doencaCardiaca, this);
        paciente.setCirurgias(cirurgias, this);
        paciente.setAlergias(alergias, this);
    }
    
    public void atualizaFumaPaciente(Paciente paciente, String fuma){
        paciente.setFuma(fuma, this);
    }
    
    public void atualizaBebePaciente(Paciente paciente, String bebe){
        paciente.setBebe(bebe, this);
    }
    
    public void atualizaColesterolPaciente(Paciente paciente, float colesterol){
        paciente.setColesterol(colesterol, this);
    }
    
    public void atualizaDiabetePaciente(Paciente paciente, String diabete){
        paciente.setDiabete(diabete, this);
    }
    
    public void atualizaDoencaCardiacaPaciente(Paciente paciente, String doencaCardiaca){
        paciente.setDoencaCardiaca(doencaCardiaca, this);
    }
    
    public void atualizaCirurgiasPaciente(Paciente paciente, String cirurgias){
        paciente.setCirurgias(cirurgias, this);
    }
    
    public void atualizaAlergiasPaciente(Paciente paciente, String alergias){
        paciente.setAlergias(alergias, this);
    }
    
    public void removeFumaPaciente(Paciente paciente, String fuma){
        paciente.setFuma(null, this);
    }
    
    public void removeDiabetePaciente(Paciente paciente, String diabete){
        paciente.setDiabete(null, this);
    }
    
    public void removeDoencaCardiacaPaciente(Paciente paciente, String doencaCardiaca){
        paciente.setDoencaCardiaca(null, this);
    }
    
    public void removeCirurgiasPaciente(Paciente paciente, String cirurgias){
        paciente.setCirurgias(null, this);
    }
    
    public void removeAlergiasPaciente(Paciente paciente, String alergias){
        paciente.setAlergias(null, this);
    }
    
    public void removeBebePaciente(Paciente paciente, String bebe){
        paciente.setBebe(null, this);
    }
    
    public void removeColesterolPaciente(Paciente paciente, float colesterol){
        paciente.setColesterol(0, this);
    }
    
    public String getAreaAtuacao() {
            return areaAtuacao;
        }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    public void cadastrarProntuario(ProntuarioPaciente prontuarioPaciente){
        System.out.println("Prontu�rio Cadastrado");
    }
    
    public void atualizaSintomasProntuario(ProntuarioPaciente prontuarioPaciente,String sintomas){
        prontuarioPaciente.setSintomas(sintomas);
    }
    
    public void atualizaDiagnosticoProntuario(ProntuarioPaciente prontuarioPaciente,String diagnostico){
        prontuarioPaciente.setDiagnostico(diagnostico);
    }
    
    public void atualizaPrescricaoProntuario(ProntuarioPaciente prontuarioPaciente,String prescricaoTratamento){
        prontuarioPaciente.setPrescricaoTratamento(prescricaoTratamento);
    }
    
    public void removerProntuario(ProntuarioPaciente prontuarioPaciente){
        prontuarioPaciente = null;
    }
    
    public void mostrarMedico(){
        System.out.println("-----MEDICO-----");
        System.out.println("NOME: " + this.getNome());
        System.out.println("AREA: "+ areaAtuacao);
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("TURNO: "+ this.getTurno());
    }
    
}