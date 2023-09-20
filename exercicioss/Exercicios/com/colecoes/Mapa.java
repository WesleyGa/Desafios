package com.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Wesley");
		usuarios.put(2, "Roberto");
		usuarios.put(3, "Giovane");
		usuarios.put(4, "Roberta");
		


		for(Integer chave : usuarios.keySet() ) {
			System.out.println(chave);
		}
		
		for(String chave2 : usuarios.values()) {
			System.out.println(chave2);
		}
		for( Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println("Chave : " + registro.getKey() + ", Nome : " + registro.getValue());
			System.out.println("---------------");
			
		}
	}

}
