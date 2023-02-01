package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Aluno extends Pessoa{
	//variaveis
	private String matricula;
	private float mensalidade;
	private float bolsa;
	private ArrayList<Disciplina> disciplinas;
	
	//getters e setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	//metodos
	public float calcularMensalidade() {
		return 0;
	}
	
	

}
