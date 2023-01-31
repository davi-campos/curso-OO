package br.ufjf.dcc.poo.exercicio212;

public class Conta {
	
	private String titular, agencia, abertura;
	private int numero;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getAbertura() {
		return abertura;
	}
	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saca1(double valor) {
		saca(valor);
	}
	private void saca(double valor) {
		
		this.saldo = this.saldo - valor;
	}
	public void deposita1(double valor) {
		deposita(valor);
	}
	private void deposita(double valor) {
		
		this.saldo = this.saldo + valor;
	}
	
	public double calculaRendimento() {
		double rendimento = this.saldo * 0.1;
		return rendimento;
	}
	
	

}
