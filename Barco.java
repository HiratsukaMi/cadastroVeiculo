package TiposVeiculos;

//import java.util.ArrayList;
import java.util.Scanner;

//import Principal.Menu;

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
			
			System.out.println("Deseja fazer inser��o de dados?");
			System.out.println("1 - Sim         2 - N�o");
			conf = lerInt();
			
			if (conf == 1) {
				
				System.out.println ("\nDigite o nome do barco: ");
				setNome(ler.nextLine());
				
				System.out.println ("Digite a marca do barco: ");
				setMarca(ler.nextLine());
				
				System.out.println ("Digite a cor do barco: ");
				setCor(ler.nextLine());
				
				System.out.println ("Digite o n�mero de portas do barco: ");
				setNumP(lerInt());
				
				System.out.println ("Digite o nome do propriet�rio: ");
				setProprietario(ler.nextLine() + "\n");
				
			}
			
			else if (conf == 2) {
				
				System.out.println("\nVV Retornando ao Menu VV\n");

			}
			
			else {
				
				System.out.println("\n!! Op��o Inv�lida !!\n");

			}
		
	}

	public void imprimirB () {
		
		System.out.println("\nOs dados gravados no momento s�o: \n");
			
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Cor: " + getCor());
		System.out.println("N�mero de portas: " + getNumP());
		System.out.println("Propriet�rio: " + getProprietario() + "\n");
	
	}
	
	/*public void alterarB() {
	 
		//t = barcos.size();
		
		System.out.println("Deseja fazer altera��es nos dados?");
		System.out.println("1 - Sim         2 - N�o");
		conf = lerInt();
		
		//Primeiro if = escolhe se quer fazer altera��es em todos os dados ou em um espec�fico.
		if (conf == 1) {
			
			System.out.println("Digite o �ndice que deseja alterar: ");
			i = lerInt();
			
			if () {
				
				System.out.println ("\nDigite o nome do barco: ");
				setNome(ler.nextLine());
				
				System.out.println ("Digite a marca do barco: ");
				setMarca(ler.nextLine());
				
				System.out.println ("Digite a cor do barco: ");
				setCor(ler.nextLine());
				
				System.out.println ("Digite o n�mero de portas do barco: ");
				setNumP(lerInt());
				
				System.out.println ("Digite o nome do propriet�rio: ");
				setProprietario(ler.nextLine() + "\n");
				
			}
			
		}
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");
				
		}
		
		else {
			
			System.out.println("\n!! Op��o Inv�lida !!\n");
			
		}
		
	}*/

}
