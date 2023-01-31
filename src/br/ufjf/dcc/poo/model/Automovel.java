package br.ufjf.dcc.poo.model;

public class Automovel extends Veiculo{
	
	private double calcularConsumo(double precoLitro) {
		(this.getCapacidadeTanque()/this.getKmPorLitro())*precoLitro;
	}

}
