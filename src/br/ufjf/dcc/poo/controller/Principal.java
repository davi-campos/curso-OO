package br.ufjf.dcc.poo.controller;

import java.util.ArrayList;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Disciplina;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		//variaveis
		
		ArrayList<Professor> professores = new ArrayList<>();
		
		ArrayList<Disciplina> disciplinasProfessor = new ArrayList<>();
				
		Professor professor = new Professor();
		professor.setNome("Gleiph");
		professor.setIdade(36);
		professor.setSexo("M");
		professor.setFormacao("Doutorado");
		professor.setHoraAula(43f);
		professor.setQuantidadeAulas(15);
		professor.setDisciplinas(disciplinasProfessor);
		professores.add(professor);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("POO");
		disciplina1.setCargaHoraria(60);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Modelagem");
		disciplina2.setCargaHoraria(60);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("BD");
		disciplina3.setCargaHoraria(60);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("redes");
		disciplina4.setCargaHoraria(60);
				
		ArrayList<Disciplina> disciplinasAluno = new ArrayList<>();
		disciplinasAluno.add(disciplina1);
		disciplinasAluno.add(disciplina2);
		disciplinasAluno.add(disciplina3);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Pedro");
		aluno1.setIdade(23);
		aluno1.setSexo("M");
		aluno1.setMatricula("123456");
		aluno1.setMensalidade(956.56f);
		aluno1.setBolsa(120f);
		aluno1.setDisciplinas(disciplinasAluno);
				
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ana");
		aluno2.setIdade(27);
		aluno2.setSexo("F");
		aluno2.setMatricula("48652");
		aluno2.setMensalidade(956.56f);
		aluno2.setBolsa(43f);
		aluno2.setDisciplinas(disciplinasAluno);
		
		ArrayList<Aluno> alunosDisciplina = new ArrayList<>();
		alunosDisciplina.add(aluno1);
		alunosDisciplina.add(aluno2);
		
		Disciplina disciplina5 = new Disciplina();
		disciplina5.setNome("Prof Web");
		disciplina5.setCargaHoraria(60);
		disciplina5.setProfessores(professores);
		disciplina5.setAlunos(alunosDisciplina);
		
		//
		for(Aluno a :disciplina5.getAlunos()) {
			System.out.println("Nome: "+a.getNome());
			System.out.println("Sexp: "+a.getSexo());
		}
		
		//metodos

	}

}
