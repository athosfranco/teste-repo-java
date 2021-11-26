//Esse pacote foi criado para estudar as pr�ticas relacionadas aos modificadores de acesso PUBLIC e PRIVATE e a sua utilidade.
package calculo.de.massa;

public class Corpo {
	// As vari�veis "massa" e "volume" tem seu acesso definido como PRIVATE para
	// impedir que uma delas possa ser modificada individualmente. Isto poque a
	// densidade muda quando um dos 2 muda.
	private double massa;
	private double volume;
	private double densidade;

	// Aqui � definido um construtor para que quando a classe for usada para criar
	// uma instancia de massa, j� seja definido a massa e o volume como par�metros e
	// a densidade calculada automaticamente.
	public Corpo(double massaParam, double volumeParam) {
		this.massa = massaParam;
		this.volume = volumeParam;
		
		this.densidade = massaParam / volumeParam;
		
	}

	/* Dessa forma, n�o � poss�vel, por exemplo, fazer isso:
	 instanciaDeCorpoQualquer.massa = 75.10;
	 Pois o acesso � massa de forma �nica � proibido pois o acesso � vari�vel � private;
	 
	 */
	
}
