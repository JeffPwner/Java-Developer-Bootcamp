package For;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numeroFatorial = input.nextInt();
		
		int resultadoFatorial = 1;
		
		for(int i = 1; i <= numeroFatorial; i++) {
			resultadoFatorial*=i;
			System.out.println(resultadoFatorial);
		}
	}
}
