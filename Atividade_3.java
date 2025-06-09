package treino_SENAI;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("\nErro, o número informado é negativo");
		}
		
		scanner.close();
	}

}
