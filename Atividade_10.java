package treino_SENAI;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o 1° número: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Informe o 2° número: ");
		double numero2 = scanner.nextDouble();
		
		System.out.print("\nInforme um número para a operação (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão): ");
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		
		case 1:
			double soma = numero1 + numero2;
			System.out.println("\nO resultado da soma foi: " + soma);
			break;
		case 2:
			double subtracao = numero1 - numero2;
			System.out.println("\nO resultado da subtração foi: " + subtracao);
			break;
		case 3:
			double multiplicacao = numero1 * numero2;
			System.out.println("\nO resultado da multiplicação foi: " + multiplicacao);
			break;
		case 4:
			double divisao = numero1 / numero2;
			System.out.println("\nO resultado da divisão foi: " + divisao);
			break;
		default:
			System.out.println("\nNúmero inválido");
			break;
		}
		
		scanner.close();
	}

}
