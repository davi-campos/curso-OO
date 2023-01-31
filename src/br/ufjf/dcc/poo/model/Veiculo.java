package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
	
	private String marca;
	private double capacidadeTanque;
	private double kmPorLitro;
	
	private double consumo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	private double calcularConsumo (double precoLItro) {
		return 0;
	}

}
