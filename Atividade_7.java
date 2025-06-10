package treino_SENAI;

import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu gênero (M - Masculino ou F - Feminino): ");
		String genero = scanner.next().toLowerCase();
		
		switch (genero) {
		
		case "m":
			System.out.println("\nMasculino");
			break;
		case "f":
			System.out.println("\nFeminino");
			break;
		default:
			System.out.println("\nEsse gênero não existe!");
		}
		
		scanner.close();
	}

}
