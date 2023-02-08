package Aula_java;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
	
		
//Questão 1
		
		
		Scanner leia= new Scanner(System.in);
		float salario,abono,novoSalario;
		
		
		System.out.println("\nOlá, qual o seu salário?");
		salario = leia.nextFloat();
		System.out.println("\nE qual o valor do abono?");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nSeu salário sera é: %2.2f",novoSalario);
		
		
//Questão 2
		
		
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("\nOlá, informe sua nota na primeira prova");
		nota1 = leia.nextFloat();
		System.out.println("\nInforme sua nota na segunda prova");
		nota2 = leia.nextFloat();
		System.out.println("\nInforme sua nota na terceira prova");
		nota3 = leia.nextFloat();
		System.out.println("\nInforme sua nota na quarta e última prova");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nA sua média é: %2.1f",media);
		
		
//Questão 3
		
		
		float salarioB,adicional,valorH,horas,descontos,salarioL;
		
		System.out.println("\nOlá, informe o seu salário");
		salarioB = leia.nextFloat();
		System.out.println("\nInforme seu Adicional noturno");
		adicional = leia.nextFloat();
		System.out.println("\nInforme o valor das suas horas extras");
		valorH = leia.nextFloat();
		System.out.println("\nInforme quantas horas extras você trabalhou");
		horas = leia.nextFloat();
		System.out.println("\nInforme o valor dos descontos");
		descontos = leia.nextFloat();
		
		salarioL = salarioB + adicional + (valorH*horas) - descontos;
		
		System.out.printf("\nSeu salário líquido é: %2.2f",salarioL);
		
		
//Questão 4
		
		
		int n1,n2,n3,n4,calculo;
		
		System.out.println("\nInforme o primeiro número");
		n1 = leia.nextInt();
		System.out.println("\nInforme o segundo número");
		n2 = leia.nextInt();
		System.out.println("\nInforme o terceiro número");
		n3 = leia.nextInt();
		System.out.println("\nInforme o quarto número");
		n4 = leia.nextInt();
		
		calculo = (n1*n2) - (n3*n4);
		
		System.out.println("\nA diferença do produto entre o n1 e n2 pelo produto do n3 e n4 é: "+calculo);
		
		
		
	}

}
