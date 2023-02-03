package br.ufjf.ddc.poo.model;

import java.util.ArrayList;

public class Socio {
	//variaveis
	private String matricula;
	private String nome;
	
	private CartaoAcesso cartaoAcesso;
	private ArrayList<Veiculo> veiculos;
	private ArrayList<Boleto> boletos;
	
	//getters e setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CartaoAcesso getCartaoAcesso() {
		return cartaoAcesso;
	}
	public void setCartaoAcesso(CartaoAcesso cartaoAcesso) {
		this.cartaoAcesso = cartaoAcesso;
	}
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}
	public void setBoletos(ArrayList<Boleto> boletos) {
		this.boletos = boletos;
	}
	
	

}
