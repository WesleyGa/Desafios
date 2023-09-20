package com.classe;

public class DataTeste {
	public static void main(String[] args) {

		Data data1 = new Data();
		data1.dia = 10;
		data1.mes = 9;
		data1.ano = 2020;

		Data data2 = new Data();
		data2.dia = 12;
		data2.mes = 10;
		data2.ano = 2021;
		
		System.out.println(data1.obterDataFormatada());

	}
	
	

}
