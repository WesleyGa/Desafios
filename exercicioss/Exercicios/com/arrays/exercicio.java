package com.arrays;


import java.util.Arrays;

public class exercicio {

	public static void main(String[] args) {
		
		double[] notaAlunoA = new double[3];
		notaAlunoA[0] = 10;
		notaAlunoA[1] = 10;
		notaAlunoA[2] = 8;
		
	  System.out.println(Arrays.toString(notaAlunoA));	
	  
	  double total = 0;
	  for (int  i = 0 ; i < notaAlunoA.length; i++) {
		  total += notaAlunoA[i];
		 
	  }
	  
	  System.out.println(total / notaAlunoA.length);
	}
}
