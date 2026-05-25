/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;
import pacote1.Pessoa;
import pacote2.Medico;
/**
 *
 * @author User
 */
public class Paciente extends Pessoa {
    private String convenio;
    private String tipoSanguineo;
    private double altura;
    private double peso;
    private String doencasPreExistentes;
    private String dataCadastro;
    private String ultimaConsulta;
    private String proximaConsulta;
    private Medico medicoResponsavel;
    
    private String fuma;
    private String bebe;
    private float colesterol;
    private String diabete;
    private String doencaCardiaca;
    private String Cirurgias;
    private String alergias;

    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma, Medico medico) {
        if (medico != null) {
            this.fuma = fuma;
        }
    }

    public String getBebe() {
        return bebe;
    }

    public void setBebe(String bebe, Medico medico) {
        if (medico != null) {
            this.bebe = bebe;
        }
    }

    public float getColesterol() {
        return colesterol;
    }

    public void setColesterol(float colesterol, Medico medico) {
        if (medico != null) {
            this.colesterol = colesterol;
        }        
    }

    public String getDiabete() {
        return diabete;
    }

    public void setDiabete(String diabete, Medico medico) {
        if (medico != null) {
            this.diabete = diabete;
        }  
    }

    public String getDoencaCardiaca() {
        return doencaCardiaca;
    }

    public void setDoencaCardiaca(String doencaCardiaca, Medico medico) {
        if (medico != null) {
            this.doencaCardiaca = doencaCardiaca;
        }  
    }

    public String getCirurgias() {
        return Cirurgias;
    }

    public void setCirurgias(String Cirurgias, Medico medico) {
        if (medico != null) {
            this.Cirurgias = Cirurgias;
        } 
        
    }
    
    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias, Medico medico) {
        if (medico != null) {
            this.alergias = alergias;
        } 
        
    }
 
    public Paciente(){
    }
    
    public Paciente(String nome, String sobrenome, int cpf, String genero, String dataNascimento,String email,int telefone, String endereco,String convenio,String tipoSanguineo, double altura,double peso,String doencasPreExistentes,String dataCadastro,String ultimaConsulta,String proximaConsulta,Medico medicoResponsavel){
        super(nome,sobrenome,cpf,genero,dataNascimento,email,telefone,endereco);
        this.convenio = convenio;
        this.tipoSanguineo = tipoSanguineo;
        this.altura =altura;
        this.peso = peso;
        this.doencasPreExistentes = doencasPreExistentes;
        this.dataCadastro = dataCadastro;
        this.ultimaConsulta= ultimaConsulta;
        this.proximaConsulta = proximaConsulta;
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDoencasPreExistentes() {
        return doencasPreExistentes;
    }

    public void setDoencasPreExistentes(String doencasPreExistentes) {
        this.doencasPreExistentes = doencasPreExistentes;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getUltimaConsulta() {
        return ultimaConsulta;
    }

    public void setUltimaConsulta(String ultimaConsulta) {
        this.ultimaConsulta = ultimaConsulta;
    }

    public String getProximaConsulta() {
        return proximaConsulta;
    }

    public void setProximaConsulta(String proximaConsulta) {
        this.proximaConsulta = proximaConsulta;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }
    
    public void mostraPaciente(){
        System.out.println("-----PACIENTE-----");
        System.out.println("NOME: " + this.getNome());
        System.out.println("SOBRENOME: "+ this.getSobrenome());
        System.out.println("CONVENIO: "+convenio);
        System.out.println("TIPO SANGUINEO: "+tipoSanguineo);
    }
}