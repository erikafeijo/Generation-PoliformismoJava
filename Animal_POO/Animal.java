package Animal_POO;

public abstract class Animal {

	private String nome;
	private int idade;
	
	
	public Animal(String n, int idade) {
		this.setNome(n);
		this.idade = idade;
	}

	abstract public void EmitirSom(String som);
	abstract public void imprimirInfo(String nome, int idade);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}