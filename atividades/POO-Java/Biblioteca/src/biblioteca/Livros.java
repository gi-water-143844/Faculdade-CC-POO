/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Livros {
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private int ano;
    private int edicao;
    private int numPaginas;
    private boolean emprestimo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public Livros() {
        
    }

    public Livros(String titulo, String autor, String genero, String editora, int ano, int edicao, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numPaginas = numPaginas;
        this.emprestimo = false;
    }

    public boolean getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void abrirLivro() {
        System.out.println("O livro está aberto.");
    }
    
    public void fecharLivro() {
        System.out.println("O livro está fechado.");
    }
    
    public void imprimeLivro() {
        System.out.println("----LIVRO----");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Status: " + getEmprestimo());
    }
}
