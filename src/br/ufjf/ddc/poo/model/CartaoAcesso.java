package br.ufjf.ddc.poo.model;

public class CartaoAcesso {
	//variaveis
	private int numero;
	private int dataValidade;
	
	private Socio socio;
		
	//getters e setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(int dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
}
