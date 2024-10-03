package oo.heranca;

public class Jogador {
	int escudo = 50;
	int vida = 100;
	int x;
	int y;
	
	Jogador(){
		this (0,0);
	}
	
	Jogador(int x, int y	){
		this.x = x;
		this.y = y;
	}

	boolean andar(Direcao direcao) {
		if (direcao == Direcao.LESTE && x <= 99) {
			x++;
		}
		if (direcao == Direcao.OESTE && x >= 1) {
			x--;
		}
		if (direcao == Direcao.NORTE && y >= 1) {
			y--;
		}
		if (direcao == Direcao.SUL && y <= 99) {
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
