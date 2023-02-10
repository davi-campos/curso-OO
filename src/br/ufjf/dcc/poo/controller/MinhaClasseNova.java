package br.ufjf.dcc.poo.controller;

public class MinhaClasseNova<T> {
	//atributos e variaveis
	T obj;
	//construtor
	public MinhaClasseNova(T obj) {
		this.obj = obj;
	}
	//metodo
	public void printar() {
		System.out.println(obj);
	}

}
