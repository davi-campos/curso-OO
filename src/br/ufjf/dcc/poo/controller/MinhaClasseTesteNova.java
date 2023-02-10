package br.ufjf.dcc.poo.controller;

public class MinhaClasseTesteNova {

	public static void main(String[] args) {
		
		MinhaClasseNova<Integer> inteiro = new MinhaClasseNova<>(2);
		inteiro.printar();
		MinhaClasseNova<Double> decimal = new MinhaClasseNova<>(2.0);
		decimal.printar();
		MinhaClasseNova<String> palavra = new MinhaClasseNova<>("Sou uma String");
		palavra.printar();

	}

}
