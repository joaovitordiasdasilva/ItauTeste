package Exercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TesteJoao {

	public static void main(String[] args) {
		String nome;
		Double tempo;

		Scanner ler = new Scanner(System.in);

		ArrayList<Corredor> corredorInfos = new ArrayList<Corredor>();

		for (int x = 0; x != 2;) {
			System.out.println("Digite o nome do corredor: ");
			nome = ler.next();
			System.out.println("Digite o tempo do corredor " + nome + ": ");
			tempo = ler.nextDouble();

			Corredor corredor = new Corredor(nome, tempo);

			corredorInfos.add(corredor);

			System.out.println("Você deseja adicionar mais um corredor\n "
					+ "Digite 1 para sim: \n"
					+ " Digite 2 para nao: ");
			x = ler.nextInt();

		}

		Collections.sort(corredorInfos);

		for (int x = 0; x < corredorInfos.size(); x++) {
			System.out.println("Participante " + corredorInfos.get(x).getNome() + " terminou a corrida em " + (x + 1)
					+ "° lugar com o tempo de: " + corredorInfos.get(x).getTempo());
		}

		System.out.println("Fim da corrida!");

		ler.close();
	}

}
