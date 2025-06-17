package com.appBiblioteca.view;


import java.util.*;
import com.appBiblioteca.Model.Livro;
import com.appBiblioteca.Service.Biblioteca;
public class Atendente {

	Scanner input;
	Livro livros = new Livro();
	public Atendente(){
		input = new Scanner(System.in);
			
	}
	
	public int MenuDeEscolha() {
		System.out.println("╔═══════════════════════════════════════════════╗");
		System.out.println("║           BEM-VINDO À BIBLIOTECA              ║");
		System.out.println("║                Led Zeppelin                   ║");
		System.out.println("╠═══════════════════════════════════════════════╣");
		System.out.println("║   O que você deseja fazer?                    ║");
		System.out.println("║                                               ║");
		System.out.println("║   1 ▸ Cadastrar um novo livro                 ║");
		System.out.println("║   2 ▸ Listar todos os livros                  ║");
		System.out.println("║   3 ▸ Deletar um livro                        ║");
		System.out.println("║   4 ▸ Pesquisar um livro                      ║");
		System.out.println("║   5 ▸ Editar um livro                      ║");
		System.out.println("╚═══════════════════════════════════════════════╝");
		System.out.print ("→ Digite a opção desejada: ");

	int EscolhaDoMenu=input.nextInt();
	input.nextLine();
	return EscolhaDoMenu;
	 
	
	}
	public String CadastrarAutor() {
		System.out.println("Digite o nome do autor");
		String Autor = input.nextLine();
		return Autor;
	}
	public String CadastrarTitulo() {
		System.out.println("Digite o titulo do livro");
		String nome = input.nextLine();
		return nome;
	}
	public int CadastrarQuantidade()	{
		System.out.println("Digite a quantidade de livros disponiveis");
		int Quantidade = input.nextInt();
		return Quantidade;
	}
	public Double CadastraPreço() {
		System.out.println("Digite o preço de compra do livro");
		double Preco = input.nextDouble();
		return Preco;
	}
	public void ListarLivros(List<Livro> livros) {
		for(Livro liv: livros) {
		System.out.println("--------------------");
		System.out.println("Aqui estao os livros Cadastrados");
		System.out.println("Autor:" + liv.getAutor());
		System.out.println("Titulo:" + liv.getNome());
		System.out.println("Quantidade:" + liv.getQuantidade());
		System.out.println("Preço do Aluguel:"+ liv.getPrecoAlugel());
		System.out.println("--------------------");
		}
	}
	
	public String RemoverLivro() {
		System.out.println("Digite qual Livro voce deseja excluir");
		return input.nextLine();
	}
	
	public String PesquisarLivros() {
		System.out.println("Digite o Titulo do livro ");
		return input.nextLine();
	}
	public String EditarLivro() {
		System.out.println("Digite qual livro deseja editar");
		 return input.nextLine();
	}
	

	
	

	
	
}
