package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	int delta = 5;
	int freio = 5;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {

		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			// apenas para garantir que não passará da velocidade máxima.
			velocidadeAtual += delta;
		}

	}

	void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= freio;
		} else
			velocidadeAtual = 0;

	}

}
