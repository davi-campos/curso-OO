package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Pessoa {
	//variaveis
	private String nome;
	private Date dataNasc;
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	//metodos
	public int calculaIdade() {
		return 0;
	}

}
