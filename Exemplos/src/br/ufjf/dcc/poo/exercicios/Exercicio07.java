package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void palpite(int num) {
		
		int palp;
		palp = Integer.parseInt(JOptionPane.showInputDialog(null,"Tente advinhar o valor inserido","Advinhe", JOptionPane.QUESTION_MESSAGE));
		
		teste(num, palp);
	}
	
	public static void teste(int num,int palp) {
		
		if(palp == num){
			JOptionPane.showMessageDialog(null,"Acertou!","Resultado",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(palp < num){
			JOptionPane.showMessageDialog(null,"Errou! Palpite menor. Tente outra vez","Resultado",JOptionPane.INFORMATION_MESSAGE);
			palpite(num);
			}
		else if(palp > num){
			JOptionPane.showMessageDialog(null,"Errou! Palpite maior. Tente outra vez","Resultado",JOptionPane.INFORMATION_MESSAGE);
			palpite(num);
			}
		else {
			JOptionPane.showMessageDialog(null,"Errou! Tente outra vez","Resultado",JOptionPane.INFORMATION_MESSAGE);
			palpite(num);
			}		
		
	}
	public static void main(String[] args) {
		int num;
	
		num = 1+(int)(Math.random()*10);
		
		palpite(num);			
		

	}

}
