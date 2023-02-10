package br.ufjf.dcc.poo.controller;

public class MinhaClasseTeste {

	public static void main(String[] args) {
		MinhaClasse minhaClasse = new MinhaClasse(2);
		System.out.println(minhaClasse.aoQuadrado());
		
		MinhaClasse minhaClasseDouble = new MinhaClasse(5d);
		System.out.println(minhaClasseDouble.aoQuadradoDouble());
		
		MinhaClasseNova<Integer> minhaClasseNova = new MinhaClasseNova<>(5);
		minhaClasseNova.printar();

	}

}
