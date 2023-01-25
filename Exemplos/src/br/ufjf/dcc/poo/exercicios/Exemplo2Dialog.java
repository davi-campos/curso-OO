package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exemplo2Dialog {

	public static void main(String[] args) {
		int n1, n2, soma;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira primeiro numero inteiro:  ","Soma", JOptionPane.DEFAULT_OPTION));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira segundo numero inteiro:  ","Soma",JOptionPane.DEFAULT_OPTION));
		
		soma = n1+n2;
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros: "+ soma,"Resultado",JOptionPane.INFORMATION_MESSAGE);

	}

}
