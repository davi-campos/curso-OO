package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {
		int start, end, aux=0;
		String obj[];
				
		start = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro numero da sequencia: ","Imprime sequencia", JOptionPane.QUESTION_MESSAGE));
		end = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o ultimo numero da sequencia: ","Imprime sequencia", JOptionPane.QUESTION_MESSAGE));
		
		for(int i = start;i<= end;i++) {
			aux++;
		}
		
		obj = new String[aux];
		for(int i = end;i>= start;i--) {
			obj[aux-1]= Integer.toString(i);
			aux--;
		}
		
		JOptionPane.showMessageDialog(null,obj,"Sequencia",JOptionPane.INFORMATION_MESSAGE);	
		

	}

}
