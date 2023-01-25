package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		float xa, xb, ya, yb, d;
		
		xa = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira valor de x para ponto A:  ","Coordenadas de A", JOptionPane.QUESTION_MESSAGE));
		ya = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira valor de y para ponto A:  ","Coordenadas de A", JOptionPane.QUESTION_MESSAGE));
		xb = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira valor de x para ponto B:  ","Coordenadas de B", JOptionPane.QUESTION_MESSAGE));
		yb = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira valor de y para ponto B:  ","Coordenadas de B", JOptionPane.QUESTION_MESSAGE));
		
		d = (float) Math.sqrt(Math.pow(xb-xa, 2)+Math.pow(yb-ya, 2));
		
		JOptionPane.showMessageDialog(null,"A distancia entre os pontos: "+ d,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
