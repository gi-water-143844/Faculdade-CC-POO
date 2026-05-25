/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote4;

import pacote2.Medico;

/**
 *
 * @author User
 */
public class RelatorioMedico{ // complemento da secretaria, s� o m�dico usa
    private Medico medico;
    private String receita;
    private String atestado;
    private String declaracaoAcompanhante;
    private int cientesDoMes;
    
    public RelatorioMedico(){
    }
    
    public RelatorioMedico(Medico medico, String receita, String atestado, String declaracaoAcompanhante, int cientesDoMes){
        this.medico = medico;
        this.receita = receita;
        this.atestado = atestado;
        this.declaracaoAcompanhante = declaracaoAcompanhante;
        this.cientesDoMes = cientesDoMes;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getAtestado() {
        return atestado;
    }

    public void setAtestado(String atestado) {
        this.atestado = atestado;
    }

    public String getDeclaracaoAcompanhante() {
        return declaracaoAcompanhante;
    }

    public void setDeclaracaoAcompanhante(String declaracaoAcompanhante) {
        this.declaracaoAcompanhante = declaracaoAcompanhante;
    }

    public int getCientesDoMes() {
        return cientesDoMes;
    }

    public void setCientesDoMes(int cientesDoMes) {
        this.cientesDoMes = cientesDoMes;
    }
    
    public void mostraRelatorioMedico(){
        System.out.println("-----RELATORIO MEDICO-----");
        System.out.println("MEDICO: "+ medico.getNome());
        System.out.println("RECEITA: "+receita );
        System.out.println("DECLARACAO PARA ACOMPANHANTE: "+declaracaoAcompanhante);
        System.out.println("CLIENTES DO MES: "+cientesDoMes);
    }
}