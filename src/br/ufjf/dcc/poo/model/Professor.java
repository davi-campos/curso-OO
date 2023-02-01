package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
	//variaveis
	private String codigo;
	private String formacao;
	private float horaAula;
	private int quantidadeAulas;
	ArrayList<Disciplina> disciplinas;
	
	//getters e setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getHoraAula() {
		return horaAula;
	}
	public void setHoraAula(float horaAula) {
		this.horaAula = horaAula;
	}
	public int getQuantidadeAulas() {
		return quantidadeAulas;
	}
	public void setQuantidadeAulas(int quantidadeAulas) {
		this.quantidadeAulas = quantidadeAulas;
	}	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	//metodos
	public float calcularPagamentos() {
		return 0;
	}
	

}
