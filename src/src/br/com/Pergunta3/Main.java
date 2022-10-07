package Pergunta3;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Mensalidade mens1 = new Mensalidade(300, 6);
    JOptionPane.showMessageDialog(null, "Valor da mensalidade" + mens1.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
    Mensalidade mens2 = new Mensalidade(300, 9);
    JOptionPane.showMessageDialog(null, "Valor da mensalidade" + mens2.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
    Mensalidade mens3 = new Mensalidade(300, 2);
    JOptionPane.showMessageDialog(null, "Valor da mensalidade" + mens3.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
    Mensalidade mens4 = new Mensalidade(300, 0);
    JOptionPane.showMessageDialog(null, "Valor da mensalidade" + mens4.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
  }
}