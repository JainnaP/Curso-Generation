package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		
		Scanner leia=new Scanner(System.in);
		
		int anos,meses,dias,totalDia;
		
		System.out.println("\nAnos");
		anos = leia.nextInt();
		System.out.println("\nMeses");
		meses = leia.nextInt();
		System.out.println("\nDias");
		dias = leia.nextInt();
		
		totalDia = dias + (anos*365) + (meses*30);
		
		System.out.println("\nSua idade em dias é : " + totalDia);
	
	
	}

}
