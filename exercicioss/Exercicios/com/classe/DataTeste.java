package com.classe;

public class DataTeste {
	public static void main(String[] args) {

		Data data1 = new Data();

		Data data2 = new Data(18, 02, 2002);

		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
	}

}
