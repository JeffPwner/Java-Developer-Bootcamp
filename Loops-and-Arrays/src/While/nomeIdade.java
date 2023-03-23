package While;

import java.util.Scanner;

public class nomeIdade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite seu nome: ");
			String nome = input.next();
			
			System.out.println("Digite sua idade: ");
			int idade = input.nextInt();
			
			if(nome.equals("0")) {
				break;
			}
		}
	}
}
