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
		
		System.out.println ("Digite o número de rodas: ");
		setNumR(lerInt());
		
		System.out.println ("Digite o nome do proprietário: ");
		setProprietario(ler.nextLine() + "\n");
		
	}
	
	public void imprimirM () {
		
		System.out.println("Os dados gravados no momento são: \n");
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Cor: " + getCor());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Número de rodas: " + getNumR());
		System.out.println("Proprietário: " + getProprietario() + "\n");
		
	}
	
public void excluirM() {
		
		System.out.println("Deseja excluir os dados?\n");
		System.out.println("1 - Sim         2 - Não");
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
			System.out.println("Número de rodas: ");
			setNumR(0);
			System.out.println("Proprietário: ");
			setProprietario(" ");
			System.out.println("!! Dados deletados !!\n");
			
			m.menuPrincipal();
			
		}
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");
			
		}
		else {
			
			System.out.println("\n!! Opção Inválida !!\n");
			
		}
		
	}
	
	public void alterarM() {
		
		System.out.println("Deseja fazer alterações nos dados?");
		System.out.println("1 - Sim         2 - Não");
		conf = ler.nextInt();
		
		//Primeiro if = escolhe se quer fazer alterações em todos os dados ou em um específico.
		if (conf == 1) {
			
			inserirM();
			
		}
		else if (conf == 2) {
			
			System.out.println("\nVV Retornando ao Menu VV\n");
				
		}
		
		else {
			
			System.out.println("\n!! Opção Inválida !!\n");
			
		}
		
	}
	
}
