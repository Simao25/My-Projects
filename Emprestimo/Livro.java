package pl.sdomingos.POO.Emprestimo;

public class Livro {
	
    private String titulo;
    private  String autor;
    private int dataPublicacao;
    
    public Livro() {
    	
    }
	public Livro(String titulo, String autor, int dataPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(int dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	@Override
	public String toString() {
		return "==> titulo: " + titulo + "\n autor: " + autor + "\n dataPublicacao: " + dataPublicacao;
	}
    
    
    
	
}
