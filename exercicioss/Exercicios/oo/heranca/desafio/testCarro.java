package oo.heranca.desafio;

public class testCarro {
	public static void main(String[] args) {
		Uno uno1 = new Uno();
		uno1.acelerar();
		uno1.acelerar();
		uno1.acelerar();
		uno1.frear();
		uno1.frear();
		uno1.frear();
		
		System.out.println(uno1.velocidadeAtual);
		
		Polo polo1 = new Polo();
		polo1.acelerar();
		polo1.acelerar();
		polo1.acelerar();
		System.out.println(polo1.velocidadeAtual);
		polo1.frear();
		polo1.frear();
		polo1.frear();
		polo1.frear();
		polo1.frear();
		polo1.frear();
		polo1.frear();
		polo1.acelerar();

		System.out.println(polo1.velocidadeAtual);
		
	}
}
