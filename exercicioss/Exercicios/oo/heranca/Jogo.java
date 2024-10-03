package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Monstro j1 = new Monstro();

		Heroi j2 = new Heroi();

		j1.x = 10;
		j1.y = 11;

		j2.x = 10;
		j2.y = 12;

		j2.atacar(j1);
		j1.atacar(j2);

		System.out.println("Vida " + j1.vida);
		System.out.println("Vida " + j2.vida);
	}

}
