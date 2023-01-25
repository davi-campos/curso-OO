package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exemplo1Dialog {

	public static void main(String[] args) {
		int n1, n2, soma;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira primeiro numero inteiro:  ","Soma", JOptionPane.QUESTION_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira segundo numero inteiro:  ","Soma",JOptionPane.QUESTION_MESSAGE));
		
		soma = n1+n2;
		
		JOptionPane.showMessageDialog(null,"A soma dos numeros: "+ soma,"Resultado",JOptionPane.INFORMATION_MESSAGE);		

	}

}
