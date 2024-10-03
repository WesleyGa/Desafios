package oo.heranca.desafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	protected int delta = 5;
	protected int freio = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {

		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			// apenas para garantir que não passará da velocidade máxima.
			velocidadeAtual += delta;
		}

	}

	public void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= freio;
		} else
			velocidadeAtual = 0;

	}

}
