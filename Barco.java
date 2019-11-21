package TiposVeiculos;

import java.util.Scanner;

public class Barco extends Veiculo {
	
	public Barco () {
		
		this.numP = 0;
		
	}
	
	static Scanner ler = new Scanner(System.in);
	
	private int conf;
	private int i;
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
	
	public void inserirB() {
			
			System.out.println("/nDeseja fazer inserção de dados?");
			System.out.println("1 - Sim         2 - Não");
			conf = lerInt();
			
			if (conf == 1) {
				
				inserirV();
				System.out.println ("Digite o número de portas do barco: ");
				setNumP(lerInt());
				
			}
			
			else if (conf == 2) {
				
				System.out.println("\nVV Retornando ao Menu VV\n");

			}
			
			else {
				
				System.out.println("\n!! Opção Inválida !!\n");

			}
		
	}

	public void imprimirB () {
		
		System.out.println("=====================================================");
		imprimirV();
		System.out.println("Número de portas: " + getNumP());
		System.out.println("=====================================================");
	
	}

}