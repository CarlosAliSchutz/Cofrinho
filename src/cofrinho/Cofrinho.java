package cofrinho;

public class Cofrinho {

  Dolar dolar = new Dolar(); // instancia de dolar
  Euro euro = new Euro(); // instancia de euro
  Real real = new Real(); // instancia de real

  // lista contendo todos os dolares, euros e reais convertidos para reais
  // private ArrayList<List> listaMoedas = new ArrayList<List>();

  // metodo para adicionar moedas no cofrinho
  public void adicionarMoedas(int tipoMoeda, double moeda) {
    if (tipoMoeda == 1) { // 1 = codigo para adicionar Dolar

      dolar.adicionarDolar(moeda);
    } else if (tipoMoeda == 2) { // 2 = codigo para adicionar Euro

      euro.adicionarEuro(moeda);
    } else if (tipoMoeda == 3) { // 3 = codigo para adicionar Real

      real.adicionarReal(moeda);
    } else { // qualquer outro valor que não esteja entre 1 e 3
      System.out.println("Valor inválido. Tente novamente");
    }
  }

  // metodo para remover moedas do cofrinho
  public void removerMoedas(int tipoMoeda, double moeda) {
    if (tipoMoeda == 1) { // 1 = codigo para remover Dolar

      dolar.removerDolar(moeda);
    } else if (tipoMoeda == 2) { // 2 = codigo para remover Euro

      euro.removerEuro(moeda);
    } else if (tipoMoeda == 3) { // 3 = codigo para remover Real

      real.removerReal(moeda);
    } else { // qualquer outro valor que não esteja entre 1 e 3
      System.out.println("Valor inválido. Tente novamente");
    }
  }

  // metodo para listar todas as moedas no cofrinho
  public void listagemMoedas() {
    dolar.info();
    euro.info();
    real.info();
  }

  // metodo para calcular a soma de todas as moedas, convertidas para real
  public void totalConvertido() {
    double totalConvertido = dolar.converter() + euro.converter()
        + real.converter();

    System.out.printf("Total convertido em reais: "
        + "R$%.2f%n", totalConvertido);
  }
}
