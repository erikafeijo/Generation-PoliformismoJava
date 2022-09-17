package Animal_POO;

public class Cavalo extends Animail{
	
	
	public Cavalo(String n, int idade) {
		super(n,idade);		
	}
	
	public void CaveloCorrer() {
		System.out.println("\nO "+getNome()+" vai correr !");
		System.out.println("\nPocot�, pocot�, ...");
	}

	@Override
	public void EmitirSom(String som) {
		System.out.println("\nO "+getNome()+" vai relinchar");	
		System.out.println("\niiirrrr�\niiirrrr�\niiirrrr�");
	}
	
	@Override
	public void imprimirInfo(String nome, int idade) {
		System.out.println("\nO cavalo "+getNome()+" tem "+getIdade()+" anos.");
	}
}