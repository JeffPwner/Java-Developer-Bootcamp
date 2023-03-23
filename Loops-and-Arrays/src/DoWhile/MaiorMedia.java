package DoWhile;

import java.util.Scanner;

public class MaiorMedia {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		int c = 0;
		int soma = 0;
		int media = 0;
		int maior = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			
			soma += num;
			media = soma / 5;
			
			if(num > maior) {
				maior = num;
			}
			
			c++;
		}while(c < 5);
		System.out.println("Média: " + media);
		System.out.println("Maior número: " + maior);
		
	}
}
