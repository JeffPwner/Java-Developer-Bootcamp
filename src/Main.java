import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva um número que represente um dia da semana de 1 a 7: ");
		int numero = input.nextInt();
		
		switch(numero){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia da semana inexistente!");
	}
		
		System.out.println("Digite um número");
		int n = input.nextInt();
		switch(n) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
		case 5:
			System.out.println("Talvez");
			break;
		case 6:
		case 7:
			System.out.println("Errado");
		}
		
		
	}
	
}


