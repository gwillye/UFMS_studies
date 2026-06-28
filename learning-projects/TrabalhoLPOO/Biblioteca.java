//Update

package TrabalhoLPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    //Attributes
    private final List<Livro> livros;
    private final List<Filme> filmes;
    private final List<Peca> pecas;
    private final List<Serie> series;
    private final List<Anime> animes;
    private final List<Midia> resultados;
    private final List<Integer> indices;


    //Constructor
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.filmes = new ArrayList<>();
        this.pecas = new ArrayList<>();
        this.series = new ArrayList<>();
        this.animes = new ArrayList<>();
        this.resultados = new ArrayList<>();
        this.indices = new ArrayList<>();
    }

    //Methods
    
    /*Cadastrar*/
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de objeto que deseja cadastrar:");
        System.out.println("1. Livro");
        System.out.println("2. Filme");
        System.out.println("3. Peça");
        System.out.println("4. Serie");
        System.out.println("5. Anime");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:
                Livro.Builder livroBuilder = new Livro.Builder();
                System.out.println("Digite o nome do livro:");
                String nomeLivro = scanner.nextLine();
                System.out.println("Digite o autor do livro:");
                String autorLivro = scanner.nextLine();
                livroBuilder.nome(nomeLivro).autor(autorLivro);

                System.out.println("Deseja adicionar o ano em que foi publicado? (S/N)");
                String opcaoAno = scanner.nextLine();
                if (opcaoAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o ano de publicação:");
                    int anoLivro = scanner.nextInt();
                    livroBuilder.ano(anoLivro);
                }
                
                System.out.println("Deseja adicionar o número de páginas? (S/N)");
                String opcaoPaginas = scanner.nextLine();
                if (opcaoPaginas.equalsIgnoreCase("S")) {
                    System.out.println("Digite o número de páginas:");
                    int paginasLivro = scanner.nextInt();
                    livroBuilder.paginas(paginasLivro);
                }

                System.out.println("Deseja adicionar a editora? (S/N)");
                String opcaoEditora = scanner.nextLine();
                if (opcaoEditora.equalsIgnoreCase("S")) {
                    System.out.println("Digite a editora:");
                    String editoraLivro = scanner.nextLine();
                    livroBuilder.editora(editoraLivro);
                }

                System.out.println("Deseja adicionar a edição? (S/N)");
                String opcaoEdicao = scanner.nextLine();
                if (opcaoEdicao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a edição:");
                    int edicaoLivro = scanner.nextInt();
                    livroBuilder.edicao(edicaoLivro);
                }

                System.out.println("Deseja adicionar o ISBN? (S/N)");
                String opcaoISBN = scanner.nextLine();
                if (opcaoISBN.equalsIgnoreCase("S")) {
                    System.out.println("Digite o ISBN:");
                    String ISBNNLivro = scanner.nextLine();
                    livroBuilder.isbn(ISBNNLivro);
                }

                Livro livro = livroBuilder.build();
                
                //Comparacao para averiguar se ja existe um livro igual cadastrado 
                boolean livroJaExistente = false;
                for (Livro l : livros) {
                    if (l.equals(livro)) {
                        livroJaExistente = true;
                        break;
                    }
                }
                
                if (livroJaExistente) {
                    System.out.println("O livro já existe na lista. Cadastro não realizado.");
                } else {
                    livros.add(livro);
                    resultados.add(livro);
                }
                
                break;
            case 2:
                Filme.Builder filmeBuilder = new Filme.Builder();
                System.out.println("Digite o nome do filme:");
                String nomeFilme = scanner.nextLine();
                filmeBuilder.nome(nomeFilme);
                
                System.out.println("Deseja adicionar o ano do filme? (S/N)");
                String filmeAno = scanner.nextLine();
                if (filmeAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o ano do filme:");
                    int anoFilme = scanner.nextInt();
                    filmeBuilder.ano(anoFilme);
                }
                
                System.out.println("Deseja adicionar a duração em segundos? (S/N)");
                String opcaoDuracao = scanner.nextLine();
                if (opcaoDuracao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a duração em segundos:");
                    int duracaoFilme = scanner.nextInt();
                    filmeBuilder.segundos(duracaoFilme);
                }

                System.out.println("Deseja adicionar o estúdio? (S/N)");
                String estudioFilme = scanner.nextLine();
                if (estudioFilme.equalsIgnoreCase("S")) {
                    System.out.println("Digite o estúdio do filme:");
                    String filmeEstudio = scanner.nextLine();
                    filmeBuilder.estudio(filmeEstudio);
                }

                Filme filme = filmeBuilder.build();
                
                //Comparação para averiguar se já existe um filme igual cadastrado
                boolean filmeJaExistente = false;
                for (Filme f : filmes) {
                    if (f.equals(filme)) {
                        filmeJaExistente = true;
                        break;
                    }
                }

                if (filmeJaExistente) {
                    System.out.println("O filme já existe na lista. Cadastro não realizado.");
                } else {
                    filmes.add(filme);
                    resultados.add(filme);
                }
                break;
            case 3:
                Peca.Builder pecaBuilder = new Peca.Builder();
                System.out.println("Digite o nome da peça:");
                String nomePeca = scanner.nextLine();
                pecaBuilder.nome(nomePeca);

                System.out.println("Deseja adicionar o ano da peça? (S/N)");
                String pecaAno = scanner.nextLine();
                if (pecaAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o ano da peça:");
                    int anoPeca = scanner.nextInt();
                    pecaBuilder.ano(anoPeca);
                }
                
                System.out.println("Deseja adicionar a duração em segundos? (S/N)");
                String opcaoDuracaoPeca = scanner.nextLine();
                if (opcaoDuracaoPeca.equalsIgnoreCase("S")) {
                    System.out.println("Digite a duração em segundos:");
                    int duracaoPeca = scanner.nextInt();
                    pecaBuilder.segundos(duracaoPeca);
                }

                System.out.println("Deseja adicionar o local? (S/N)");
                String localPeca = scanner.nextLine();
                if (localPeca.equalsIgnoreCase("S")) {
                    System.out.println("Digite o local da peça:");
                    String pecaLocal = scanner.nextLine();
                    pecaBuilder.local(pecaLocal);
                }
                System.out.println("Deseja adicionar a data de exibição? (S/N)");
                String dataPeca = scanner.nextLine();
                if (dataPeca.equalsIgnoreCase("S")) {
                    System.out.println("Digite a data de exibição da peça:");
                    String pecaData = scanner.nextLine();
                    pecaBuilder.local(pecaData);
                }
                
                Peca peca = pecaBuilder.build();
                
              //Comparação para averiguar se já existe uma peça igual cadastrada
                boolean pecaJaExistente = false;
                for (Peca p : pecas) {
                    if (p.equals(peca)) {
                        pecaJaExistente = true;
                        break;
                    }
                }

                if (pecaJaExistente) {
                    System.out.println("A peça já existe na lista. Cadastro não realizado.");
                } else {
                    pecas.add(peca);
                    resultados.add(peca);
                }
                break;
            case 4:
                Serie.Builder serieBuilder = new Serie.Builder();
                System.out.println("Digite o nome da série:");
                String nomeSerie = scanner.nextLine();
                serieBuilder.nome(nomeSerie);
                
                System.out.println("Deseja adicionar o ano da série? (S/N)");
                String serieAno = scanner.nextLine();
                if (serieAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o ano da série:");
                    int anoSerie = scanner.nextInt();
                    serieBuilder.ano(anoSerie);
                }

                System.out.println("Deseja adicionar o estúdio da série? (S/N)");
                String estudioSerie = scanner.nextLine();
                if (estudioSerie.equalsIgnoreCase("S")) {
                    System.out.println("Digite o estúdio da série:");
                    String serieEstudio = scanner.nextLine();
                    serieBuilder.estudio(serieEstudio);
                }
                    
                System.out.println("Deseja adicionar a quantidade de temporadas? (S/N)");
                String temporadasSerie = scanner.nextLine();
                    if (temporadasSerie.equalsIgnoreCase("S")) {
                        System.out.println("Digite a quantidade de temporadas:");
                        int serieTemporadas = scanner.nextInt();
                        serieBuilder.temporadas(serieTemporadas);
                    }

                Serie serie = serieBuilder.build();
                
                //Comparação para averiguar se já existe uma série igual cadastrada
                boolean serieJaExistente = false;
                for (Serie s : series) {
                    if (s.equals(serie)) {
                        serieJaExistente = true;
                        break;
                    }
                }

                if (serieJaExistente) {
                    System.out.println("A série já existe na lista. Cadastro não realizado.");
                } else {
                    series.add(serie);
                    resultados.add(serie);
                }
                break;
            case 5:
                Anime.Builder animeBuilder = new Anime.Builder();
                System.out.println("Digite o nome do anime:");
                String nomeAnime = scanner.nextLine();
                animeBuilder.nome(nomeAnime);
                
                System.out.println("Deseja adicionar o ano do anime? (S/N)");
                String animeAno = scanner.nextLine();
                if (animeAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o ano do anime:");
                    int anoAnime = scanner.nextInt();
                    animeBuilder.ano(anoAnime);
                }

                System.out.println("Deseja adicionar o estúdio do anime? (S/N)");
                String estudioAnime = scanner.nextLine();
                if (estudioAnime.equalsIgnoreCase("S")) {
                    System.out.println("Digite o estúdio do anime:");
                    String animeEstudio = scanner.nextLine();
                    animeBuilder.estudio(animeEstudio);
                }
                    
                System.out.println("Deseja adicionar a quantidade de temporadas? (S/N)");
                String temporadasAnime = scanner.nextLine();
                    if (temporadasAnime.equalsIgnoreCase("S")) {
                        System.out.println("Digite a quantidade de temporadas:");
                        int animeTemporadas = scanner.nextInt();
                        animeBuilder.temporadas(animeTemporadas);
                    }
                Anime anime = animeBuilder.build();
                
              //Comparação para averiguar se já existe um anime igual cadastrado
                boolean animeJaExistente = false;
                for (Anime a : animes) {
                    if (a.equals(anime)) {
                        animeJaExistente = true;
                        break;
                    }
                }

                if (animeJaExistente) {
                    System.out.println("O anime já existe na lista. Cadastro não realizado.");
                } else {
                    animes.add(anime);
                    resultados.add(anime);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
                
        }
    }
    
    /*Adicionar um novo objeto na lista*/
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        resultados.add(livro);
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        resultados.add(filme);
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
        resultados.add(peca);
    }

    public void adicionarSerie(Serie serie) {
        series.add(serie);
        resultados.add(serie);
    }

    public void adicionarAnime(Anime anime) {
        animes.add(anime);
        resultados.add(anime);
    }

    
    /*Buscar() */
    public void buscar(String nome) {
        int index = 1;
        for (Midia midia : resultados) {
            if (midia.getNome().equalsIgnoreCase(nome)) {
                System.out.println(index + ". " + midia.toString());
                indices.add(index);
                index++;
            }
        }
    }

    
    /*Deletar()*/
    public void deletar(int indice) {
        if (indice >= 1 && indice <= indices.size()) {
            int indexToRemove = indices.get(indice - 1) - 1;
            Midia midia = resultados.get(indexToRemove);

            if (midia instanceof Livro) {
                livros.remove(midia);
            } else if (midia instanceof Filme) {
                filmes.remove(midia);
            } else if (midia instanceof Peca) {
                pecas.remove(midia);
            } else if (midia instanceof Serie) {
                series.remove(midia);
            } else if (midia instanceof Anime) {
                animes.remove(midia);
            }

            resultados.remove(indexToRemove);
            indices.remove(indice - 1);
            System.out.println("Objeto removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    /*Atualizar*/
 // Métodos - Atualizar
    public void atualizar(int indice) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
        if (indice >= 1 && indice <= indices.size()) {
            int indexToUpdate = indices.get(indice - 1) - 1;
            Midia midia = resultados.get(indexToUpdate);

            if (midia instanceof Livro) {
                Livro livro = (Livro) midia;
                System.out.println("Deseja atualizar o nome do livro? Nome atual: \"" + livro.getNome() + "\" (S/N)");
                String opcaoNome = scanner.nextLine();
                if (opcaoNome.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo nome do livro:");
                    String novoNome = scanner.nextLine();
                    livro.setNome(novoNome);
                }

                System.out.println("Deseja atualizar o autor do livro? Autor atual: \"" + livro.getAutor() + "\" (S/N)");
                String opcaoAutor = scanner.nextLine();
                if (opcaoAutor.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo autor do livro:");
                    String novoAutor = scanner.nextLine();
                    livro.setAutor(novoAutor);
                }
                
                System.out.println("Deseja atualizar o ano do livro? (S/N)");
                String opcaoAno = scanner.nextLine();
                if (opcaoAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo ano do livro:");
                    int novoAno = Integer.parseInt(scanner.nextLine()); // Ler o ano como inteiro
                    livro.setAno(novoAno);
                }

                System.out.println("Deseja atualizar a editora do livro? (S/N)");
                String opcaoEditora = scanner.nextLine();
                if (opcaoEditora.equalsIgnoreCase("S")) {
                    System.out.println("Digite a nova editora do livro:");
                    String novaEditora = scanner.nextLine();
                    livro.setEditora(novaEditora);
                }

                System.out.println("Deseja atualizar o ISBN do livro?(S/N)");
                String opcaoISBN = scanner.nextLine();
                if (opcaoISBN.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo ISBN do livro:");
                    String novoISBN = scanner.nextLine();
                    livro.setIsbn(novoISBN);
                }

                System.out.println("Deseja atualizar a edição do livro? (S/N)");
                String opcaoEdicao = scanner.nextLine();
                if (opcaoEdicao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a nova edição do livro:");
                    int novaEdicao = scanner.nextInt();
                    livro.setEdicao(novaEdicao);
                }

                System.out.println("Deseja atualizar as páginas do livro? (S/N)");
                String opcaoPaginas = scanner.nextLine();
                if (opcaoPaginas.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo número de páginas do livro:");
                    int novasPaginas = scanner.nextInt();
                    livro.setPaginas(novasPaginas);
                }
            } else if (midia instanceof Filme) {
                Filme filme = (Filme) midia;
                System.out.println("Deseja atualizar o nome do filme? Nome atual: \"" + filme.getNome() + "\" (S/N)");
                String opcaoNome = scanner.nextLine();
                if (opcaoNome.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo nome do filme:");
                    String novoNome = scanner.nextLine();
                    filme.setNome(novoNome);
                }
                
                System.out.println("Deseja atualizar o ano do filme? (S/N)");
                String opcaoAno = scanner.nextLine();
                if (opcaoAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo ano do filme:");
                    int novoAno = Integer.parseInt(scanner.nextLine()); // Ler o ano como inteiro
                    filme.setAno(novoAno);
                }
                
                System.out.println("Deseja atualizar a duração do filme? (S/N)");
                String opcaoDuracao = scanner.nextLine();
                if (opcaoDuracao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a nova duração do filme:");
                    int novaDuracao = Integer.parseInt(scanner.nextLine());
                    filme.setSegundos(novaDuracao);
                }
                
                System.out.println("Deseja atualizar o estudio do filme?(S/N)");
                String opcaoEstudio = scanner.nextLine();
                if (opcaoEstudio.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo estudio do filme:");
                    String novoEstudio = scanner.nextLine();
                    filme.setEstudio(novoEstudio);
                }
                
            } else if (midia instanceof Peca) {
                Peca peca = (Peca) midia;
                System.out.println("Deseja atualizar o nome da peça? Nome atual: \"" + peca.getNome() + "\" (S/N)");
                String opcaoNome = scanner.nextLine();
                if (opcaoNome.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo nome da peça:");
                    String novoNome = scanner.nextLine();
                    peca.setNome(novoNome);
                }
                
                System.out.println("Deseja atualizar o ano da peça? (S/N)");
                String opcaoAno = scanner.nextLine();
                if (opcaoAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo ano da peca:");
                    int novoAno = Integer.parseInt(scanner.nextLine()); // Ler o ano como inteiro
                    peca.setAno(novoAno);
                }
                
                System.out.println("Deseja atualizar a duração da peça? (S/N)");
                String opcaoDuracao = scanner.nextLine();
                if (opcaoDuracao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a nova duração da peça:");
                    int novaDuracao = Integer.parseInt(scanner.nextLine());
                    peca.setSegundos(novaDuracao);
                }
                
                System.out.println("Deseja atualizar o local da peça?(S/N)");
                String opcaoLocal = scanner.nextLine();
                if (opcaoLocal.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo local da peça:");
                    String novoLocal = scanner.nextLine();
                    peca.setLocal(novoLocal);
                }
                
                System.out.println("Deseja atualizar a data da peça?(S/N)");
                String opcaoData = scanner.nextLine();
                if (opcaoData.equalsIgnoreCase("S")) {
                    System.out.println("Digite a data local da peça:");
                    String novaData = scanner.nextLine();
                    peca.setData(novaData);
                }
                
            } else if (midia instanceof Serie) {
                Serie serie = (Serie) midia;
                System.out.println("Deseja atualizar o nome da serie? Nome atual: \"" + serie.getNome() + "\" (S/N)");
                String opcaoNome = scanner.nextLine();
                if (opcaoNome.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo nome da serie:");
                    String novoNome = scanner.nextLine();
                    serie.setNome(novoNome);
                }
                
                System.out.println("Deseja atualizar o ano da série? (S/N)");
                String opcaoAno = scanner.nextLine();
                if (opcaoAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo ano da série:");
                    int novoAno = Integer.parseInt(scanner.nextLine()); // Ler o ano como inteiro
                    serie.setAno(novoAno);
                }
                
                System.out.println("Deseja atualizar o estudio da série?(S/N)");
                String opcaoEstudio = scanner.nextLine();
                if (opcaoEstudio.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo estúdio da série:");
                    String novoEstudio = scanner.nextLine();
                    serie.setEstudio(novoEstudio);
                }
                
                System.out.println("Deseja atualizar a quantidade de temporadas da série? (S/N)");
                String opcaoDuracao = scanner.nextLine();
                if (opcaoDuracao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a nova nova quantidade de temporadas da série:");
                    int novaDuracao = Integer.parseInt(scanner.nextLine());
                    serie.setTemporadas(novaDuracao);
                }
            } else if (midia instanceof Anime) {
                Anime anime = (Anime) midia;
                System.out.println("Deseja atualizar o nome do anime? Nome atual: \"" + anime.getNome() + "\" (S/N)");
                String opcaoNome = scanner.nextLine();
                if (opcaoNome.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo nome do anime:");
                    String novoNome = scanner.nextLine();
                    anime.setNome(novoNome);
                }
                
                System.out.println("Deseja atualizar o ano do anime? (S/N)");
                String opcaoAno = scanner.nextLine();
                if (opcaoAno.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo ano do anime:");
                    int novoAno = Integer.parseInt(scanner.nextLine()); // Ler o ano como inteiro
                    anime.setAno(novoAno);
                }
                
                System.out.println("Deseja atualizar o estudio do anime?(S/N)");
                String opcaoEstudio = scanner.nextLine();
                if (opcaoEstudio.equalsIgnoreCase("S")) {
                    System.out.println("Digite o novo estúdio do anime:");
                    String novoEstudio = scanner.nextLine();
                    anime.setEstudio(novoEstudio);
                }
                
                System.out.println("Deseja atualizar a quantidade de temporadas do anime? (S/N)");
                String opcaoDuracao = scanner.nextLine();
                if (opcaoDuracao.equalsIgnoreCase("S")) {
                    System.out.println("Digite a nova nova quantidade de temporadas do anime:");
                    int novaDuracao = Integer.parseInt(scanner.nextLine());
                    anime.setTemporadas(novaDuracao);
                }
            }

            System.out.println("Objeto atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    
    //Methods - Getters
    public List<Livro> getLivros() {
        return livros;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public List<Anime> getAnimes() {
        return animes;
    }

    public List<Midia> getResultados() {
        return resultados;
    }
    
}
