package com.colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
	
	
     ArrayList<Usuario> lista = new ArrayList<>();
     
     Usuario u1 = new Usuario("ANA");
      lista.add(u1);
      lista.add(new Usuario("JOse")); 
      lista.add(new Usuario("dr")); 
      lista.add(new Usuario("ksl")); 
      lista.add(new Usuario("wesley")); 
      
      System.out.println(lista.get(3));
      lista.remove(3);
      lista.remove(new Usuario("wesley"));
      
      for(Usuario u : lista) {
    	  System.out.println(u);
      }
}
}