/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guest-b1afsy
 */
public class Candidato {
    private String nome;
    private int qtd_votos;
    
    private void addVoto() {
        qtd_votos += 1;
    }
    
    public void cadastrar(String nome) {
        this.nome = nome;
        this.qtd_votos = 0;
    }
    
    public void votacao() {
        addVoto();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_votos() {
        return qtd_votos;
    }

    public void setQtd_votos(int qtd_votos) {
        this.qtd_votos = qtd_votos;
    }
    
    public void mostra() {
        System.out.println("Candidato: " + this.nome + "\nTotal votos: " + this.qtd_votos);
    }
}
