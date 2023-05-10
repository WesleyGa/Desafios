package com.exercicios;

public class DesafioOperadorA {
	public static void main(String[] args) {
		// Desafio proposto pelo professor do meu curso na academy

//         ( [6 * ( 3 + 2) ]²      -    (( 1 - 5 ) * ( 2 - 7) ) ²  )³
//      ___________________________________________________________
//                                10³                        		

		// Minha resolução

		int a = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		int b = (int) Math.pow((1 - 5) * (2 - 7) / 2, 2);
		int c = (int) Math.pow(a - b, 3);
		int e = (int) Math.pow(10, 3);
		int d = (int) (c / e);

		System.out.println(a);
		System.out.println(b);
		System.out.println(d);

	}

}
