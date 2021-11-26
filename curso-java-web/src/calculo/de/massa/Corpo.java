//Esse pacote foi criado para estudar as práticas relacionadas aos modificadores de acesso PUBLIC e PRIVATE e a sua utilidade.
package calculo.de.massa;

public class Corpo {
	// As variáveis "massa" e "volume" tem seu acesso definido como PRIVATE para
	// impedir que uma delas possa ser modificada individualmente. Isto poque a
	// densidade muda quando um dos 2 muda.
	private double massa;
	private double volume;
	private double densidade;

	// Aqui é definido um construtor para que quando a classe for usada para criar
	// uma instancia de massa, já seja definido a massa e o volume como parâmetros e
	// a densidade calculada automaticamente.
	public Corpo(double massa, double volume) {
		this.massa = massa;
		this.volume = volume;

		this.densidade = massa / volume;

	}

	/*
	 * Dessa forma, não é possível, por exemplo, fazer isso:
	 * instanciaDeCorpoQualquer.massa = 75.10; Pois o acesso à massa de forma única
	 * é proibido pois o acesso à variável é private.
	 * 
	 * Ao criar a instância com o construtor, vc dá a massa e o volume. A densidade
	 * é calculada automaticamente e impedida de ser modificada.
	 * 
	 * Aí métodos podem ser utilizados para modificar a massa e/ou o volume, para
	 * então ter a densidade recalculada.
	 */

	public void modificarMassa(double novaMassa) {
		this.massa = novaMassa;
		this.densidade = novaMassa / volume;

	}

	public void modificarVolume(double novoVolume) {
		this.volume = novoVolume;
		this.densidade = massa / novoVolume;

	}

	public void modificarMassaVolume(double novaMassa, double novoVolume) {
		this.massa = novaMassa;
		this.volume = novoVolume;
		this.densidade = novaMassa / novoVolume;
	}

	// O problema é que, como os atributos de Corpo estão todos privados, não temos
	// como "ler" esses atributos em nenhum outro lugar. Pra resolver isso,
	// definimos:

	// Métodos públicos que retornam os valores desejados (getters)
	public double lerMassa() {
		return massa;
	}

	public double lerVolume() {
		return volume;
	}

	public double lerDensidade() {
		return densidade;
	}

	public String lerCorpo() {
		return "Este corpo possui " + massa + " de massa e " + volume + " de volume. Sua densidade é: " + densidade;		
	}
}
