package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		int num;
		String frase;
		Object obj[];
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira quantidade de vezes a repetir: ","Repeticao", JOptionPane.QUESTION_MESSAGE));
		
		obj = new Object[num];
		
		frase = "Faca os exercicios novamente";
		
		for(int i=0; i<num;i++) {
			obj[i] = frase;
		}
		
		JOptionPane.showMessageDialog(null,obj,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		

	}

}
