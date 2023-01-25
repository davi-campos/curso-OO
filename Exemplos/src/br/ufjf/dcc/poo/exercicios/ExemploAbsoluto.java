package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExemploAbsoluto {

	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira um numero:  ","Numero Absoluto", JOptionPane.QUESTION_MESSAGE));
		
		if (num < 0 )
			num = -num;
		
		JOptionPane.showMessageDialog(null,"Valor absoluto: "+ num,"Numero Absoluto",JOptionPane.INFORMATION_MESSAGE);
	}

}
