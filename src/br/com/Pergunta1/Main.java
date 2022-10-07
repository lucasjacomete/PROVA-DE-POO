package br.com.Pergunta1;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    String nome, descricao, endereco, dataInicio, dataFim;
    int opcao = 0;

    do {
      opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada: \n<1> Cadastrar Projeto Distribuir Alimentos \n<2> Cadastrar Projeto Trabalho Voluntário \n<3> Sair"));
      if (opcao != 3) {
        nome = JOptionPane.showInputDialog("Nome do projeto");
        descricao = JOptionPane.showInputDialog("Descrição do projeto " + nome);
        endereco = JOptionPane.showInputDialog("Endereço do projeto " + nome);
        dataInicio = JOptionPane.showInputDialog("Data de inicio");
        dataFim = JOptionPane.showInputDialog("Data fim");

        switch (opcao) {
          case 1:

            String descAlimento = JOptionPane.showInputDialog("Descrição do alimento");
            int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
            DistribuicaoAlimento dAlimento = new DistribuicaoAlimento(nome, descricao, endereco, dataInicio, dataFim, descAlimento, qtde);
            dAlimento.validaProjeto();
            JOptionPane.showMessageDialog(null, dAlimento.imprimeProjeto(), "Cadastro",JOptionPane.INFORMATION_MESSAGE);
            break;

          case 2:
            String tipotrabalho = JOptionPane.showInputDialog("Informe o tipo de trabalho");
            int duracaoTrabalho = Integer
                .parseInt(JOptionPane.showInputDialog("Duração do trablho " + tipotrabalho));
            TrabalhoVoluntario tVoluntario = new TrabalhoVoluntario(nome, descricao, endereco, dataInicio, dataFim, tipotrabalho, duracaoTrabalho);
            tVoluntario.validaProjeto();
            JOptionPane.showMessageDialog(null, tVoluntario.imprimeProjeto(), "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            break;
          default:
            break;
        }
      }

    } while (opcao != 3);

  }
}