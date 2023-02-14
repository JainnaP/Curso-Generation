package Laços_De_Repetiçao02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
//Solicitar a idade de várias pessoas e imprimir:
//Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99
		
		Scanner leia = new Scanner(System.in);
		int idade=0, Dmenor=0, Dmaior=0;
		
		
		while(idade != -99) {
			System.out.println("\nDigite uma idade ");
			idade = leia.nextInt();
			if(idade < 21) {
				Dmenor++;
			}
			else if (idade > 50){
				Dmaior++;
			}
		}
		System.out.println("\nA quantidade de pessoas com menos de 21 é: " +Dmenor+ " e a quantidade de pessoas com mais de 50 anos é: "+Dmaior);
		
		
	}

}
