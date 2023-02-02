package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Produto {
	//variaveis
	private String nomeProduto;
	private int peso;
	private int qtdeDisponivel;
	
	private ArrayList<itenPedido> intensPedidos;
	
	//getters e setters	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}
	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}
	public ArrayList<itenPedido> getIntensPedidos() {
		return intensPedidos;
	}
	public void setIntensPedidos(ArrayList<itenPedido> intensPedidos) {
		this.intensPedidos = intensPedidos;
	}

	//metodos
	public Produto consultarProduto() {
		Produto produto = new Produto();
		return produto;
	}

}
