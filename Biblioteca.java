package criação;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }
  
    public void consultarLivroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro);
                encontrado = true;
                break;
                }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }
  
    public void apagarLivro(String titulo) {
        boolean encontrado = false;
        
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                System.out.println("Livro apagado com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado para apagar.");
        }
    }

    
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
        } else {
            System.out.println("Lista de livros cadastrados:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
