package TiposVeiculos;

import java.util.Scanner;

public class Moto extends Veiculo {
	
	public Moto () {
		
		this.numR = 0;
		
	}
	
	static Scanner ler = new Scanner(System.in);
	
	private int conf;
	private int i;
	private int numR;

	public int getConf() {
		return conf;
	}

	public void setConf(int conf) {
		this.conf = conf;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public int getNumR() {
		return numR;
	}

	public void setNumR(int numR) {
		this.numR = numR;
	}
	
	private static int lerInt() {
	    String digitado = "";

	    digitado = ler.nextLine();

	    return Integer.parseInt(digitado);
	    
	}
	
	public void inserirM () {
		
		System.out.println("\nDeseja fazer inserção de dados?");
		System.out.println("1 - Sim         2 - Não");
		conf = lerInt();
		
		if (conf == 1) {
			
			inserirV();
			
			System.out.println ("Digite o número de rodas: ");
			setNumR(lerInt());
			
		}
		
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");

		}
		
		else {
			
			System.out.println("\n!! Opção Inválida !!\n");

		}
		
	}
	
	public void imprimirM () {
		
		System.out.println("=====================================================");
		imprimirV();
		System.out.println("Número de rodas: " + getNumR());
		System.out.println("=====================================================");
		
	}
	
}