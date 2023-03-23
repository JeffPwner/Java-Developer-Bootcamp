package For;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numTabuada = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int resultado = numTabuada * i;
			System.out.println(numTabuada + " x " + i + " = " + resultado);
		}
	}
}
