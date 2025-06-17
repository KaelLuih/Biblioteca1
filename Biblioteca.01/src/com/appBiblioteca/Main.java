package com.appBiblioteca;


import com.appBiblioteca.view.*;
import com.appBiblioteca.Service.*;
import com.appBiblioteca.Model.*;
public class Main {

	public static void main(String[] args) {
	Atendente atendente= new Atendente();
	Biblioteca biblioteca = new Biblioteca();
	Livro livro = new Livro();
	
	
	while(true) {
		int EscolhaDoMenu = atendente.MenuDeEscolha();
		
		
		biblioteca.GerenciarLivros(EscolhaDoMenu, atendente, livro);
	}
	}

}
