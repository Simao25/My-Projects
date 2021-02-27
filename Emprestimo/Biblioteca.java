package pl.sdomingos.POO.Emprestimo;

import pl.sdomingos.POO.Emprestimo.Livro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {	
	 
	private String endereco;
	private long contatoTel;
	private List<Livro> livros;
	//private List<Livro> livros = new ArrayList();---->segunda opcao usava-se sem o construtor Biblioteca
	
	public Biblioteca() {
		this.livros = new ArrayList<>();
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getContatoTel() {
		return contatoTel;
	}
	public void setContatoTel(long contatoTel) {
		this.contatoTel = contatoTel;
	}
	public List<Livro> getLivrros() {
		return livros;
	}
	public void setLivrros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void addLivro(Livro livro) {
		this.livros.add(livro);
		//System.out.println("Livro adicionado:" + this.getLivrros());
	}
	
	public void addLivros(List<Livro> livros) {
		this.livros.addAll(livros);
	}
	
	public void mostrarLivros() {
		System.out.println("==========LIVROS NO ESTOQUE===========");
		if(this.livros.size() ==0)
			System.out.println("Nao ha livros na biblioteca");
		for(Livro livro: livros) {
			System.out.println(livro );
		}
	}
}
