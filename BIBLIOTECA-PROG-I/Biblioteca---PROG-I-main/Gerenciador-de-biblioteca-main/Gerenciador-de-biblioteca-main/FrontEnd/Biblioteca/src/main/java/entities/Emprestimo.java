package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simon
 */

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private List<Livro> emprestimosUsuario = new ArrayList<>();

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }
    
    public Emprestimo() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    
}
