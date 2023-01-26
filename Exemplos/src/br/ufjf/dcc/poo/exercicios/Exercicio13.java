package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		int num=0, aux=0;
		float soma=0;
		
		while(num!=-1) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um numero ou -1 para parar: ","Media aritmetica", JOptionPane.QUESTION_MESSAGE));
			if(num!=-1)			
				soma = soma + num;
			aux++;
		}
		
		
		JOptionPane.showMessageDialog(null,"Media aritmetica e: "+soma/(aux-1),"Resultado",JOptionPane.INFORMATION_MESSAGE);

	}

}
