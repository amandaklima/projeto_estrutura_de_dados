import leitura.LeituraArquivoArray;
import leitura.LeituraArquivoFila;
import leitura.LeituraArquivoPilha;
import java.util.Scanner;

//01618839 - Manuella Jatobá de Figueirêdo
//01618931 - Amanda Kawanne De Oliveira Lima

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoSelecionada;
        do {
            System.out.println("\nMENU DO SISTEMA ");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Fazer a leitura do arquivo utilizando array");
            System.out.println("2. Fazer a leitura do arquivo utilizando pilha");
            System.out.println("3. Fazer a leitura do arquivo utilizando fila");
            System.out.println("0. Sair do programa de leitura do arquivo");

            opcaoSelecionada = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcaoSelecionada) {
                case 1:
                    System.out.println("\nFazendo a leitura do arquivo utilizando array\n");
                    LeituraArquivoArray.leituraArquivoComArray();
                    break;
                case 2:
                    System.out.println("\nFazendo a leitura do arquivo utilizando pilha\n");
                    LeituraArquivoFila.leituraArquivoComFila();
                    break;
                case 3:
                    System.out.println("\nFazendo a leitura do arquivo utilizando fila\n");
                    LeituraArquivoPilha.leituraArquivoComPilha();
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa...\n");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcaoSelecionada != 0);

        scanner.close();
    }


}
