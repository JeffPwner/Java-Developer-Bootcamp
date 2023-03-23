package DoWhile;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c = 0;
		int impar = 0;
		int par = 0;
		
		System.out.println("Digite a quantidade de números: ");
		int quantidadeNumeros = input.nextInt();
		
		do {
			System.out.println("Digite um número: ");
			int num = input.nextInt();
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			c++;
		}while(c < quantidadeNumeros);
		System.out.println("Quantidade de números ímpares: " + impar);
		System.out.println("Quantidade de números pares: " + par);
	}
}
