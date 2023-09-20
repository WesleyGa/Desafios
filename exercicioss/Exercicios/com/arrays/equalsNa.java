package com.arrays;

import java.util.Date;

public class equalsNa {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.email = "wes@gmail";
		u1.nome = "Wesley";

		Usuario u2 = new Usuario();
		u2.email = "wes@gmail";
		u2.nome = "Wesley";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		System.out.println(u2.equals(new Date()));

	}
}
