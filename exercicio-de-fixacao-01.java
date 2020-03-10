import java.util.Date;

/*
 * Criar uma classe para representar um Jogador de Futebol, com os atributos nome, posição, 
 * data de nascimento, nacionalidade, altura e peso. A classe deve atender aos seguintes itens:

a) Imprimir todos os dados do jogador;
b) Calcular a idade do jogador;
c) Mostrar quanto tempo falta para o jogador se aposentar.

Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos,
os jogadores de meio-campo aos 38 e os atacantes aos 35.
 */

public class JogadorDeFutebol {

    private String nome;
    private String posicao;
    private Date dataDeNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public JogadorDeFutebol () {

    }

    public void imprimirDadosDoJogador() {
        System.out.println(this.nome);
        System.out.println(this.posicao);
        System.out.println(this.dataDeNascimento);
        System.out.println(this.nacionalidade);
        System.out.println(this.altura);
        System.out.println(this.peso);
    }

    public int tempoParaSeAposentar() {

        Date dataAtual = new Date();
        int idade = dataAtual - this.dataDeNascimento;			
        
        switch(this.posicao) {
            case "defesa":
            if (idade > 40) 
                return 0; 
            else
                return idade - 40;
            case "meio-campo":
            if (idade > 38)
                return 0;
            else
                return idade - 38;
            case "atacante":
            if (idade > 35)
                return 0;
            else
                return idade - 35;
            default:
            return 0;
        }
    }

}