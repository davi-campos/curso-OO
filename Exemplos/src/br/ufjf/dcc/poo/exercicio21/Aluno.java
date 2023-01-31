package br.ufjf.dcc.poo.exercicio21;

public class Aluno {
	private int matricula;
	private String nome;
	private float[] notas = new float[3];
	private float media, provaFinal;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public float media(float[] notas) {
		media = (float)((notas[0]+notas[1])*2.5 + notas[2]*2)/3;
		return media;
	}
	public float provaFinal(float media) {
		if(media>= 4 || media<6) {
			provaFinal = 6 - media;
		}else if(media <4 || media >6) {
			provaFinal = 0;
		}
		return provaFinal;
	}	
	
	

}
