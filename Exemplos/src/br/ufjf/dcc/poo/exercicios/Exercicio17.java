package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {
		int num=0, impar=0;
		
		while(num!=-1) {
			num = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um numero ou -1 para parar: ","Quantidade de impares", JOptionPane.QUESTION_MESSAGE));
			if(num!=1) {
				if(num%2!=0) {
					impar++;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"Voce inseriu "+impar+" numeros impares","Quantidade de impares",JOptionPane.INFORMATION_MESSAGE);
		

	}

}
