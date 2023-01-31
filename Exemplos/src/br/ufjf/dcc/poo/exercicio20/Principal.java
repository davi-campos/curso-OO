package br.ufjf.dcc.poo.exercicio20;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ze","masculino", 35 );
		Pessoa p2 = new Pessoa("Ana", "feminino", 42);
		Pessoa p3 = new Pessoa();
		
		p3.setNome("Jorge");
		p3.setIdade(37);
		p3.setSexo("M");
		p3.setCpf("001.345.654-76");
	
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		for(int i =0;i<2;i++) {
			
			Pessoa p = new Pessoa();
			p.setNome(JOptionPane.showInputDialog(null,"Insira o nome: ","Pessoa", JOptionPane.QUESTION_MESSAGE));
			p.setSexo(JOptionPane.showInputDialog(null,"Insira o sexo: ","Pessoa", JOptionPane.QUESTION_MESSAGE));
			p.setCpf(JOptionPane.showInputDialog(null,"Insira o cpf ","Pessoa", JOptionPane.QUESTION_MESSAGE));
			p.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade da pessoa: ","Pessoa", JOptionPane.QUESTION_MESSAGE)));
			pessoas.add(p);
			
		}
		
		for(Pessoa p : pessoas) {
			
			Object[] obj = {
				"Dados: ",
				p.getNome(),
				p.getSexo(),
				p.getCpf(),
				p.getIdade()
			};
			JOptionPane.showMessageDialog(null,obj,p.getNome(),JOptionPane.INFORMATION_MESSAGE);
		}
		

	}

}
