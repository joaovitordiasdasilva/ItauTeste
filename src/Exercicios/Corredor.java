package Exercicios;

public class Corredor implements Comparable<Corredor> {

	public String nome;
	public Double tempo;

	public Corredor(String nome, Double tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTempo() {
		return tempo;
	}

	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}

	@Override
	public int compareTo(Corredor outroCorredor) {
		if (this.tempo > outroCorredor.getTempo()) {
			return 1;
		}
		if (this.tempo < outroCorredor.getTempo()) {
			return -1;
		}
		return 0;
	}
}
