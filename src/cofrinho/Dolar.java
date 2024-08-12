package cofrinho;

public class Dolar extends Moeda {

  private double valor;

  public Dolar() {
    this.valor = 0;
  }

  public Dolar(double valorInicial) {
    if (valorInicial >= 0) {
      this.valor = valorInicial;
    } else {
      throw new IllegalArgumentException("O valor inicial não pode ser negativo.");
    }
  }

  public double valor() {
    return this.valor;
  }

  public void adicionarDolar(double quantidade) {
    if (quantidade > 0) {
      this.valor += quantidade;
    } else {
      System.out.println("Quantidade inválida para adicionar.");
    }
  }

  public void removerDolar(double quantidade) {
    if (quantidade > 0 && quantidade <= this.valor) {
      this.valor -= quantidade;
    } else {
      System.out.println("Quantidade inválida para remover.");
    }
  }

  // Exibe informações sobre o valor atual em dólares.
  public void info() {
    System.out.printf("Dólares = $%.2f%n", this.valor);
  }

  /**
   * Converte o valor atual de dólares para reais usando a taxa de conversão
   * atual.
   *
   * @return o valor convertido em reais.
   */
  @Override
  public double converter() {
    // Taxa de conversão atual: 1 Dólar = 5,50 Reais
    double taxaConversao = 5.5;
    return this.valor * taxaConversao;
  }
}
