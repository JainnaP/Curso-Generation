package POO;

public class Celular extends Telefone {

	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca (int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Tatarataratata");
			break;
		case 2:
			System.out.println("Blim blim blim");
			break;
			default:
				System.out.println("Parara Parara Parara");
		}
	}	
	
	@Override
	public void disca(String numero) {
		System.out.println("O número: "+numero+" é um celular...");
	}
	
}
