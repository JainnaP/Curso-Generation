package Aula_java;

import java.util.Scanner;

public class Ex_LaçoRepetiçao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float n1,n2,n3,media,somaMedia=0,mg;
		int x;
		
		for(x=1;x<=4;x++)
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3;
			System.out.println("\nA média do alune é: "+media);
			
			somaMedia += media;
		}
		mg = somaMedia/(x-1);
	}

}
