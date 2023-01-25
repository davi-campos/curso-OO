package br.ufjf.dcc.poo.exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		//declara variaveis
		float valor, aux;
		float custo2, custo25, custo520, custo20;
		DecimalFormat deci = new DecimalFormat("0.00"); //duas casas decimais
		
		//le valor do usuario
		valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor do produto: ","Inserção do valor do produto", JOptionPane.QUESTION_MESSAGE));
		aux = valor;
		
		//atribui valor variaveis
		custo2 = 0.15f;
		custo25 = 0.02f;
		custo520 = 0.1f;
		custo20 = 0.08f;
		
		//tratamento do valor com operacoes matematicas
		if(valor<=2)
			valor = valor+custo2;
		else if(valor<=5)
			valor = valor+custo2 + (aux-2)*custo25;
		else if(valor<=20)
			valor = valor+custo2 + (3)*custo25 + (aux-15)*custo520;
		else if(valor>20)
			valor = valor+custo2 + (3)*custo25 + (15)*custo520 + (aux-20)*custo20;
		
		//retorna resultado final		
		JOptionPane.showMessageDialog(null,"Valor atual será "+deci.format(valor)+"R$","Valor Atualizado",JOptionPane.INFORMATION_MESSAGE);
	}

}
