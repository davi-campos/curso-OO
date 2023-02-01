package br.ufjf.dcc.poo.model;

public class Caminhao extends Veiculo{
	
	private double tara;
	
	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}
	
	@Override
	public double calcularConsumo(double precoLitro) {
		return ((this.getCapacidadeTanque()/this.getKmPorLitro())*precoLitro)/this.tara;
	}

}
