package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int altura, base;
	float area;
	System.out.print("Informe a altura:  ");
	altura = teclado.nextInt();
	System.out.print("Informe a base: ");
	base = teclado.nextInt();
	area = 0.5f * altura * base;
	System.out.println("Area: "+ area);
	}

	
}
