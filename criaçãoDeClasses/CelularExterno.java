package criaçãoDeClasses;

public class CelularExterno {
	private String marca;
	private String modelo;
	private String cor;
	private String sistemaOperacional;
	private String armazenamento;
	private String bateria;

	public CelularExterno(String marca, String modelo, String cor, String sistemaOperacional, String armazenamento,
			String bateria) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.sistemaOperacional = sistemaOperacional;
		this.armazenamento = armazenamento;
		this.bateria = bateria;
	}

	public void exibirAtributos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Sistema Operacional: " + sistemaOperacional);
		System.out.println("Armazenamento: " + armazenamento);
		System.out.println("Bateria: " + bateria);
	}

	public static void main(String[] args) {

		CelularExterno meuCelular = new CelularExterno("Samsung", "Galaxy S20", "Preto", "Android", "128GB", "4000mAh");

		meuCelular.exibirAtributos();
	}
}
