package criação;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Biblioteca biblioteca = new Biblioteca();
	        
	        while (true) {
	            System.out.println("\nEscolha uma opção:");
	            System.out.println("1. Cadastrar livro");
	            System.out.println("2. Consultar livro");
	            System.out.println("3. Apagar livro");
	            System.out.println("4. Sair");
	            int opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite o título do livro:");
	                    String titulo = scanner.nextLine();
	                    System.out.println("Digite o autor do livro:");
	                    String autor = scanner.nextLine();
	                    System.out.println("Digite o ano de publicação do livro:");
	                    int ano = scanner.nextInt();
	                    scanner.nextLine(); 
	                    Livro livro = new Livro(titulo, autor, ano);
	                    biblioteca.cadastrarLivro(livro);
	                    break;

	                case 2:
	                    System.out.println("Digite o título do livro a ser consultado:");
	                    String tituloConsulta = scanner.nextLine();
	                    biblioteca.consultarLivroPorTitulo(tituloConsulta);
	                    break;

	                case 3:
	                    System.out.println("Digite o título do livro a ser apagado:");
	                    String tituloApagar = scanner.nextLine();
	                    biblioteca.apagarLivro(tituloApagar);
	                    break;

	                case 4:
	                    System.out.println("Saindo...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }
	    }
	}