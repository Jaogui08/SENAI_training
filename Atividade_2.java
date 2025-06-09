package treino_SENAI;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		System.out.print("Informe o número do mês em que estamos: ");
		int numeroMes = scanner.nextInt() -1;
		
		if (numeroMes < 0 || numeroMes > 11) {
			System.out.println("\nNúmero do mês inválido");
		} else {
			System.out.println("\nEstamos no mês de " + meses[numeroMes]);
		}
		
		scanner.close();
	}

}
