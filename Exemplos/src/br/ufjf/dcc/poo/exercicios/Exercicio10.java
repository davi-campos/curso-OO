package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		int num;
		String dia[] = {"Domingo","Segunda","Terca","Quarta","Quinta","Sexta", "Sabado"};
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o numero do dia da semana: ","Semana", JOptionPane.QUESTION_MESSAGE));
		
		if(num<=0 || num>7)
			JOptionPane.showMessageDialog(null,"Dia da semana invalido!","Erro!",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"O dia da semana de número "+num+" é "+dia[num-1],"Semana",JOptionPane.INFORMATION_MESSAGE);
	}

}
