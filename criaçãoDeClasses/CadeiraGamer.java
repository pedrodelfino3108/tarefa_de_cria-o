package criaçãoDeClasses;

public class CadeiraGamer {
	private String marca;
	private String modelo;
	private String cor;
	private int assentos;
	private boolean apoioLombar;
	private double preco;

	public CadeiraGamer(String marca, String modelo, String cor, int assentos, boolean apoioLombar, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.assentos = assentos;
		this.apoioLombar = apoioLombar;
		this.preco = preco;
	}

	public void exibirAtributos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Número de Assentos: " + assentos);
		System.out.println("Possui Apoio Lombar: " + (apoioLombar ? "Sim" : "Não"));
		System.out.println("Preço: R$" + preco);
	}

	public static void main(String[] args) {
		CadeiraGamer minhaCadeira = new CadeiraGamer("DXRacer", "Racing Series", "Preto/Vermelho", 1, true, 1500.00);
		minhaCadeira.exibirAtributos();
	}

}
