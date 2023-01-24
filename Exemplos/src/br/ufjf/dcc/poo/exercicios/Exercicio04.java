package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//cria objeto teclado e declara variaveis
				Scanner teclado = new Scanner(System.in);
				int c5,c10,c25,c50,r1;
				int valor, valIni;
				
				//le valores das variaveis
				System.out.print("Informe valor em centavos:  ");
				valor = teclado.nextInt();
				valIni = valor;
								
				//operacoes matematicas
				r1 = valor/100;
				valor = valor - r1*100;
				c50 = valor/50;
				valor = valor - c50*50;
				c25 = valor/25;
				valor = valor - c25*25;
				c10 = valor/10;
				valor = valor - c10*10;
				c5 = valor/5;
				valor = valor - c5*5;
				
				//imprime resultado
				System.out.println("Para o valor de "+valIni+" centavos, a menor quantidade de moedas é: "+r1+" moedas de 1 real, "
						+c50+" moedas de 50 centavos, "+c25+" moedas de 25 centavos, "+c10+" moedas de 10 centavos, e "+c5+" moedas de 5 centavos.");


	}

}
