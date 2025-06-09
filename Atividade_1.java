package treino_SENAI;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String systemuser = "jaogui08";
		String systempasswd = "123456";
		
		int tentativas = 0;
		while (true) {
			System.out.print("Informe o seu usuário: ");
			String user = scanner.nextLine();
			
			if (!user.equals(systemuser)) {
				System.out.println("Usuário incorreto!\n");
				tentativas++;
				
				if (tentativas > 3) {
					System.out.println("Número máximo de tentativas atingido, encerrando o programa...");
					scanner.close();
					return;
				}
				
			} else {
				System.out.println("Usuário correto\n");
				break;
			}
		}
		
		int tentativas2 = 0;
		while (true) {
			System.out.print("Informe sua senha: ");
			String passwd = scanner.nextLine();
			
			if (!passwd.equals(systempasswd)) {
				System.out.println("Senha incorreta!\n");
				tentativas2++;
				
				if (tentativas2 > 3) {
					System.out.println("Número máximo de tentativas atingido, encerrando o programa...");
					scanner.close();
					return;
				}
				
			} else {
				System.out.println("\nBem-vindo ao sistema SENAI");
				break;
			}
		}
		
		scanner.close();
	}

}
