package criaçãoDeClasses;

public class Computador {
	private String processador;
	private int RAM;
	private int GB;
	private String armazenamento;
	private String sistemaOperacional;
	private boolean placaDeVideo;

	public Computador(String processador, int RAM, int GB, String armazenamento,
			String sistemaOperacional, boolean placaDeVideo) {
		this.processador = processador;
		this.RAM = RAM;
		this.GB = GB;
		this.armazenamento = armazenamento;
		this.sistemaOperacional = sistemaOperacional;
		this.placaDeVideo = placaDeVideo;
	}

	public void exibirEspecificacoes() {
		System.out.println("Processador: " + processador);
		System.out.println("Memória RAM: " + RAM + "GB");
		System.out.println("Capacidade de Armazenamento: " + armazenamento + "GB");
		System.out.println("Tipo de Armazenamento: " + armazenamento);
		System.out.println("Sistema Operacional: " + sistemaOperacional);
		System.out.println("Placa de Vídeo Dedicada: " + (placaDeVideo ? "Sim" : "Não"));
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getMemoriaRAM() {
		return RAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.RAM = memoriaRAM;
	}

	public int getCapacidadeArmazenamento() {
		return GB;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.GB = GB;
	}

	public String getTipoArmazenamento() {
		return armazenamento;
	}

	public void setTipoArmazenamento(String tipoArmazenamento) {
		this.armazenamento = tipoArmazenamento;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public boolean isTemPlacaVideoDedicada() {
		return placaDeVideo;
	}

	public void setTemPlacaVideoDedicada(boolean temPlacaVideoDedicada) {
		this.placaDeVideo = temPlacaVideoDedicada;
	}

	public static void main(String[] args) {
		Computador meuComputador = new Computador("Intel i7 11700K", 32, 1000, "SSD", "Windows 11", true);
		meuComputador.exibirEspecificacoes();
	}
}