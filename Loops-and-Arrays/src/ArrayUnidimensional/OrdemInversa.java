package ArrayUnidimensional;

/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.*/
public class OrdemInversa {
	public static void main(String[] args) {
		
		int[] vetor = {1, 2, 3, 4, 5};
		
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i]);
		}
	}
}
