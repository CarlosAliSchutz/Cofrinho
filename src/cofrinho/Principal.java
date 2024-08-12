package cofrinho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // Instancia o Scanner para leitura de entradas do usuário
    Cofrinho cofrinho = new Cofrinho(); // Cria uma nova instância do Cofrinho

    System.out.println("Cofrinho de moedas\n"); // Exibe o título do programa

    // Loop principal para interagir com o usuário
    while (true) {
      try {
        int acao = solicitarAcao(scanner); // Solicita ao usuário a ação que deseja realizar

        switch (acao) {
          case 1: // Adicionar moedas
            manipularMoedas(scanner, cofrinho, true);
            break;
          case 2: // Remover moedas
            manipularMoedas(scanner, cofrinho, false);
            break;
          case 3: // Listar moedas
            System.out.println();
            cofrinho.listagemMoedas(); // Exibe a lista de moedas no cofrinho
            break;
          case 4: // Converter todas as moedas para reais
            System.out.println();
            cofrinho.totalConvertido(); // Exibe o valor total das moedas convertido para reais
            break;
          case 5: // Sair do programa
            scanner.close(); // Fecha o Scanner
            System.out.println("\nPrograma encerrado"); // Mensagem de encerramento
            return; // Sai do loop e encerra o programa
          default: // Opção inválida
            System.out.println("Opção inválida"); // Exibe mensagem de erro para opções inválidas
        }
        System.out.println(); // Quebra de linha para separar as operações

      } catch (InputMismatchException e) { // Captura erros de entrada do usuário
        System.out.println("\nEntrada inválida. Por favor, utilize vírgula para separar casas decimais.");
        scanner.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
      }
    }
  }

  /**
   * Solicita ao usuário a operação que deseja realizar.
   *
   * @param scanner Scanner para leitura da entrada do usuário.
   * @return Ação escolhida pelo usuário.
   */
  private static int solicitarAcao(Scanner scanner) {
    System.out.print("Qual operação você deseja realizar? \n"
        + "1 - Adicionar moeda(s) \n"
        + "2 - Remover moeda(s) \n"
        + "3 - Listar moedas \n"
        + "4 - Converter todo o dinheiro para reais \n"
        + "5 - Sair \n");
    return scanner.nextInt(); // Retorna a escolha do usuário
  }

  /**
   * Manipula a adição ou remoção de moedas no cofrinho.
   *
   * @param scanner     Scanner para leitura da entrada do usuário.
   * @param cofrinho    Instância do Cofrinho onde as moedas serão manipuladas.
   * @param adicionar   Define se a operação é de adicionar (true) ou remover (false) moedas.
   */
  private static void manipularMoedas(Scanner scanner, Cofrinho cofrinho, boolean adicionar) {
    int tipoMoeda = solicitarTipoMoeda(scanner); // Solicita o tipo de moeda que o usuário deseja manipular

    System.out.print("\nQuantas moedas você deseja " + (adicionar ? "adicionar" : "remover") + "?\n"
        + "Separar casas decimais com vírgula!\n");
    double quantidadeMoeda = scanner.nextDouble(); // Recebe a quantidade de moedas

    // Adiciona ou remove as moedas no cofrinho
    if (adicionar) {
      cofrinho.adicionarMoedas(tipoMoeda, quantidadeMoeda);
    } else {
      cofrinho.removerMoedas(tipoMoeda, quantidadeMoeda);
    }
  }

  /**
   * Solicita ao usuário o tipo de moeda que deseja manipular.
   *
   * @param scanner Scanner para leitura da entrada do usuário.
   * @return Tipo de moeda escolhido pelo usuário.
   */
  private static int solicitarTipoMoeda(Scanner scanner) {
    System.out.print("\nCom qual moeda você deseja trabalhar? \n"
        + "1 - Dólar \n"
        + "2 - Euro \n"
        + "3 - Real \n");
    return scanner.nextInt(); // Retorna o tipo de moeda escolhido pelo usuário
  }
}
