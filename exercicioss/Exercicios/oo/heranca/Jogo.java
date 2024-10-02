package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.andar("direita");
		Jogador j2 = new Jogador();
		j2.atacar(j1);

		j1.atacar(j2);

		System.out.println(j1.x = 10);
		System.out.println(j1.y = 11);
		System.out.println("-------------------");
		System.out.println(j2.x = 11);
		System.out.println(j2.y = 10);
		System.out.println("-------------------");

		System.out.println("Vida " + j1.vida);
		System.out.println("Vida " + j2.vida);
	}

}
