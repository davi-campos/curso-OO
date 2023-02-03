package br.ufjf.ddc.poo.model;

import java.util.ArrayList;

public class Veiculo {
	//variaveis
	private String placa;
	private String modelo;
	private String cor;
	
	private Socio socio;
	private ArrayList<Estadia> estadias;
	
	//getters e setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public ArrayList<Estadia> getEstadias() {
		return estadias;
	}
	public void setEstadias(ArrayList<Estadia> estadias) {
		this.estadias = estadias;
	}

}
