package TiposVeiculos;

import java.util.Scanner;

import Principal.Menu;

public class Carro extends Veiculo {
	
	public Carro () {
		
		this.numP = 0;
		this.numR = 0;
		
	}
	
	Menu m = new Menu();
	static Scanner ler = new Scanner(System.in);
	
	private int conf;
	private int i;
	private int numR;
	private int numP;

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
	
	public int getNumP() {
		return numP;
	}

	public void setNumP(int numP) {
		this.numP = numP;
	}
	
	private static int lerInt() {
	    String digitado = "";

	    digitado = ler.nextLine();

	    return Integer.parseInt(digitado);
	    
	}
	
	public void inserirC () {
		
		System.out.println("\nDeseja fazer inserção de dados?");
		System.out.println("1 - Sim         2 - Não");
		conf = lerInt();
		
		if (conf == 1) {
			
			inserirV();
			
			System.out.println ("Digite o número de portas do carro: ");
			setNumP(lerInt());
			
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
	
	public void imprimirC () {
		
		System.out.println("=====================================================");
		System.out.println("\nOs dados gravados no momento são: \n");
		imprimirV();
		System.out.println("Número de portas: " + getNumP());
		System.out.println("Número de rodas: " + getNumR());
		System.out.println("=====================================================");
		
	}
	
}
