package cofrinho;

public class Euro extends Moeda {

  private double valor;

  // Construtor padrão para inicializar o valor em 0
  public Euro() {
    this.valor = 0;
  }

  // Construtor para inicializar o valor com um valor específico
  public Euro(double valorInicial) {
    this.valor = valorInicial;
  }

  @Override
  double valor() {
    return this.valor;
  }

  // Adiciona uma quantidade de Euros ao valor atual
  public void adicionarEuro(double quantidade) {
    if (quantidade > 0) {
      this.valor += quantidade;
    } else {
      System.out.println("Quantidade inválida para adicionar.");
    }
  }

  // Remove uma quantidade de Euros do valor atual
  public void removerEuro(double quantidade) {
    if (quantidade > 0 && quantidade <= this.valor) {
      this.valor -= quantidade;
    } else {
      System.out.println("Quantidade inválida para remover.");
    }
  }

  @Override
  void info() {
    System.out.printf("Euros = €%.2f%n", this.valor);
  }

  @Override
  double converter() {
    // Taxa de conversão atual: 1 Euro = 5,51 Reais
    double taxaConversao = 5.51;
    return this.valor * taxaConversao;
  }
}
