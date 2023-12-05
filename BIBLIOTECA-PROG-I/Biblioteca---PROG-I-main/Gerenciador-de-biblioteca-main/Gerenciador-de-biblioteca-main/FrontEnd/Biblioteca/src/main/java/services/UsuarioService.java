package services;

/**
 *
 * @author simon
 */
import entities.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    
    public static void cadastrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static List<Usuario> obterListaUsuarios() {
        return listaUsuarios;
    }
    
    // Método para encontrar um usuario pelo nome
    public static Usuario encontrarUsuario(String nome) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
    
    // Verificar se senha do usuário está correta
    public static boolean verificarSenha(Usuario usuario, String senha) {
        // Verifica se a senha informada é igual à senha do usuário
        return usuario.getSenha().equals(senha);
    }
    
}