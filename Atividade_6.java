package treino_SENAI;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o 1° número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Informe o 2° número: ");
		int numero2 = scanner.nextInt();

		System.out.print("Informe o 3° número: ");
		int numero3 = scanner.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("\nO primeiro número é maior com um valor " + numero1);
		} else if (numero2>numero1 && numero2>numero3) {
			System.out.println("\nO segundo número é maior com um valor " + numero2);
		} else if (numero3>numero1 && numero3>numero2) {
			System.out.println("\nO terceiro número é maior com um valor " + numero3);
		} 
		
		scanner.close();
	}

}
