package br.ufjf.dcc.poo.exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.CPF = "001.543.876-52";
		pessoa1.idade = 18;
		pessoa1.nome = "Afu";
		pessoa1.RG = "MG-6548765";
		pessoa1.sexo = "M";
		
		pessoa2.CPF = "009.765.456-78";
		pessoa2.idade = 35;
		pessoa2.nome = "Xabu";
		
		pessoa3.CPF = "098.235.172-46";
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "tio da limpeza";
		funcionario1.cargo = "faxineiro";
		funcionario1.matricula = "123456";
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Fulano";
		aluno1.curso = "Letra";
		aluno1.registro = "L345678";
		
		Professor professor1 = new Professor();
		professor1.nome = "Robson";
		professor1.matricula = "456789";
		professor1.numAulas = 28;

	}

}
