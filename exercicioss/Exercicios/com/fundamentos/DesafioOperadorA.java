package com.fundamentos;

public class DesafioOperadorA {
	public static void main(String[] args) {
		// Desafio proposto pelo professor do meu curso na academy

//         ( [6 * ( 3 + 2) ]²      -    (( 1 - 5 ) * ( 2 - 7) ) ²  )³
//      ___________________________________________________________
//                                10³                        		

		// Minha resolução

		double a = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double b = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double c = Math.pow(a - b, 3);
		double e = Math.pow(10, 3);
		double d = (c / e);

		System.out.println(a);
		System.out.println(b);
		System.out.println(d);

	}

}
