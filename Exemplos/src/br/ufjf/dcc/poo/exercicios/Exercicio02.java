package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//cria objeto teclado e declara variaveis
		Scanner teclado = new Scanner(System.in);
		float tFrente, tProfun, cFrente, cProfun;
		float aTer, aCasa, aLivre, percen;
		
		//recebe valores das variaveis
		System.out.print("Informe frente terreno:  ");
		tFrente = teclado.nextFloat();
		System.out.print("Informe profundidade terreno:  ");
		tProfun = teclado.nextFloat();
		System.out.print("Informe frente casa:  ");
		cFrente = teclado.nextFloat();
		System.out.print("Informe profundidade casa:  ");
		cProfun = teclado.nextFloat();
		
		//operacoes matematicas de areas, diferenca de areas, percental
		aTer = tFrente*tProfun;
		aCasa = cFrente*cProfun;
		aLivre = aTer-aCasa;
		percen = (aLivre*100)/aTer;
		
		//imprime resultado
		System.out.println("Percentual de area livre: "+ percen +"%");
	}
}
