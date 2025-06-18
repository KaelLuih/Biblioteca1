package com.appBiblioteca.Service;

import java.util.*;
import com.appBiblioteca.Model.Livro;
import com.appBiblioteca.view.Atendente;

public class Biblioteca {

	Scanner input = new Scanner(System.in);
	List<Livro> livros;

	public Biblioteca() {
		livros = new ArrayList<>();
	}

	public void GerenciarLivros(int EscolhaDoMenu , Atendente atendente, Livro LivroCadastro) {
		switch(EscolhaDoMenu) {

			case 1:
				String autor = atendente.CadastrarAutor();
				String nome = atendente.CadastrarTitulo();
				int quantidade = atendente.CadastrarQuantidade();
				double preco = atendente.CadastraPreço();	
				boolean Emprestimo=atendente.CadastrarEmprestimo();

				LivroCadastro = new Livro(nome, quantidade, preco, autor, Emprestimo);
				livros.add(LivroCadastro);
				break;

				
			case 2:
				for(Livro liv:  livros){
					atendente.ListarLivros(getLivroCadastro());
				}
				break;
			case 3:
				atendente.ListarLivros(livros);

				String nomeParaRemover = atendente.RemoverLivro();
				boolean removido = false;

				for (int i = 0; i < livros.size(); i++) {
					if (livros.get(i).getNome().equalsIgnoreCase(nomeParaRemover)) {
						livros.remove(i);
						removido = true;
						System.out.println("Livro removido com sucesso.");
						break;
					}
				}
				if (!removido) {
					System.out.println("Livro não encontrado.");
				}
				break;

			default:
				System.out.println("Opção inválida.");
				break;
				
			case 4:
				String BuscaLivro= atendente.PesquisarLivros();
				boolean encontrado = false;
				for(Livro liv:  livros){
					if (liv.getNome().equalsIgnoreCase(BuscaLivro)) {
						atendente.ListarLivros(getLivroCadastro());
					}
				
				}
				break;
			
						case 5:
							String NomeEditar= atendente.EditarLivro();
							boolean Encontrado = false;
							
							for(Livro liv:  livros){
								if (liv.getNome().equalsIgnoreCase(NomeEditar)) {
			
									String Novoautor = atendente.CadastrarAutor();
									String Novonome = atendente.CadastrarTitulo();
									int Novoquantidade = atendente.CadastrarQuantidade();
									double Novopreco = atendente.CadastraPreço();	
									
								
									
									
									break;
								}
								
				}
				
						case 6:
							atendente.MostrarTotalDeLivros(getLivroCadastro());
		}
	}

	public List<Livro> getLivroCadastro() {
		return livros;
	}
	public void setLivroCadastro() {
		this.livros=livros;
	}
}
