package entities;

/**
 *
 * @author simon
 */

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nome;
    private String email;
    private String senha;
    private List<Livro> listaLivrosEmprestados = new ArrayList<>();
    
    public Usuario() {
    }
    
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario: " + nome;
    }
    
    public void adicionarLivroEmprestado(Livro livro) {
        // Adicione o livro à lista de livros emprestados pelo usuário
        listaLivrosEmprestados.add(livro);
    }
    
    public void removerLivroEmprestado(Livro livro) {
        // Remove o livro da lista de livros emprestados pelo usuário
        listaLivrosEmprestados.removeIf(l -> l.equals(livro));
    }
}
