package TiposVeiculos;

import java.util.Scanner;

public abstract class Veiculo {

	private String nome;
	private String marca;
	private String cor;
	private String placa;
	private String proprietario;
	
	public Veiculo() {
		
		
		this.nome = "";
		this.marca = "";
		this.cor = "";
		this.placa = "";
		this.proprietario = "";
		
	}
	
	static Scanner ler = new Scanner(System.in);
	
	public String getNome () {
		return nome;
		
	}
	
	public void setNome (String nome) {
		
		this.nome = nome;
		
	}
	
	public String getMarca () {
		
		return marca;
		
	}
	
	public void setMarca (String marca) {
		
		this.marca = marca;
		
	}
	
	public String getCor () {
		
		return cor;
		
	}
	
	public void setCor (String cor) {
		
		this.cor = cor;
		
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getProprietario () {
		
		return proprietario;
		
	}
	
	public void setProprietario (String proprietario) {
		
		this.proprietario = proprietario;
		
	}
	
	public void inserirV() {
		
		System.out.println ("\nDigite o nome do carro:");
		setNome(ler.nextLine());
		
		System.out.println ("Digite a marca do carro: ");
		setMarca(ler.nextLine());
		
		System.out.println ("Digite a cor do carro: ");
		setCor(ler.nextLine());
		
		System.out.println ("Digite a placa do carro: ");
		setPlaca(ler.nextLine());
		
		System.out.println ("Digite o nome do proprietário: ");
		setProprietario(ler.nextLine() + "\n");
		
	}
	
	public void imprimirV() {
		
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Cor: " + getCor());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Proprietário: " + getProprietario() + "\n");
		
	}

}