package br.ufjf.dcc.poo.exercicio21;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		for(int i = 0;i<1;i++) {
			Aluno a = new Aluno();
			float[] notas = new float[2];
			a.setNome(JOptionPane.showInputDialog(null,"Insira o nome: ","Aluno", JOptionPane.QUESTION_MESSAGE));
			a.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a matricula: ","Aluno", JOptionPane.QUESTION_MESSAGE)));
			for(int j=0;j<2;j++) {
				notas[j]=Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a nota "+(j+1)+": ","Notas", JOptionPane.QUESTION_MESSAGE));
			}
			
			a.setNotas(notas);
			alunos.add(a);
		}
		
		for(Aluno p : alunos) {
			
			Object[] obj = {
				"Dados: ",
				p.getNome(),
				p.getMatricula(),
				java.util.Arrays.toString(p.getNotas())
			};
			JOptionPane.showMessageDialog(null,obj,p.getNome(),JOptionPane.INFORMATION_MESSAGE);
		}
		

	}

}
