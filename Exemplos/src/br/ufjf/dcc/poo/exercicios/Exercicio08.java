package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade: ","Idade", JOptionPane.QUESTION_MESSAGE));
		
		if(idade <= 3) 
			JOptionPane.showMessageDialog(null,"Bebe","Resultado",JOptionPane.INFORMATION_MESSAGE);
		else if(idade <=13)
			JOptionPane.showMessageDialog(null,"Crianca","Resultado",JOptionPane.INFORMATION_MESSAGE);
		else if(idade<20)
			JOptionPane.showMessageDialog(null,"Adolescente","Resultado",JOptionPane.INFORMATION_MESSAGE);
		else if(idade<65)
			JOptionPane.showMessageDialog(null,"Adulto","Resultado",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Idoso","Resultado",JOptionPane.INFORMATION_MESSAGE);

	}

}
