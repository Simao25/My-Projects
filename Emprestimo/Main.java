package pl.sdomingos.POO.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		 Livro livro1 = new Livro("Matematica","Domingos", 1995);
		 Livro livro2 = new Livro("Fisica","Tomas", 1995);
		 List<Livro> livros = new ArrayList<>();
		 livros.add(livro1);
		 livros.add(livro2);
		 biblioteca.addLivros(livros);
		 biblioteca.mostrarLivros();

	}

}
