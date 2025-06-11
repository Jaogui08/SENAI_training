package treino_SENAI;

import java.util.Scanner;

public class Atividade_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a medida do 1° lado do triângulo: ");
		double lado1 = scanner.nextDouble();

		System.out.print("Informe a medida do 2° lado do triângulo: ");
		double lado2 = scanner.nextDouble();

		System.out.print("Informe a medida do 3° lado do triângulo: ");
		double lado3 = scanner.nextDouble();

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("\nSeu triângulo é equilátero");
		} else if (lado1 != lado2 && lado1 == lado3 || lado1 == lado2 && lado1 != lado3 || lado1 != lado2 && lado2 == lado3) {
			System.out.println("\nSeu triângulo é isósceles");
		} else if (lado1 != lado2 && lado1 != lado3) {
			System.out.println("\nSeu triângulo é escaleno");
		}
		
		scanner.close();
	}

}
