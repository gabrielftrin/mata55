package principal;

public class Livro {
	
	private String Titulo;
	private String Categoria;
	private double Preco;
	private String Autor;
	private String Editora;
	
	
	public Livro (String titulo) {
		setTitulo(titulo);		
	}
	
	public String getTitulo ()	{
		return Titulo;
	}
	
	public void setTitulo (String titulo)	{
		Titulo = titulo;
	}
}
