/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote5;
import pacote1.*;
import pacote2.*;
import pacote3.*;
import pacote4.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------CLINICA AGJ----------");
        //cria vetores (listas) para armazenar objetos de cada tipo da clinica
        ArrayList<Medico> medicos = new ArrayList();
        ArrayList<Secretaria> secretarias = new ArrayList();
        
        Medico medico1 = new Medico("Dr Carlos","Mendes",123456789,"M","10/05/1980","carlos@clinica.com",1197777,
                "Rua A, 100","Cardiologista",12000.0,"01/01/2015",40,101,"ativo","manh�","Cardiologia");
        
        Secretaria sec1 = new Secretaria("Ana","Lima",987654321,"F","20/08/1995","ana@clinica.com",1197766,
                "Rua B, 200","Secretaria",3000.0,"10/02/2020",40,202,"ativo","tarde");
        
        Paciente p1 = new Paciente("Jo�o","Silva",111222333,"M","15/03/1990","joao@email.com",119999988,
                "Rua C, 300","Particular","O+",1.75,80.0,"Nenhuma","01/05/2026","20/04/2026","05/05/2026",medico1);
        
        Paciente p2 = new Paciente("Maria","Souza",444555666,"F","25/07/1985",null,0,"Rua D, 400",
                "Plano de Sa�de","A+",1.60,65.0,"Diabetes","02/05/2026","21/04/2026","06/05/2026",medico1);
        
        GerenciadorMensagem gm = new GerenciadorMensagem("Pedro","Silva",999888777,"M","01/01/1990","sistema@clinica.com",
                119666655, "Sistema","Mensagens",5000.0,"01/01/2023",40,303,"ativo","manh�");
        
        Consulta c1 = new Consulta("02/05/2026","10:00",medico1,p1,2,30);

        Consulta c2 = new Consulta("02/05/2026","11:00",medico1,p2,1,30);
        
        //adiciona os objetos em suas respectivas listas
        medicos.add(medico1);
        secretarias.add(sec1);
        sec1.cadastrarPaciente(p1);
        sec1.cadastrarPaciente(p2);
        sec1.cadastrarConsulta(c1);
        sec1.cadastrarConsulta(c2);
        
        System.out.println();
        System.out.println("-----EQUIPE-----");
        medico1.mostrarMedico();
        sec1.mostrarSecretaria();
        gm.mostrarGerenciadorMensagem();
        
        System.out.println();
        sec1.mostraPaciente();
        
        System.out.println();
        sec1.mostraConsulta();
        
        System.out.println();
        System.out.println("-----ACOES-----");
        gm.enviarMensagemPaciente(c1);
        gm.enviarMensagemPaciente(c2);
        
        sec1.cadastrarPaciente(p1);
        sec1.cadastrarPaciente(p1);
        sec1.cadastrarConsulta(c1);
        sec1.cadastrarConsulta(c2);
        
        RelatorioConsulta relatorioConsulta1 = new RelatorioConsulta(c1, sec1);
        sec1.gerarRelatorioConsulta(relatorioConsulta1);
        RelatorioConsulta relatorioConsulta2 = new RelatorioConsulta(c2, sec1);
        sec1.gerarRelatorioConsulta(relatorioConsulta2);
        
        sec1.ataulizaPesoPaciente(p1, 82.5);
        sec1.ataulizaAlturaPaciente(p1, 1.78);
        sec1.ataulizaConvenioPaciente(p1, "Plano Premium");
        sec1.atualizaDataConsulta(c1, "03/05/2026");
        sec1.atualizaHorarioConsulta(c1, "14:00");
        sec1.atualizaDuracaoConsulta(c1, 45);
        
        medico1.cadastrarDadosAdicionaisPaciante(p2, "fuma sim", "bebe sim", 0, "tem diabete", "n�o", "n�o", "dipirona");
        
        sec1.removerConsulta(c2);
        sec1.removerPaciente(p2);
        ProntuarioPaciente pr1 = new ProntuarioPaciente();

        medico1.cadastrarProntuario(pr1);
        medico1.atualizaSintomasProntuario(pr1, "Dor de cabe�a e febre");
        medico1.atualizaDiagnosticoProntuario(pr1, "Virose");
        medico1.atualizaPrescricaoProntuario(pr1, "Dipirona 500mg");
        medico1.atualizaAlergiasPaciente(p1, "Penicilina");
        medico1.atualizaDiabetePaciente(p1, "N�o");
        medico1.atualizaDoencaCardiacaPaciente(p1, "N�o");
        medico1.removeAlergiasPaciente(p1, null);
        medico1.atualizaDiagnosticoProntuario(pr1, "Gripe");
    }
}