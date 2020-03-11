package principal;

import java.util.Calendar;

public class JogadorDeFutebol {

	private String nome;
	private String posicao;
	private Calendar dataDeNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;

	public JogadorDeFutebol() {

	}

	public void imprimirDadosDoJogador() {
		System.out.println(this.nome);
		System.out.println(this.posicao);
		System.out.println(this.dataDeNascimento);
		System.out.println(this.nacionalidade);
		System.out.println(this.altura);
		System.out.println(this.peso);
	}
	
	public int idade () {
		Calendar dataAtual = Calendar.getInstance();
		int idade = dataDeNascimento.get(Calendar.YEAR) - dataAtual.get(Calendar.YEAR);
		return idade;
	}

	public int tempoParaSeAposentar() {

		Calendar dataAtual = Calendar.getInstance();
		int idadeEmAnos = dataDeNascimento.get(Calendar.YEAR) - dataAtual.get(Calendar.YEAR);

		switch (this.posicao) {
		case "defesa":
			if (idadeEmAnos > 40)
				return 0;
			else
				return idadeEmAnos - 40;
		case "meio-campo":
			if (idadeEmAnos > 38)
				return 0;
			else
				return idadeEmAnos - 38;
		case "atacante":
			if (idadeEmAnos > 35)
				return 0;
			else
				return idadeEmAnos - 35;
		default:
			return 0;
		}
	}

}