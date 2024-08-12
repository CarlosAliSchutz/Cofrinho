package cofrinho;

public class Real extends Moeda {

  private double valor;

   //Construtor padrão que inicializa o valor em 0.
  public Real() {
    this.valor = 0;
  }

  public Real(double valorInicial) {
    if (valorInicial >= 0) {
      this.valor = valorInicial;
    } else {
      throw new IllegalArgumentException("O valor inicial não pode ser negativo.");
    }
  }


  /**
   * Retorna o valor atual em reais.
   * @return o valor em reais.
   */
  @Override
  public double valor() {
    return this.valor;
  }

  /**
   * Adiciona uma quantidade ao valor atual de reais.
   * @param quantidade A quantidade a ser adicionada.
   */
  public void adicionarReal(double quantidade) {
    if (quantidade > 0) {
      this.valor += quantidade;
    } else {
      System.out.println("Quantidade inválida para adicionar.");
    }
  }


  /**
   * Remove uma quantidade do valor atual de reais.
   * @param quantidade A quantidade a ser removida.
   */
  public void removerReal(double quantidade) {
    if (quantidade > 0 && quantidade <= this.valor) {
      this.valor -= quantidade;
    } else {
      System.out.println("Quantidade inválida para remover.");
    }
  }


  //Exibe informações sobre o valor atual em reais.
  @Override
  public void info() {
    System.out.printf("Reais = R$%.2f%n", this.valor);
  }

  /**
   * Como a moeda já está em reais, retorna o valor atual sem conversão.
   * @return o valor em reais.
   */
  @Override
  public double converter() {
    return this.valor;
  }
}
