package TiposVeiculos;

public abstract class Veiculo {

	private static String nome;
	private static String marca;
	private static String cor;
	private static String placa;
	private static int numP;
	private static int numR;
	//private int i;
	private static String proprietario;
	
	public Veiculo() {
		
		Veiculo.nome = "";
		Veiculo.marca = "";
		Veiculo.cor = "";
		Veiculo.placa = "";
		Veiculo.numP = 0;
		Veiculo.numR = 0;
		Veiculo.proprietario = "";
		
	}
	
	public static String getNome () {
		return nome;
		
	}
	
	public static void setNome (String nome) {
		
		Veiculo.nome = nome;
		
	}
	
	public static String getMarca () {
		
		return marca;
		
	}
	
	public static void setMarca (String marca) {
		
		Veiculo.marca = marca;
		
	}
	
	public static String getCor () {
		
		return cor;
		
	}
	
	public static void setCor (String cor) {
		
		Veiculo.cor = cor;
		
	}
	
	public static String getPlaca() {
		return placa;
	}

	public static void setPlaca(String placa) {
		Veiculo.placa = placa;
	}

	public static int getNumP() {
		return numP;
	}

	public static void setNumP(int numP) {
		Veiculo.numP = numP;
	}

	public static int getNumR() {
		return numR;
	}

	public static void setNumR(int numR) {
		Veiculo.numR = numR;
	}
	
	/*public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}*/
	
	public static String getProprietario () {
		
		return proprietario;
		
	}
	
	public static void setProprietario (String proprietario) {
		
		Veiculo.proprietario = proprietario;
		
	}

}