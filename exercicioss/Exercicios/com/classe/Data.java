package com.classe;

public class Data {
// data padrão
	int dia = 1;
	int mes = 1;
	int ano = 1970;

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	Data() {

	}

	String obterDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}

}
