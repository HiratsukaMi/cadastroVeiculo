package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TiposVeiculos.Barco;
import TiposVeiculos.Carro;
import TiposVeiculos.Moto;

public class Principal {

	private static Scanner ler;

	public static void main(String[] args) {
		
		List<Barco> barcos = new ArrayList<Barco>();
		List<Carro> carros = new ArrayList<Carro>();
		List<Moto> motos = new ArrayList<Moto>();
		Menu mP = new Menu();
		ler = new Scanner(System.in);
		int t;
		int conf;
		int i;
			
		do {
				
			switch (mP.menuPrincipal()) {
			
				case 1:
					
					switch (mP.menuInterno()) {
					
						case 1:
							System.out.println("=====================================================");
							System.out.println("Digite a quantidade de barcos que deseja inserir: ");
							t = ler.nextInt();
							for(i = 0; i < t; i++) {
								
								Barco b = new Barco();
								b.inserirB();
								barcos.add(b);
								System.out.println("=====================================================");
								
							}
						break;
						case 2:
							t = barcos.size();
							for(i = 0; i < t; i++) {
								
								barcos.get(i).imprimirB();
								
							}
						break;
						case 3:
							System.out.println("=====================================================");
							System.out.println("Deseja excluir os dados?\n");
							System.out.println("1 - Sim         2 - Não");
							conf = ler.nextInt();
						
							if (conf == 1) {
								
								System.out.println("Deseja excluir toda a lista?");
								System.out.println("1 - Sim         2 - Não");
								conf = ler.nextInt();
								
								if (conf == 1) {
									
									barcos.clear();
									System.out.println("!! Lista excluída com sucesso !!\n");
									System.out.println("=====================================================");
									
								}
								
								else {
									
									System.out.println("Digite o índice que deseja excluir: ");
									i= ler.nextInt();
									barcos.remove(i);
									System.out.println("!! Item excluído com sucesso !!\n");
									System.out.println("=====================================================");
									
								}
							
							}
							else if (conf == 2) {
							
								System.out.println("\nVV Retornando ao Menu VV\n");
								System.out.println("=====================================================");
							
							}
							else {
							
								System.out.println("\n!! Opção Inválida !!\n");
								System.out.println("=====================================================");
							
							}
						break;
						case 4:
							System.out.println("=====================================================");
							System.out.println("X Sistema encerrado X");
							System.exit(0);
						default:
							System.out.println("\n!! Opção inválida !!\n");
							System.out.println("=====================================================");
						break;
					
					}
				break;
					
				case 2:
					
					switch (mP.menuInterno()) {
					
					case 1:
						System.out.println("=====================================================");
						System.out.println("Digite a quantidade de carros que deseja inserir: ");
						t = ler.nextInt();
						for(i = 0; i < t; i++) {
							
							Carro c = new Carro();
							c.inserirC();
							carros.add(c);
							System.out.println("=====================================================");
						}
					break;
					case 2:
						t = carros.size();
						for(i = 0; i < t; i++) {
							
							carros.get(i).imprimirC();
							
						}
					break;
					case 3:
						System.out.println("=====================================================");
						System.out.println("Deseja excluir os dados?\n");
						System.out.println("1 - Sim         2 - Não");
						conf = ler.nextInt();
					
						if (conf == 1) {
							
							if (conf == 1) {
								
								System.out.println("\nDeseja excluir toda a lista?");
								System.out.println("1 - Sim         2 - Não");
								conf = ler.nextInt();
								
								if (conf == 1) {
									
									carros.clear();
									System.out.println("!! Lista excluída com sucesso !!\n");
									System.out.println("=====================================================");
									
								}
								
								else {
									
									System.out.println("\nDigite o índice que deseja excluir: ");
									i= ler.nextInt();
									carros.remove(i);
									System.out.println("!! Item excluído com sucesso !!\n");
									System.out.println("=====================================================");
									
								}
								
							}
								
						}
						else if (conf == 2) {
						
							System.out.println("\nVV Retornando ao Menu VV\n");
							System.out.println("=====================================================");
						
						}
						else {
						
							System.out.println("\n!! Opção Inválida !!\n");
							System.out.println("=====================================================");
						
						}
					break;
					case 4:
						System.out.println("=====================================================");
						System.out.println("\nX Sistema encerrado X");
						System.exit(0);
					default:
						System.out.println("\n!! Opção inválida !!\n");
						System.out.println("=====================================================");
					break;
					
					}
				break;
					
				case 3:
					
					switch (mP.menuInterno()) {
					
					case 1:
						System.out.println("=====================================================");
						System.out.println("\nDigite a quantidade de motos que deseja inserir: ");
						t = ler.nextInt();
						for(i = 0; i < t; i++) {
							
							Moto m = new Moto();
							m.inserirM();
							motos.add(m);
							System.out.println("=====================================================");
							
						}
					break;
					case 2:
						t = motos.size();
						for(i = 0; i < t; i++) {
							
							motos.get(i).imprimirM();
							
						}
					break;
					case 3:
						System.out.println("=====================================================");
						System.out.println("\nDeseja excluir os dados?\n");
						System.out.println("1 - Sim         2 - Não");
						conf = ler.nextInt();
					
						if (conf == 1) {
							
							if (conf == 1) {
								
								motos.clear();
								System.out.println("!! Lista excluída com sucesso !!\n");
								System.out.println("=====================================================");
								
							}
							
							else {
								
								System.out.println("\nDigite o índice que deseja excluir: ");
								i= ler.nextInt();
								motos.remove(i);
								System.out.println("!! Item excluído com sucesso !!\n");
								System.out.println("=====================================================");
								
							}
						
						}
						else if (conf == 2) {
						
							System.out.println("\nVV Retornando ao Menu VV\n");
							System.out.println("=====================================================");
						
						}
						else {
						
							System.out.println("\n!! Opção Inválida !!\n");
							System.out.println("=====================================================");
						
						}
					break;
					case 4:
						System.out.println("=====================================================");
						System.out.println("X Sistema encerrado X");
						System.exit(0);
					default:
						System.out.println("!! Opção inválida !!\n");
						System.out.println("=====================================================");
					break;
					
					}
				break;	
					
				case 4:
					System.out.println("=====================================================");
					System.out.println("\nX Sistema encerrado X");
					System.exit(0);
				break;
				
				default:
					System.out.println("\n!! Opção inválida !!\n");
					System.out.println("=====================================================");
				break;
			
			}
				
		} while (mP.getOp() != 4);

	}

}