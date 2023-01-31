package br.ufjf.dcc.poo.controller;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Funcionario;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Afu");
		aluno.setCpf("881.564.584-36");
		aluno.setRg("MG-35489796");
		aluno.setSexo("M");
		aluno.setMatricula("12354896");
		
		Professor professor = new Professor();
		professor.setNome("Ronney");
		professor.setCpf("546.254.675-69");
		professor.setRg("MG-3982929");
		professor.setSexo("M");
		professor.setSiape("5841623");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Carol");
		funcionario.setCpf("045.584.358-65");
		funcionario.setRg("MG-8462688");
		funcionario.setSexo("F");
		funcionario.setRegistro("F66948626");
		

	}

}
