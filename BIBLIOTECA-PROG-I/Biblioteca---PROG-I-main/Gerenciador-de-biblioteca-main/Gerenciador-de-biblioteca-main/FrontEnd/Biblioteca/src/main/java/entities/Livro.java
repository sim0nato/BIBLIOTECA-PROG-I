package entities;

/**
 *
 * @author simon
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private String genero;
    private String idioma;
    private int quantidadeDisponivel;
    
    public Livro() {
    }
    
    public Livro(String titulo, String autor, String genero, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.quantidadeDisponivel = 0;
    }

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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void adicionarQuantidadeDisponivel() {
        quantidadeDisponivel++;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = 1;
    }
    
    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    } 
    
    public void removerQuantidadeDisponivel() {
        // Verifica se a quantidade disponível é maior que zero antes de decrementar
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
        } else {
            // Você pode lidar com uma quantidade negativa ou emitir uma mensagem de erro se desejar
            System.out.println("Erro: Tentativa de empréstimo de livro sem estoque disponível.");
        }
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Idioma: " + idioma;
    }
        
}
