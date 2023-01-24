package br.ufjf.dcc.poo.exercicios;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float a, b, c;
		float media;
		System.out.print("Informe primeiro valor:  ");
		a = teclado.nextFloat();
		System.out.print("Informe segundo valor:  ");
		b = teclado.nextFloat();
		System.out.print("Informe terceiro valor:  ");
		c = teclado.nextFloat();
		media = (a+b+c)/3;
		System.out.println("Media: "+ media);

	}

}
