package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		String[] nome = new String[3];
		float[] nota = new float[3];
		float media=0;
		
		for(int i =0;i<3;i++) {
			nome[i]=JOptionPane.showInputDialog(null,"Insira o nome do aluno "+i+1+":","Nomes dos alunos", JOptionPane.QUESTION_MESSAGE);
			nota[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota do aluno "+i+1+":","Notas dos alunos", JOptionPane.QUESTION_MESSAGE));
			media = media+nota[i];
		}
		
		media = media/3;
		
		for(int i=0;i<3;i++) {
			if(nota[i]>media) {
				JOptionPane.showMessageDialog(null,"Parabens "+ nome[i],"Resultado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}

	}

}
