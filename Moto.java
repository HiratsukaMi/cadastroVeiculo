package TiposVeiculos;

import java.util.Scanner;

import Principal.Menu;

public class Moto extends Veiculo {
	
	public Moto () {
		
	}
	
	Menu m = new Menu();
	
	int conf;
	
	static Scanner ler = new Scanner(System.in);
	
	private static int lerInt() {
	    String digitado = "";

	    digitado = ler.nextLine();

	    return Integer.parseInt(digitado);
	    
	}
	
	public void inserirM () {
		
		System.out.println ("\nDigite o nome da moto:");
		setNome(ler.nextLine());
		
		System.out.println ("Digite a marca da moto: ");
		setMarca(ler.nextLine());
		
		System.out.println ("Digite a cor da moto: ");
		setCor(ler.nextLine());
		
		System.out.println ("Digite a placa da moto: ");
		setPlaca(ler.nextLine());
		
		System.out.println ("Digite o n�mero de rodas: ");
		setNumR(lerInt());
		
		System.out.println ("Digite o nome do propriet�rio: ");
		setProprietario(ler.nextLine() + "\n");
		
	}
	
	public void imprimirM () {
		
		System.out.println("Os dados gravados no momento s�o: \n");
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Cor: " + getCor());
		System.out.println("Placa: " + getPlaca());
		System.out.println("N�mero de rodas: " + getNumR());
		System.out.println("Propriet�rio: " + getProprietario() + "\n");
		
	}
	
public void excluirM() {
		
		System.out.println("Deseja excluir os dados?\n");
		System.out.println("1 - Sim         2 - N�o");
		conf = ler.nextInt();
		
		if (conf == 1) {
			
			System.out.println("Nome: ");
			setNome(" ");
			System.out.println("Marca: ");
			setMarca(" ");
			System.out.println("Cor: ");
			setCor(" ");
			System.out.println("Placa: ");
			setPlaca(" ");
			System.out.println("N�mero de rodas: ");
			setNumR(0);
			System.out.println("Propriet�rio: ");
			setProprietario(" ");
			System.out.println("!! Dados deletados !!\n");
			
			m.menuPrincipal();
			
		}
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");
			
		}
		else {
			
			System.out.println("\n!! Op��o Inv�lida !!\n");
			
		}
		
	}
	
	public void alterarM() {
		
		System.out.println("Deseja fazer altera��es nos dados?");
		System.out.println("1 - Sim         2 - N�o");
		conf = ler.nextInt();
		
		//Primeiro if = escolhe se quer fazer altera��es em todos os dados ou em um espec�fico.
		if (conf == 1) {
			
			inserirM();
			
		}
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");
				
		}
		
		else {
			
			System.out.println("\n!! Op��o Inv�lida !!\n");
			
		}
		
	}
	
}
