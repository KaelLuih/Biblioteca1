package com.appBiblioteca.Model;


public class Livro {

	
	private String nome;
	private int quantidade;
	private double PrecoAlugel;
	private String Autor;	


public Livro() {
	this.Autor="";
	this.nome="";
	this.PrecoAlugel=0.0;
	this.quantidade= 0;
}

public Livro(String nome, int quantidade , double PrecoAlugel , String Autor   ) {
	this.Autor=Autor;
	this.nome=nome;
	this.quantidade=quantidade;
	this.PrecoAlugel=PrecoAlugel;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {this.nome = nome;}

public int getQuantidade() {return quantidade;}

public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

public double getPrecoAlugel() {return PrecoAlugel;}

public void setPrecoAlugel(double precoAlugel) {PrecoAlugel = precoAlugel;}

public String getAutor() {return Autor;}

public void setAutor(String autor) {Autor = autor;}
}

