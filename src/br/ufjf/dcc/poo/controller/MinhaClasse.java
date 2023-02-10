package br.ufjf.dcc.poo.controller;

public class MinhaClasse {
	//atributos e variaveis
	public int num;
	public Double num1;
	
	//construtor
	public MinhaClasse(int num) {
		this.num = num;
	}
	public MinhaClasse(Double num1) {
		this.num1 = num1;
	}
	
	//metodos
	public int aoQuadrado() {
		return num*num;
	}
	public Double aoQuadradoDouble() {
		return num1*num1;
	}

}
