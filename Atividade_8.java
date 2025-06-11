package treino_SENAI;

import java.util.Scanner;

public class Atividade_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double somaNotas = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Informe a " + i + "° nota do aluno: ");
			double notas = scanner.nextDouble();
			somaNotas = somaNotas + notas;
		}

		double mediaNotas = somaNotas / 5;

		if (mediaNotas >= 6) {
			System.out.println("\nAluno aprovado com a média " + mediaNotas);
		} else {
			System.out.println("\nAluno reprovado com a média " + mediaNotas);
		}

		scanner.close();
	}

}
