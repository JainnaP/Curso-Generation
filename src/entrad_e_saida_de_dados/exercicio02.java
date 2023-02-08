package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int diasV,anos,meses,dias,diasA,diasM;
		
		System.out.println("\nDias de vida:");
		diasV = leia.nextInt();
		
		anos = diasV / 365;
		diasA = diasV % 365;
		
		meses = diasA / 30;
		diasM = diasA % 30;
		
		System.out.println("\n Você tem " + anos + " anos, " + meses + " meses e " + diasM + " dias");
		
		
		
	}

}
