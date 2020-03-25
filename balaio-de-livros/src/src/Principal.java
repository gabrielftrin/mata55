package src;

public class Principal {
	public static void main(String[] args) {

		Livro liv = new Livro("intro",126436536, "programacao", 2, 5);		
		System.out.println(liv.consultarLivro(34));		
	
		Assinante as1 = new Assinante(34, "joao", "rua de casa", 44332);
		System.out.println(as1.consultarAssinante("jao"));
		
	}
}
