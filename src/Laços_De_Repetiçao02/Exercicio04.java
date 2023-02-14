package Laços_De_Repetiçao02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
//
		
		Scanner leia = new Scanner(System.in);
		
		int idade,genero,pistol,pessoasC=0,mulheresNervosas=0,homemAgressivo=0,start=0;
		int jovensCalmos=0,adultosBravos=0,pessoa=0;
		
		while (pessoa<=3) {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			System.out.println("\nDigite sua identidade de gênero: ");
			System.out.println("\n1 feminino ");
			System.out.println("\n2 masculino ");
			System.out.println("\n3 outros ");
			genero = leia.nextInt();
			
			System.out.println("\nEscolha uma das opções abaixo: ");
			System.out.println("\n1 se você é calmo ");
			System.out.println("\n2 se você é nervoso ");
			System.out.println("\n3 se você é agressivo ");
			pistol = leia.nextInt();
			
			if (pistol==1) {
				pessoasC++;
			} if (pistol==1 && genero==1) {
				mulheresNervosas++;
			 }if (pistol==2 && pistol==3) {
				 homemAgressivo++;
			 }if (idade>40 && pistol==2) {
				 adultosBravos++;
			 }if (idade<18 && pistol==1) {
				 jovensCalmos++;
			 }pessoa++;
		}
		
		System.out.println("\nO número de pessoas calmas é: "+pessoasC);
		System.out.println("\nO número de mulheres nervosas é: "+mulheresNervosas);
		System.out.println("\nO número de homens agressivos é: "+homemAgressivo);
		System.out.println("\nO número de pessoas nervossas com mais de 40 anos é: "+adultosBravos);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos é: "+jovensCalmos);
		
	}

}
