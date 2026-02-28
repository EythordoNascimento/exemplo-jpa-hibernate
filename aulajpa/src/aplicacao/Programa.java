package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	  
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Matias Jose", "matias@gmail.com");
		Pessoa p3 = new Pessoa(3, "thor Silva", "thor@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
