package Animal_POO;

public class Preguica extends Animail{

	public Preguica(String n, int idade) {
		super(n,idade);		
	}
	
	public void PreguicaAnda() {
		System.out.println("\nA "+getNome()+" esta subindo na árvore devagarzinho...");
	}
	
	@Override
	public void EmitirSom(String som) {
		System.out.println("\nA "+getNome()+" vai emitir seu som preguiçoso");	
		System.out.println("\nAAAAAAAH\nAAAH\nAAAAAH");
	}
	
	@Override
	public void imprimirInfo(String nome, int idade) {
		System.out.println("\nA preguiça "+getNome()+" tem "+getIdade()+" anos.");
	}
	
}