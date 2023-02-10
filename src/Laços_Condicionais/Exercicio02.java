package Laços_Condicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int nume,conta;
		
		System.out.println("\nDigite um número:");
		nume = leia.nextInt();
		conta = nume%2;
		
		if (conta==0 && nume>0){
			System.out.println("O número "+nume+" é par e positivo");
		}
		else if (conta==0 && nume<0) {
			System.out.println("\nO número "+nume+" é par e negativo");
		}
		else if (conta>0 && nume>0) {
			System.out.println("\nO número "+nume+" é ímpar e positivo");
		}
		else if (conta>0 && nume<0) {
			System.out.println("\nO número "+nume+" é ímpar e negativo");
		}
		
		
	}

}
