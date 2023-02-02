package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Departamento {
	//variaveis
	private int codigo;
	private ArrayList<Funcionario> funcionarios;
	
	//getters e setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	

}
