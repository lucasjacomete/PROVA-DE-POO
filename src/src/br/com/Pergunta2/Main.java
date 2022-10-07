package br.com.Pergunta2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Pix pix = new Pix("01/01/1901 00:00", 987654321, 1000, true);
    JOptionPane.showMessageDialog(null, pix.imprimirCupomFiscal(), "Detalhes da Transação", JOptionPane.INFORMATION_MESSAGE);

    CartaodeCredito cCredito = new CartaodeCredito("01/01/1901 00:00", 987654321, 1000.99, "000000020000001", "Visa", "Osvaldo");
    JOptionPane.showMessageDialog(null, cCredito.imprimirCupomFiscal(), "Detalhes da Transação", JOptionPane.INFORMATION_MESSAGE);
  }
}