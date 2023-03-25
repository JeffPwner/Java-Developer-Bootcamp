package ArrayUnidimensional;

import java.util.Scanner;

/*Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.*/
public class Consoante {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		
		int c = 0;
		
		do {
			System.out.println("Digite uma letra: ");
			String letra = input.next();
			
			if(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u")) {
				consoantes[c] = letra;
				quantidadeConsoantes++;
			}

			c++;
		}while(c < consoantes.length);
		System.out.println(quantidadeConsoantes);
	}
}
