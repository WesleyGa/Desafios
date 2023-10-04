package oo.composicao.carro;

public class CarroTeste {
	public static void main(String[] args) {

		Carro c = new Carro();
		
		c.fecharPorta();
		c.ligar();
	
		c.acelerar();
		c.acelerar();
		System.out.println(c.motor.rpm());
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		System.out.println(c.motor.rpm());

		System.out.println(c.estaLigadp());
        System.out.println(c.motor.fatorInjecao);
	}

}
