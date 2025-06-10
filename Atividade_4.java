package treino_SENAI;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int somaNumeros = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.print("Informe o " + i + "° número: ");
			int numeros = scanner.nextInt();
			somaNumeros = somaNumeros + numeros;
		}

		if (somaNumeros > 80) {
			System.out.println("\nSeus números somados ultrapassam o valor 80 com o valor de " + somaNumeros + " :p");
		} else {
			System.out.println("\nNúmeros recebidos");
		}

		scanner.close();
	}

}
