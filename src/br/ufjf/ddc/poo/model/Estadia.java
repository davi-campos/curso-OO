package br.ufjf.ddc.poo.model;

public class Estadia {
	//variaveis
	private String dataHoraEnt;
	private String dataHoraSai;
	private double valor;
	
	private Veiculo veiculo;
	
	//getters e setters
	public String getDataHoraEnt() {
		return dataHoraEnt;
	}
	public void setDataHoraEnt(String dataHoraEnt) {
		this.dataHoraEnt = dataHoraEnt;
	}
	public String getDataHoraSai() {
		return dataHoraSai;
	}
	public void setDataHoraSai(String dataHoraSai) {
		this.dataHoraSai = dataHoraSai;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
