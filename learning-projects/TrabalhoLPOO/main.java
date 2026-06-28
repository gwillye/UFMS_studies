package TrabalhoLPOO;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========= BIBLIOTECA =========");
            System.out.println("1. Cadastrar novo item");
            System.out.println("2. Buscar item");
            System.out.println("3. Sair");
            System.out.println("==============================");

            System.out.println("Digite sua opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    biblioteca.cadastrar();
                    break;

                case 2:
                    System.out.println("Digite o nome do item a ser buscado:");
                    String nome = scanner.nextLine();
                    biblioteca.buscar(nome);
                    while (true) {
                        System.out.println("========= MENU DE BUSCA =========");
                        System.out.println("1. Atualizar item");
                        System.out.println("2. Deletar item");
                        System.out.println("3. Sair do menu de busca");
                        System.out.println("==============================");

                        System.out.println("Digite sua opção:");
                        int opcaob = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaob) {
                            case 1:
                                System.out.println("Digite o índice do item que deseja atualizar:");
                                int codigoAtualizar = scanner.nextInt();
                                scanner.nextLine();
                                biblioteca.atualizar(codigoAtualizar);
                                System.out.println("Item atualizado com sucesso.");
                                break;
                            case 2:
                                System.out.println("Digite o índice do item que deseja deletar:");
                                int indiceDeletar = scanner.nextInt();
                                scanner.nextLine();

                                biblioteca.deletar(indiceDeletar);
                                break;
                            case 3:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }

                        if (opcaob == 3) {
                            break; // Sai do loop interno e volta ao menu principal
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}