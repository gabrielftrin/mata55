import java.util.Date;
/*  
Criar uma classe em que cada objeto representa um voo que acontece em determinada data e em
determinado horário. Cada voo possui no máximo 100 passageiros, e a classe permite controlar a
ocupação das vagas. A classe deve ter os seguintes métodos:
 */
public class Voo {

	private int numeroVoo;
	private int quantidadePassageiros = 0;
	private int hora;
	private Date data;
	
	//Construtor
	public Voo () {				
	}
	
	//Método para configurar os dados do voo (recebidos como parâmetro): número do voo, data (para
	//armazenar a data utilize um objeto da classe Data, criada na questão anterior);
	public void configurarDadosDoVoo(int numero, Date d) {
		numeroVoo = numero;
		data = d;
	}
	
	//Método para obter o próximo voo livre retornando o número da próxima cadeira livre;
	public int proximoVoo() {
		return quantidadePassageiros+1;
	}
	
	//Método para verificar se o número da cadeira recebido como parâmetro está ocupada;
	public boolean verificaCadeiraOcupada(int numero) {		
		if quantidadePassageiros < numero {
			return false;}		
		return true;				
	}

	//Método para determinar a cadeira do voo ocupada, cujo número é recebido como parâmetro, e
	//retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso
	//contrário;
	public boolean ocuparCadeira (int numCadeira) {
				
	}
	
	//Método para retornar o número de cadeiras vagas disponíveis (não ocupadas) no voo;
	
	//Método para retornar o número do voo;
	
	//Método para retornar a data do voo.
}
