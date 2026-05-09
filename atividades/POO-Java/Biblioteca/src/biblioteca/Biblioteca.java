/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Livros livro1 = new Livros("O Jardim Secreto","Frances H. Bernett","Drama","Camelot Editora",1911,1,176);
        Usuarios usuario1 = new Usuarios("Giovana",18,"Feminino",999999999);
        Emprestimos emp1 = new Emprestimos();
        
        livro1.imprimeLivro();
        emp1.realizarEmprestimo("28/04/2026","08:57",livro1,usuario1);
        emp1.imprimirEmprestimo();
        
        System.out.println();
        livro1.imprimeLivro();
        
        System.out.println();
        emp1.getLivro().abrirLivro();
        emp1.getUsuario().lerLivro();
        emp1.getLivro().fecharLivro();
        emp1.devolverLivro();
        
        System.out.println();
        livro1.imprimeLivro();
    }  
}
