package Vetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] num = new int[3][3];
		int linha, coluna, somaDiagonalP=0, somaDiagonalS=0;
		String valoresDiagonalP="", valoresDiagonalS="";
		
		for (linha=0;linha<3;linha++) {
			for (coluna=0;coluna<3;coluna++) {
				System.out.printf("Digite um número na posição [%d][%d]: ",linha,coluna);
				num[linha][coluna] = leia.nextInt();
				
				if(linha==coluna) {
					valoresDiagonalP += num[linha][coluna]+" ";
					somaDiagonalP += num[linha][coluna];
				}
				
				if(linha+coluna==2) {
					valoresDiagonalS += num[linha][coluna]+" ";
					somaDiagonalS += num[linha][coluna];
				}
				
			}
		}
		
		System.out.println("Elementos na diagonal principal: "+valoresDiagonalP);
		System.out.println("Elementos na diagonal secundária: "+valoresDiagonalS);
		System.out.println("Soma dos elementos na diagonal principal: "+somaDiagonalP);
		System.out.println("Soma dos elementos na diagonal secundária: "+somaDiagonalS);
		
	}

}
