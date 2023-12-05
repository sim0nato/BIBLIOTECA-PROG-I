package services;

/**
 *
 * @author simon
 */

import entities.Livro;
import entities.Usuario;
import services.UsuarioService;
import java.util.ArrayList;
import java.util.List;

public class LivroService {
    private static List<Livro> listaLivros = new ArrayList<>();

    // Método para cadastrar um novo livro
    public static void cadastrarLivro(Livro livro) {
        // Verifica se já existe um livro com as mesmas características
        for (Livro livroExistente : listaLivros) {
            if (livroExistente.getTitulo().equals(livro.getTitulo()) &&
                livroExistente.getAutor().equals(livro.getAutor()) &&
                livroExistente.getGenero().equals(livro.getGenero()) &&
                livroExistente.getIdioma().equals(livro.getIdioma())) {
            
                // Livro já existe, incrementa apenas a quantidade disponível
                livroExistente.adicionarQuantidadeDisponivel();
                return; // Sai do método, pois o livro já foi encontrado
            }
        }
        // Caso não exista o livro, cria um novo
        listaLivros.add(livro);
        livro.adicionarQuantidadeDisponivel();
    }

    // Método para obter a lista de livros cadastrados
    public static List<Livro> obterListaLivros() {
        return listaLivros;
    }
    
    // Método para encontrar um livro pelo título e idioma
    public static Livro encontrarLivro(String titulo, String idioma) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equals(titulo) && livro.getIdioma().equals(idioma)) {
                return livro;
            }
        }
        return null;
    }
    
    public static Usuario encontrarUsuario(String nomeUsuario) {
        for (Usuario usuario : UsuarioService.obterListaUsuarios()) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }
    
    public static void devolverLivro(String nomeUsuario, Livro livro) {
        // Encontrar o usuário pelo nome (ou ID)
        Usuario usuario = encontrarUsuario(nomeUsuario);

        // Verificar se o usuário foi encontrado
        if (usuario != null) {
            // Remover o livro da lista de livros emprestados pelo usuário
            usuario.removerLivroEmprestado(livro);
        } else {
            System.out.println("Usuário não encontrado");
        }
    }
    
    
    
}