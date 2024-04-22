package criaçãoDeClasses;

public class Celular1 {
	private String marca;
	private String modelo;
	private int armazenamento;
	private double tela;
	private int camera;
	private String sistema_operacional;

	public Celular1(String marca, String modelo, int armazenamento, double tela, int camera,
			String sistema_operacional) {
		this.marca = marca;
		this.modelo = modelo;
		this.armazenamento = armazenamento;
		this.tela = tela;
		this.camera = camera;
		this.sistema_operacional = sistema_operacional;
	}

	public void exibir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Capacidade de armazenamento: " + armazenamento + "GB");
		System.out.println("Tamanho da Tela: " + tela + " polegadas");
		System.out.println("Resolução da Câmera: " + camera + "MP");
		System.out.println("Sistema Operacional: " + sistema_operacional);

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeArmazenamento() {
		return armazenamento;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.armazenamento = capacidadeArmazenamento;
	}

	public double getTamanhoTela() {
		return tela;
	}

	public void setTamanhoTela(double tamanhoTela) {
		this.tela = tamanhoTela;
	}

	public int getResolucaoCamera() {
		return camera;
	}

	public void setResolucaoCamera(int resolucaoCamera) {
		this.camera = resolucaoCamera;
	}

	public String getSistemaOperacional() {
		return sistema_operacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistema_operacional = sistemaOperacional;
	}

	public static void main(String[] args) {
		Celular1 meuCelular = new Celular1("Apple", "iPhone 13", 128, 6.1, 12, "iOS");
		meuCelular.exibir();
	}
}
