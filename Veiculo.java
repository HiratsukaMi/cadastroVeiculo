package TiposVeiculos;

public abstract class Veiculo {

	private String nome;
	private String marca;
	private String cor;
	private String placa;
	private int numP;
	private int numR;
	//private int i;
	private String proprietario;
	
	public Veiculo() {
		
		
		this.nome = "";
		this.marca = "";
		this.cor = "";
		this.placa = "";
		this.numP = 0;
		this.numR = 0;
		this.proprietario = "";
		
	}
	
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

	public int getNumP() {
		return numP;
	}

	public void setNumP(int numP) {
		this.numP = numP;
	}

	public int getNumR() {
		return numR;
	}

	public void setNumR(int numR) {
		this.numR = numR;
	}
	
	/*public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}*/
	
	public String getProprietario () {
		
		return proprietario;
		
	}
	
	public void setProprietario (String proprietario) {
		
		this.proprietario = proprietario;
		
	}

}