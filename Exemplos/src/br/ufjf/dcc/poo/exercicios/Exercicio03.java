package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//cria objeto teclado e declara variaveis
		Scanner teclado = new Scanner(System.in);
		float a,b,c,r1,r2;
		float delta;
		
		//recebe valores das variaveis
		System.out.print("Informe valor a:  ");
		a = teclado.nextFloat();
		System.out.print("Informe valor b:  ");
		b = teclado.nextFloat();
		System.out.print("Informe valor c:  ");
		c = teclado.nextFloat();

		
		//operacoes matematicas bhaskara
		delta = (float) Math.sqrt((b*b) - (4*a*c));
		r1 = (-b+delta)/(2*a);
		r2 = (-b-delta)/(2*a);
		
		//imprime resultado
		System.out.println("Valor da raiz 1: " +r1);
		System.out.println("Valor da raiz 2: " +r2);

	}

}
