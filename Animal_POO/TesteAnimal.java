package Animal_POO;


import java.util.Scanner;

public class AnimailTeste {

	public static void main(String[] args) {
		
		int op=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		Cavalo horse = new Cavalo(null,null);
		Cachorro dog = new Cachorro(null,null);
		Preguica p = new Preguica(null,null);
		
		
		
	System.out.println("\nQual animal voc� deseja?");
	System.out.println("\n1. Cavalo");
	System.out.println("\n2. Cachorro");
	System.out.println("\n3. Pregui�a");
	op = sc.nextInt();
	
		switch(op) {
		case 1: 
		horse.imprimirInfo(nome, idade);
		horse.CaveloCorrer();
		horse.EmitirSom(null);
		break;
		case 2: 
		dog.imprimirInfo(null, op);
		dog.CachorroCorrer();
		dog.EmitirSom(null);
		break;
		case 3: 
		p.imprimirInfo(null, op);
		p.PreguicaAnda();
		p.EmitirSom(null);
		break;
		default:System.out.println("Op��o Inv�lida.");
		}
		
		
	}

}