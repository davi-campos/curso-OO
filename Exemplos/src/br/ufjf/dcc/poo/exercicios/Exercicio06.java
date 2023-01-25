package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		int dist, gas;
		float rend;
		
		dist = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira distancia percorrida em km:  ","Distancia Percorrida", JOptionPane.QUESTION_MESSAGE));
		gas = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira volume do tanque de combustivel em l:  ","Volume Tanque Combustivel", JOptionPane.QUESTION_MESSAGE));
		
		rend = dist/gas;
		
		JOptionPane.showMessageDialog(null,"O rendimento do carro foi de: "+ rend+"km/l","Rendimento",JOptionPane.INFORMATION_MESSAGE);
	}

}
