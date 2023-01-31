package br.ufjf.dcc.poo.exercicio212;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta();
		c1.setAbertura("01/01/2023");
		c1.setAgencia("2324");
		c1.setNumero(45965);
		c1.setSaldo(850.36);
		c1.setTitular("Jones");
		
		c1.saca1(400);
		c1.deposita1(100);
		
		System.out.println("Rendimento "+c1.calculaRendimento());
		System.out.println("Saldo "+c1.getSaldo());

	}

}
