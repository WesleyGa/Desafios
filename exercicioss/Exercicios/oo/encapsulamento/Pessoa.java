package oo.encapsulamento;

public class Pessoa {
	private int idade;

	// Getters/Setters
	
	public Pessoa(int idade) {
		setIdade(idade);
	}


	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}
	}
	public int getIdade() {
		return idade;
	}

}
