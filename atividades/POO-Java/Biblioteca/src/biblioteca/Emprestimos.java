/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Emprestimos {
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Livros livro;
    private Usuarios usuario;

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }
    
    public Emprestimos() {
        
    }

    public Emprestimos(String dataEmprestimo, String horaEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public void realizarEmprestimo(String dataEmprestimo, String horaEmprestimo, Livros livro, Usuarios usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
        livro.setEmprestimo(true);
        System.out.println("\nEmpréstimo concluído!");
    }
    
    public void imprimirEmprestimo() {
        System.out.println("\n---EMPRESTIMO---");
        System.out.println("Livro: " + getLivro().getTitulo());
        System.out.println("Usuário: " + getUsuario().getNome());
        System.out.println("Data: " + getDataEmprestimo());
    }
    
    public void devolverLivro() {
        livro.setEmprestimo(false);
        System.out.println("O livro foi devolvido.");
    }
}
