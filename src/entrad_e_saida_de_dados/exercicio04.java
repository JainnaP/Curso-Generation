package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		double A,B,C,D,R,S;

		System.out.println("\nEscreva um número");
		A = leia.nextDouble();
		System.out.println("\nEscreva o segundo número");
		B = leia.nextDouble();
		System.out.println("\nEscreva o terceiro número");
		C = leia.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S) / 2;
		
		System.out.println("\nO resultado é:" + D);
		
		
	}

}
