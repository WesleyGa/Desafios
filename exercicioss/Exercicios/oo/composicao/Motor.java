package oo.composicao;

public class Motor {
// um motor tem um carro
	final Carro carro;

	
	Motor(Carro carro) { // um motor tem um carrro
		this.carro = carro;
	}

	boolean ligado = false;
	double fatorInjecao = 1;

	// rotações por minutos
	int rpm() {

		if (!ligado) { // se nao estiver ligado
			return 0;
		} else if (ligado && carro.portaFechada) { // se estiver ligado
			return (int) Math.round(fatorInjecao * 3000);
		} else {
			return 00;
		}
	}

}
