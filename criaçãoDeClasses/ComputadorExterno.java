package criaçãoDeClasses;

public class ComputadorExterno {
	private String marca;
	private String modelo;
	private String processador;
	private int memoriaRAM;
	private int armazenamento;
	private String sistemaOperacional;

	public ComputadorExterno(String marca, String modelo, String processador, int memoriaRAM, int armazenamento,
			String sistemaOperacional) {
		this.marca = marca;
		this.modelo = modelo;
		this.processador = processador;
		this.memoriaRAM = memoriaRAM;
		this.armazenamento = armazenamento;
		this.sistemaOperacional = sistemaOperacional;
	}

	public void exibirAtributos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Processador: " + processador);
		System.out.println("Memória RAM: " + memoriaRAM + "GB");
		System.out.println("Armazenamento: " + armazenamento + "GB");
		System.out.println("Sistema Operacional: " + sistemaOperacional);
	}

	public static void main(String[] args) {
		ComputadorExterno meuComputador = new ComputadorExterno("Dell", "Inspiron 15", "Intel Core i5", 8, 512,
				"Windows 10");

		meuComputador.exibirAtributos();
	}
}
