package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		int horas,minutos,segundos,segundosH,segundosM;
		
		System.out.println("\nInforme as horas");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		segundosH = segundos % 3600;
		
		minutos = segundosH / 60;
		segundosM = segundosH % 60;
		
		System.out.println("\nO tempo total foi de " + horas + " horas " + minutos + " minutos e "+ segundosM + " segundos.");
		
		
	}

}
