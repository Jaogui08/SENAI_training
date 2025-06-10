package treino_SENAI;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o turno em que você trabalha (M - Matutino, V - Vespertino, N - Noturno): ");
		String turno = scanner.next();

		switch (turno.toUpperCase()) {

		case "M":
			System.out.println("\nBom-dia!");
			break;
		case "V":
			System.out.println("\nBoa-tarde!");
			break;
		case "N":
			System.out.println("\nBoa-noite!");
			break;
		default:
			System.out.println("\nValor inválido");
			break;
		}

		scanner.close();
	}

}
