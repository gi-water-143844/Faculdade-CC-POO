/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo;

/**
 *
 * @author guest-0uerlu
 */
public class Pessoa {
    private String nome;
    private String corDoCabelo;
    private int idade;
    private Carro carro;
    
    public Pessoa () {
        
    }
    
    public Pessoa (String nome, String corDoCabelo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }
    
    public String getCorDoCabelo() {
        return corDoCabelo;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }
    
    public void ligarCarro() {
        carro.ligar();
    }
    
    public void desligarCarro() {
        carro.desligar();
    }
    
    public void acelerarCarro() {
        carro.acelerar();
    }
    
    public void frearCarro() {
        carro.frear();
    }
    
    public void setCambioMarcha(int marcha) {
        carro.setCambio(marcha);
    }
}

