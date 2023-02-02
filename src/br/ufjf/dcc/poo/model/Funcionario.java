package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
	//variaveis
	private int matricula;
	private Departamento departamento;
	private ArrayList<Atendimento> atendimentos;	
	
	//getters e setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public ArrayList<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	

}
