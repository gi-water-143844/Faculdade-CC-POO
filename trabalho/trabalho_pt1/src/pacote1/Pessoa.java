/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote1;

/**
 *
 * @author User
 */
public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected int cpf;
    protected String genero;
    protected String dataNascimento;
    protected String email;
    protected int telefone;
    protected String endereco;
    
    protected Pessoa(){
    }
    
    protected Pessoa(String nome, String sobrenome, int cpf, String genero, String dataNascimento,String email,int telefone, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.email= email;
        this.telefone = telefone;
        this.endereco = endereco;
        
    }
    // Não vou usar a classe Pessoa, vou só usar ela como mãe
    
    
    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getSobrenome() {
        return sobrenome;
    }

    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    protected int getCpf() {
        return cpf;
    }

    protected void setCpf(int cpf) {
        this.cpf = cpf;
    }

    protected String getGenero() {
        return genero;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    protected String getDataNascimento() {
        return dataNascimento;
    }

    protected void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    protected void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    protected String getEndereco() {
        return endereco;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}