package Exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String joao, paulo, fernanda, carla;

		double tempoA = 0, tempoB = 0, tempoC = 0, tempoD = 0;

		System.out.println("Digite o tempo de joão: ");
		tempoA = ler.nextDouble();
		System.out.println("Digite o tempo de paulo: ");
		tempoB = ler.nextDouble();
		System.out.println("Digite o tempo de fernanda: ");
		tempoC = ler.nextDouble();
		System.out.println("Digite o tempo de carla: ");
		tempoD = ler.nextDouble();

		if (tempoA < tempoB && tempoA < tempoC && tempoA < tempoD) {
			System.out.println("o joao esta em primeiro ");

		} if (tempoA > tempoB && tempoA < tempoC && tempoA < tempoD) {
			System.out.println("o joao esta em segundo ");
		} if (tempoA > tempoB && tempoA > tempoC && tempoA < tempoD) {
			System.out.println("o joao esta em terceiro ");
		} if (tempoA > tempoB && tempoA > tempoC && tempoA > tempoD) {
			System.out.println("o joao esta em quarto ");
		}

		
		
		
		if (tempoB < tempoA && tempoB < tempoC && tempoB < tempoD) {
			System.out.println("o paulo esta em primeiro ");

		} if (tempoB > tempoA && tempoB < tempoC && tempoB < tempoD) {
			System.out.println("o paulo esta em segundo ");
		} if (tempoB > tempoA && tempoB > tempoC && tempoB < tempoD) {
			System.out.println("o paulo esta em terceiro ");
		} if (tempoB > tempoA && tempoB > tempoC && tempoB > tempoD) {
			System.out.println("o paulo esta em quarto ");
		}

		if (tempoC < tempoA && tempoC < tempoB && tempoC < tempoD) {
			System.out.println("o fernanda esta em primeiro ");

		} if (tempoC > tempoA && tempoC < tempoB && tempoC < tempoD) {
			System.out.println("o fernanda esta em segundo ");
		} if (tempoC > tempoA && tempoC > tempoB && tempoC < tempoD) {
			System.out.println("o fernanda esta em terceiro ");
		}  if (tempoC > tempoA && tempoC > tempoB && tempoC > tempoD) {
			System.out.println("o fernanda esta em quarto ");
		}

		if (tempoD < tempoA && tempoD < tempoB && tempoD < tempoC) {
			System.out.println("o carla esta em primeiro ");

		} if (tempoD > tempoA && tempoD < tempoB && tempoD < tempoC) {
			System.out.println("o carla esta em segundo ");
		} if (tempoD > tempoA && tempoD > tempoB && tempoD < tempoC) {
			System.out.println("o carla esta em terceiro ");
		} if (tempoD > tempoA && tempoD > tempoB && tempoD > tempoC) {
			System.out.println("o carla esta em quarto ");
		}

	}

}
