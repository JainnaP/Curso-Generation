package Laços_De_Repetiçao02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados.		
		
		Scanner leia = new Scanner(System.in);
		int num, x =0;
		
		do {
			System.out.println("\nDigite um número ");
			num = leia.nextInt();
				x=x+num;
			
		} while (num!=0);
		System.out.println("\nA soma dos números antes de digitar 0 foi de : "+x);
		
	}

}
