package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		
		salario *= 1 + percentual / 100;
		
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
		
		
	}
	
	public void imprimir() {
		
		System.out.println("\nNome: "+nome+"\t\t"+"SalÃ¡rio: "+this.formatarMoeda());
		
	}
}
