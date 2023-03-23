package While;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 10: ");
		int numero = input.nextInt();
		
		while(numero < 0 || numero > 10) {
			System.out.println("Digite um número entre 1 e 10...");
			numero = input.nextInt();
		}
	}
}
