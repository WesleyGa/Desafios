package oo.heranca;

public class Heroi extends Jogador {

	public boolean atacar(Jogador oponente) {

		int deltaX = x - oponente.x;

		int deltaY = y - oponente.y;

		if (deltaX == 1 && deltaY == 0 || deltaX == -1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		} else if (deltaX == 0 && deltaY == 1 || deltaX == 0 && deltaY == -1) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}
	}
}
