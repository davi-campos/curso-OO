package br.ufjf.dcc.poo.model;

public class Atendimento {
	//variaveis
	private int codigoAtendimento;
	private Funcionario funcionario;
	private Cliente cliente;
	
	//getters e setters
	public int getCodigoAtendimento() {
		return codigoAtendimento;
	}
	public void setCodigoAtendimento(int codigoAtendimento) {
		this.codigoAtendimento = codigoAtendimento;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
