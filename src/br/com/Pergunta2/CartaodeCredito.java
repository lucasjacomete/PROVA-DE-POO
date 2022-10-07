package br.com.Pergunta2;

public class CartaodeCredito extends Pagamento {
  private String numCartao;
  private String bandeiraCartao;
  private String titularCartao;

  public CartaodeCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
    super(dataHoraPagamento, numeroPagamento, valorPago);
    this.numCartao = numCartao;
    this.bandeiraCartao = bandeiraCartao;
    this.titularCartao = titularCartao;
  }

  public String getNumCartao() {
    return numCartao;
  }

  public void setNumCartao(String numCartao) {
    this.numCartao = numCartao;
  }

  public String getBandeiraCartao() {
    return bandeiraCartao;
  }

  public void setBandeiraCartao(String bandeiraCartao) {
    this.bandeiraCartao = bandeiraCartao;
  }

  public String getTitularCartao() {
    return titularCartao;
  }

  public void setTitularCartao(String titularCartao) {
    this.titularCartao = titularCartao;
  }
  public String imprimirCupomFiscal() {
    return "Data/Hora pagamento: " + getDataHoraPagamento() + "Número do pagamento: " + getNumeroPagamento() + "Valor Pago: " + getValorPago() + "Número do cartão:  " + this.numCartao + "Bandeira: "+ this.bandeiraCartao + "\nNome do titular: " + this.titularCartao;
  }

}