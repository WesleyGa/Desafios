package oo.heranca.desafio;

public class Polo extends Carro {

	Polo() {
		super(200);
	}

	@Override
	void acelerar() {
		delta = 20;
		if (velocidadeAtual < VELOCIDADE_MAXIMA) {
			velocidadeAtual += delta;
		} else {
			// apenas para garantir que não passará da velocidade máxima.
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}

	}

	@Override
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 15;
		} else {
			velocidadeAtual = 0;
		}
	}
}
