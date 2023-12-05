package services;

/*
 *
 * @author simon
*/

import entities.Emprestimo;
import entities.Livro;
import entities.Usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmprestimoService {
    private static List<Emprestimo> listaEmprestimos = new ArrayList<>();

    public static void realizarEmprestimo(Usuario usuario, Livro livro, String senha) {
        // Verifica a senha do usuário
        if (verificarSenha(usuario, senha)) {
            // Verifica se o livro está disponível
            if (livro.getQuantidadeDisponivel() > 0) {
                // Realiza o empréstimo
                usuario.adicionarLivroEmprestado(livro);
                livro.removerQuantidadeDisponivel();
                Emprestimo emprestimo = new Emprestimo(usuario, livro);
                listaEmprestimos.add(emprestimo);
            } else {
                JOptionPane.showMessageDialog(null, "Livro não disponível para empréstimo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta. Empréstimo não realizado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static boolean verificarSenha(Usuario usuario, String senha) {
        // Verifica se a senha informada é igual à senha do usuário
        return usuario.getSenha().equals(senha);
    }
    
    public static List<Emprestimo> obterEmprestimosPorUsuario(Usuario usuario) {
        List<Emprestimo> emprestimosUsuario = new ArrayList<>();

        for (Emprestimo emprestimo : listaEmprestimos) {
            if (emprestimo.getUsuario().equals(usuario)) {
                emprestimosUsuario.add(emprestimo);
            }
        }

        return emprestimosUsuario;
    }
    
    public static boolean devolverLivro(String nomeUsuario, Livro livro, String senha) {
        // Encontrar o empréstimo correspondente na lista de empréstimos
        Emprestimo emprestimo = encontrarEmprestimo(nomeUsuario, livro);

        // Verificar se o empréstimo foi encontrado
        if (emprestimo != null) {
            // Verificar a senha do usuário
            if (verificarSenha(emprestimo.getUsuario(), senha)) {
                // Realizar a devolução do livro
                emprestimo.getUsuario().removerLivroEmprestado(livro);
                livro.adicionarQuantidadeDisponivel();
                listaEmprestimos.remove(emprestimo); // Remover o empréstimo da lista

                return true; // Devolução bem-sucedida
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta. Devolução não realizada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo não encontrado. Devolução não realizada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return false; // Devolução sem sucesso
    }


    private static Emprestimo encontrarEmprestimo(String nomeUsuario, Livro livro) {
        // Encontrar o empréstimo correspondente na lista de empréstimos
        for (Emprestimo emprestimo : listaEmprestimos) {
            if (emprestimo.getUsuario().getNome().equals(nomeUsuario) && emprestimo.getLivro().equals(livro)) {
                return emprestimo;
            }
        }
        return null; // Empréstimo não encontrado
    }
}
