package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TiposVeiculos.Barco;
import TiposVeiculos.Carro;
import TiposVeiculos.Moto;

public class Principal {

	public static void main(String[] args) {
		
		List<Barco> barcos = new ArrayList<Barco>();
		Carro c = new Carro();
		Moto m = new Moto();
		Menu mP = new Menu();
		Scanner ler = new Scanner(System.in);
		int t;
			
		do {
				
			switch (mP.menuPrincipal()) {
			
				case 1:
					
					switch (mP.menuInterno()) {
					
						case 1:
							Barco b = new Barco();
							b.inserirB();
							barcos.add(b);
						break;
						case 2:
							t = barcos.size();
							for(int i = 0; i < t; i++) {
								
								barcos.get(i).imprimirB();
								
							}
						break;
						case 3:
							
						break;
						case 4:
							System.out.println("Deseja excluir os dados?\n");
							System.out.println("1 - Sim         2 - Não");
							int conf = ler.nextInt();
						
							if (conf == 1) {
								
								System.out.println("Digite o índice que deseja excluir: ");
								int i = ler.nextInt();
								barcos.remove(i);
							
							}
							else if (conf == 2) {
							
								System.out.println("\nVV Retornando ao Menu VV\n");
							
							}
							else {
							
								System.out.println("\n!! Opção Inválida !!\n");
							
							}
						break;
						case 5:
							System.out.println("X Sistema encerrado X");
							System.exit(0);
						default:
							System.out.println("!! Opção inválida !!");
						break;
					
					}
				break;
					
				case 2:
					
					switch (mP.menuInterno()) {
					
					case 1:
						//c.inserirC();
					break;
					case 2:
						//c.imprimirC();
					break;
					case 3:
						//c.alterarC();
					break;
					case 4:
						//c.excluirC();
					break;
					case 5:
						System.out.println("X Sistema encerrado X");
						System.exit(0);
					default:
						System.out.println("!! Opção inválida !!");
					break;
					
					}
				break;
					
				case 3:
					
					switch (mP.menuInterno()) {
					
					case 1:
						//m.inserirM();
					break;
					case 2:
						//m.imprimirM();
					break;
					case 3:
						//m.alterarM();
					break;
					case 4:
						//m.excluirM();
					break;
					case 5:
						System.out.println("X Sistema encerrado X");
						System.exit(0);
					default:
						System.out.println("!! Opção inválida !!");
					break;
					
					}
				break;	
					
				case 4:
					System.out.println("X Sistema encerrado X");
					System.exit(0);
				break;
				
				default:
					System.out.println("!! Opção inválida !!");
				break;
			
			}
				
		} while (mP.menuPrincipal() != 4);

	}

}
