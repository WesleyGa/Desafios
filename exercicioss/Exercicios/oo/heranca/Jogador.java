package oo.heranca;

public class Jogador {
	int escudo = 50;
	int vida = 100;
	int x;
	int y;

	boolean andar(String direcao) {
		if ("direita".equalsIgnoreCase(direcao) && x <= 99) {
			x++;
		}
		if ("esquerda".equalsIgnoreCase(direcao) && x >= 1) {
			x--;
		}
		if ("cima".equalsIgnoreCase(direcao) && y >= 1) {
			y--;
		}
		if ("baixo".equalsIgnoreCase(direcao) && y <= 99) {
			y++;
		}
		return false;
	}

	boolean atacar(Jogador oponente) {
		int deltaX = x - oponente.x;

		int deltaY = y - oponente.y;

		if (deltaX == 1 && deltaY == 0 || deltaX == -1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 0 && deltaY == 1 || deltaX == 0 && deltaY == -1) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}

}
