package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Veiculo {
	//variaveis
	private String nroPlaca;
	private String modelo;
	private Date dataUltimaRevisao;
	
	//getters e setters
	public String getNroPlaca() {
		return nroPlaca;
	}
	public void setNroPlaca(String nroPlaca) {
		this.nroPlaca = nroPlaca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getDataUltimaRevisao() {
		return dataUltimaRevisao;
	}
	public void setDataUltimaRevisao(Date dataUltimaRevisao) {
		this.dataUltimaRevisao = dataUltimaRevisao;
	}
	
	//metodos
	public Date proxRevisao() {
		Date data = new Date();
		return data;
	}

}
