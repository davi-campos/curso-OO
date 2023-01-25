package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		int a,b,c;
				
		a = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira valor de a: ","Lado A", JOptionPane.QUESTION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira valor de b: ","Lado B", JOptionPane.QUESTION_MESSAGE));
		c = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira valor de c: ","Lado C", JOptionPane.QUESTION_MESSAGE));
		
		if((Math.abs(b-c))<a && a<(b+c) && (Math.abs(a-c))<b && b<(b+c) && (Math.abs(a-b))<c && c<(a+b))
			JOptionPane.showMessageDialog(null,"Obedecem a regra para existir um triangulo","Resultado",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Nao obedecem a regra de um riangulo","Resultado",JOptionPane.INFORMATION_MESSAGE);
				
	}

}
