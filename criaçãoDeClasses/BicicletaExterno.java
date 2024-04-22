package criaçãoDeClasses;

public class BicicletaExterno {
	private String marca;
	private String modelo;
	private String cor;
	private int marchas;
	private boolean freio_de_disco;
	private double preco;

	public BicicletaExterno(String marca, String modelo, String cor, int marchas, boolean freio_de_disco, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marchas = marchas;
		this.freio_de_disco = freio_de_disco;
		this.preco = preco;
	}

	public void exibirAtributos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Número de Marchas: " + marchas);
		System.out.println("Possui Freio a Disco: " + (freio_de_disco ? "Sim" : "Não"));
		System.out.println("Preço: R$" + preco);
	}

	public static void main(String[] args) {
		BicicletaExterno minhaBicicleta = new BicicletaExterno("Caloi", "Elite Carbon", "Preto", 18, true, 2500.00);

		minhaBicicleta.exibirAtributos();
	}
}
