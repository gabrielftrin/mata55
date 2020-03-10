import java.util.Date;
/*  
Criar uma classe em que cada objeto representa um voo que acontece em determinada data e em
determinado hor�rio. Cada voo possui no m�ximo 100 passageiros, e a classe permite controlar a
ocupa��o das vagas. A classe deve ter os seguintes m�todos:
 */
public class Voo {

	private int numeroVoo;
	private int quantidadePassageiros = 0;
	private int hora;
	private Date data;
	
	//Construtor
	public Voo () {				
	}
	
	//M�todo para configurar os dados do voo (recebidos como par�metro): n�mero do voo, data (para
	//armazenar a data utilize um objeto da classe Data, criada na quest�o anterior);
	public void configurarDadosDoVoo(int numero, Date d) {
		numeroVoo = numero;
		data = d;
	}
	
	//M�todo para obter o pr�ximo voo livre retornando o n�mero da pr�xima cadeira livre;
	public int proximoVoo() {
		return quantidadePassageiros+1;
	}
	
	//M�todo para verificar se o n�mero da cadeira recebido como par�metro est� ocupada;
	public boolean verificaCadeiraOcupada(int numero) {		
		if quantidadePassageiros < numero {
			return false;}		
		return true;				
	}

	//M�todo para determinar a cadeira do voo ocupada, cujo n�mero � recebido como par�metro, e
	//retorna verdadeiro se a cadeira ainda n�o estiver ocupada (opera��o foi bem sucedida) e falso caso
	//contr�rio;
	public boolean ocuparCadeira (int numCadeira) {
				
	}
	
	//M�todo para retornar o n�mero de cadeiras vagas dispon�veis (n�o ocupadas) no voo;
	
	//M�todo para retornar o n�mero do voo;
	
	//M�todo para retornar a data do voo.
}
