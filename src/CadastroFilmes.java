import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Filme {
    private String titulo;
    private List<String> atores;
    private String diretor;
    private String enderecoGravacao;
    private int tempoFilmagem;
    private String dataInicio;
    private String dataFim;

    public Filme(String titulo, List<String> atores, String diretor, String enderecoGravacao, int tempoFilmagem, String dataInicio, String dataFim) {
        this.titulo = titulo;
        this.atores = atores;
        this.diretor = diretor;
        this.enderecoGravacao = enderecoGravacao;
        this.tempoFilmagem = tempoFilmagem;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Atores: " + atores);
        System.out.println("Diretor: " + diretor);
        System.out.println("Endereço de Gravação: " + enderecoGravacao);
        System.out.println("Tempo de Filmagem: " + tempoFilmagem + " minutos");
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
    }
}

public class CadastroFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();

        while (true) {
            System.out.println("\nCadastro de Filme");

            System.out.print("Título do Filme: ");
            String titulo = scanner.nextLine();

            System.out.print("Número de Atores: ");
            int numAtores = Integer.parseInt(scanner.nextLine());
            List<String> atores = new ArrayList<>();
            for (int i = 0; i < numAtores; i++) {
                System.out.print("Nome do Ator " + (i + 1) + ": ");
                atores.add(scanner.nextLine());
            }

            System.out.print("Diretor: ");
            String diretor = scanner.nextLine();

            System.out.print("Endereço de Gravação: ");
            String enderecoGravacao = scanner.nextLine();

            System.out.print("Tempo de Filmagem (minutos): ");
            int tempoFilmagem = Integer.parseInt(scanner.nextLine());

            System.out.print("Data de Início: ");
            String dataInicio = scanner.nextLine();

            System.out.print("Data de Fim: ");
            String dataFim = scanner.nextLine();

            Filme filme = new Filme(titulo, atores, diretor, enderecoGravacao, tempoFilmagem, dataInicio, dataFim);
            filmes.add(filme);

            System.out.println("\nDetalhes do Filme:");
            filme.mostrarDetalhes();

            System.out.print("\nDeseja cadastrar outro filme? (S/N): ");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.println("\nFilmes Cadastrados:");
        for (Filme filme : filmes) {
            filme.mostrarDetalhes();
            System.out.println("--------------------");
        }

        scanner.close();
    }
}