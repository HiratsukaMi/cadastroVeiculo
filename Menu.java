package Principal;

import java.util.Scanner;

public class Menu {
	
	private int op;
	Scanner ler = new Scanner(System.in);
	
	public int getOp() {
		
		return op;
		
	}
	
	public void setOp(int op) {
		
		this.op = op;
		
	}
	
	public int menuPrincipal() {
		
		System.out.println("//* Menu Principal *//\n");
		System.out.println("Digite o tipo de veículo: ");
		System.out.println("1 - Barco;;");
		System.out.println("2 - Carro;;");
		System.out.println("3 - Moto;;");
		System.out.println("4 - Encerrar;;");
		op = ler.nextInt();
		
		return op;
		
	}
	
	public int menuInterno() {
		
		System.out.println("=====================================================");
		System.out.println("\n//* Digite a ação que deseja realizar: *//\n");
		System.out.println("1 - Inserção;;");
		System.out.println("2 - Impressão;;");
		System.out.println("3 - Exclusão;;");
		System.out.println("4 - Encerrar;;");
		op = ler.nextInt();
		
		return op;
		
	}

}
