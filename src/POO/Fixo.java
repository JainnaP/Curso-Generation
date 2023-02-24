package POO;

public class Fixo extends Telefone {

	public Fixo() {
		super ("Telefone fixo");
	}
	
	@Override
	public void toca (int numToques) {
		
		for (int i=0; i<numToques; i++) {
			System.out.println("Trim Trim Trim");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("Discando: "+numero);
	}
	
}
