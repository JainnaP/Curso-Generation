package Laços_Condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float A,B,C,soma;
		
		System.out.println("\nDigite o valor de A:");
		A = leia.nextFloat();
		System.out.println("\nDigite o valor de B:");
		B = leia.nextFloat();
		System.out.println("\nDigite o valor de C:");
		C = leia.nextFloat();
		
		soma = A+B;

		if (soma > C) {
			System.out.println("\nA soma de A e B é maior que o valor de C");
			}
		else if (soma == C){
			System.out.println("\nA soma de A e B é igual ao valor de C");
		}
		else if (soma < C) {
			System.out.println("\nA soma de A e B é menor que o valor de C");
		}
		
		
		}
		
}
