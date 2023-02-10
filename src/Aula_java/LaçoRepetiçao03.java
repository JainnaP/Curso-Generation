package Aula_java;

import java.util.Scanner;

public class LaçoRepetiçao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tabuada,x=1,res;
		
		System.out.println("\nDigite o número para ver a tabuada: ");
		tabuada = leia.nextInt();
		
		do {
			
			res = tabuada * x;
			System.out.println("\n"+tabuada+" x "+x+" = "+res);
			x++;
		}while(x<=10);
		
		
		
	}

}
