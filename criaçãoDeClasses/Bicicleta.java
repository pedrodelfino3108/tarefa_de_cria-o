package criaçãoDeClasses;

public class Bicicleta {
	public class Bike {
		private String marca;
		private String modelo;
		private String cor;
		private int numMarchas;
		private boolean freioDeDisco;
		private double preco;

		public Bike(String marca, String modelo, String cor, int numMarchas, boolean freioDeDisco, double preco) {
			this.marca = marca;
			this.modelo = modelo;
			this.cor = cor;
			this.numMarchas = numMarchas;
			this.freioDeDisco = freioDeDisco;
			this.preco = preco;
		}

		public void exibirAtributos() {
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
			System.out.println("Cor: " + cor);
			System.out.println("Número de Marchas: " + numMarchas);
			System.out.println("Possui Freio a Disco: " + (freioDeDisco ? "Sim" : "Não"));
			System.out.println("Preço: R$" + preco);
		}
	}

	public static void main(String[] args) {
		Bicicleta.Bike minhaBicicleta = new Bicicleta().new Bike("Caloi", "Elite Carbon", "Preto", 18, true, 2500.00);
		minhaBicicleta.exibirAtributos();
	}
}
