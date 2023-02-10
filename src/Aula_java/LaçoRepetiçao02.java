package Aula_java;

import java.util.Scanner;

public class LaçoRepetiçao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,somaPar=0;
		
		System.out.println("\nEscreva um número");
		num = leia.nextInt();
		
		while(num!=99) {
			
			if(num%2==0) {
				somaPar+= num;
			}
			System.out.println("\nEscreve um número");
			num = leia.nextInt();
		}
		System.out.println("\nA soma dos números pares é: "+somaPar);
		
		
		
	}

}
