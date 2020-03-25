package src;

import java.util.Calendar;

public class Livro {

	private String titulo;
	private int isbn;
	private String materia;
	private int edicao;
	private int ano;
	private int anoPublicacao = Calendar.getInstance().get(Calendar.YEAR) - 1; //Last year

	public Livro(String titulo, int isbn, String materia, int edicao, int ano, int anoPublicacao) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.materia = materia;
		this.edicao = edicao;
		this.ano = ano;
		this.anoPublicacao = anoPublicacao;
	}
	
	public Livro(String titulo, int isbn, String materia, int edicao, int ano) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.materia = materia;
		this.edicao = edicao;
		this.ano = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	@Override
	public String toString() {
		
		return (
			"Título: " + getTitulo() + "\n" +
			"ISBN: " + getIsbn() + "\n" +
			"Matéria: " + getMateria() + "\n" +
			"Edição: " + getEdicao() + "\n" +
			"Ano: " + getAno() + "\n" +
			"Ano de publicação: " + getAnoPublicacao()			
				);
	}

	public String consultarLivro(String titulo) {
		
		if (this.titulo.equals(titulo)) {
			return toString();
		}
		
		return null;
	}
	
	public String consultarLivro(int isbn) {
		
		if (this.isbn == isbn) {
			return toString();
		}
				
		return null;
	}
	
}
