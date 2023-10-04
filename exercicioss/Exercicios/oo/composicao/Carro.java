package oo.composicao;

public class Carro {

	final Motor motor;
	
	boolean portaFechada = false;

	/*
	 * Nesse caso, essa parte new Motor(this), literalmente está sendo passado como
	 * parâmetro para motor this, que nada mais seria que a classe atual, ou seja,
	 * um carro.
	 */

	Carro() {
		this.motor = new Motor(this);
	}

	// metedo para acelerar o carro
	void acelerar() {
		motor.fatorInjecao += 0.4;

	}

	// frear
	void frear() {
		if (motor.fatorInjecao > 0.4) {
			motor.fatorInjecao -= 0.4;
		}
	}

	// ligar
	void ligar() {
		motor.ligado = true;
	}
	
	void fecharPorta() {
		portaFechada = true;
	}
	
	boolean portaAbertaa() {
		
		if (portaFechada) {
		return motor.ligado = false;
		}
		return motor.ligado = true;
		
	}
	
	
	
	

	// desligar
	void desligar() {
		motor.ligado = false;
	}

	// vereficar se esta ligado
	boolean estaLigadp() {
		return motor.ligado;
	}
}
