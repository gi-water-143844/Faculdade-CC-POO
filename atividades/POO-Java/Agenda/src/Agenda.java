/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guest-rd0a7f
 */
public class Agenda {
    private int dia;
    private int mes;
    private int ano;
    private String anotacao;
    
    public void anote(int dia, int mes, int ano, String nota) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.anotacao = nota;
        validaData();
    }
    
    private void validaData() {
        if ((dia<1) || (dia>31) || (mes<1) || (mes>12)) {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "ANOTAÇÃO NÃO INSERIDA: DATA INVÁLIDA";
        }
    }
    
    public void mostraAnotacao() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + ": " + this.anotacao);
    }
}
