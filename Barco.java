package TiposVeiculos;

import java.util.ArrayList;
import java.util.Scanner;

import Principal.Menu;

public class Barco extends Veiculo {
	
	//private ArrayList<Barco> barcos;
	
	public Barco () {
		
		//this.barcos = new ArrayList<Barco>();
		
	}
	
	//public ArrayList<Barco> getBarcos(){
		
		//return barcos;
		
	//}

	//Menu m = new Menu();
	
	static Scanner ler = new Scanner(System.in);
	
	private int conf;
	private int i;
	private int t;
	
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
	
	private static int lerInt() {
	    String digitado = "";

	    digitado = ler.nextLine();

	    return Integer.parseInt(digitado);
	    
	}
	
	public void inserirB() {
		
		while (true) {
			
			System.out.println("Deseja fazer inser��o de dados?");
			System.out.println("1 - Sim         2 - N�o");
			conf = lerInt();
			
			if (conf == 1) {
				
				System.out.println ("\nDigite o nome do barco: ");
				Barco.setNome(ler.nextLine());
				
				System.out.println ("Digite a marca do barco: ");
				Barco.setMarca(ler.nextLine());
				
				System.out.println ("Digite a cor do barco: ");
				Barco.setCor(ler.nextLine());
				
				System.out.println ("Digite o n�mero de portas do barco: ");
				Barco.setNumP(lerInt());
				
				System.out.println ("Digite o nome do propriet�rio: ");
				Barco.setProprietario(ler.nextLine() + "\n");
				
			}
			
			else if (conf == 2) {
				
				System.out.println("\nVV Retornando ao Menu VV\n");
				break;

			}
			
			else {
				
				System.out.println("\n!! Op��o Inv�lida !!\n");
				break;

			}
			
		}
		
	}

	public void imprimirB () {
		
		//t = barcos.size();
		
		System.out.println("\nOs dados gravados no momento s�o: \n");
		
		//for (i = 0; i < t; i++) {
			
			System.out.println("Nome: " + Barco.getNome());
			System.out.println("Marca: " + Barco.getMarca());
			System.out.println("Cor: " + Barco.getCor());
			System.out.println("N�mero de portas: " + Barco.getNumP());
			System.out.println("Propriet�rio: " + Barco.getProprietario() + "\n");
			
		//}
	
	}
	
	/*public void excluirB() {
		
		//t = barcos.size();
		
		//for (i = 0; i < t; i++) {
		
			System.out.println("Deseja excluir os dados?\n");
			System.out.println("1 - Sim         2 - N�o");
			conf = ler.nextInt();
		
			if (conf == 1) {
				
				System.out.println("Digite o �ndice que deseja excluir: ");
				i = ler.nextInt();
				Barco.
			
			}
			else if (conf == 2) {
			
				System.out.println("\nVV Retornando ao Menu VV\n");
			
			}
			else {
			
				System.out.println("\n!! Op��o Inv�lida !!\n");
			
			}
			
		//}
		
	}*/
	
	public void alterarB() {
	 
		//t = barcos.size();
		
		System.out.println("Deseja fazer altera��es nos dados?");
		System.out.println("1 - Sim         2 - N�o");
		conf = lerInt();
		
		//Primeiro if = escolhe se quer fazer altera��es em todos os dados ou em um espec�fico.
		if (conf == 1) {
			
			System.out.println("Digite o �ndice que deseja alterar: ");
			i = lerInt();
			
			for (i = 0; i < t; i++) {
				
				System.out.println ("\nDigite o nome do barco: ");
				Barco.setNome(ler.nextLine());
				
				System.out.println ("Digite a marca do barco: ");
				Barco.setMarca(ler.nextLine());
				
				System.out.println ("Digite a cor do barco: ");
				Barco.setCor(ler.nextLine());
				
				System.out.println ("Digite o n�mero de portas do barco: ");
				Barco.setNumP(lerInt());
				
				System.out.println ("Digite o nome do propriet�rio: ");
				Barco.setProprietario(ler.nextLine() + "\n");
				
			}
			
		}
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");
				
		}
		
		else {
			
			System.out.println("\n!! Op��o Inv�lida !!\n");
			
		}
		
	}

}
