import java.util.Date;
/*
  
 *  Criar uma classe em que cada objeto representa um voo que acontece em determinada data e em
determinado horário. Cada voo possui no máximo 100 passageiros, e a classe permite controlar a
ocupação das vagas. A classe deve ter os seguintes métodos:

 * 
Método para configurar os dados do voo (recebidos como parâmetro): número do voo, data (para
armazenar a data utilize um objeto da classe Data, criada na questão anterior);

b) Método para obter o próximo voo livre retornando o número da próxima cadeira livre;
c) Método para verificar se o número da cadeira recebido como parâmetro está ocupada;
d) Método para determinar a cadeira do voo ocupada, cujo número é recebido como parâmetro, e
retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso
contrário;
e) Método para retornar o número de cadeiras vagas disponíveis (não ocupadas) no voo;
f) Método para retornar o número do voo;
g) Método para retornar a data do voo.
 * 
 * */
public class Voo {

	private int numeroVoo;
	private int quantidadePassageiros = 0;
	private int hora;
	private Date data;
	
	public Voo () {				
	}
	
	//letra a
	public void configurarDadosDoVoo(int numero, Date d) {
		numeroVoo = numero;
		data = d;
	}
	
	//letra b
	public int proximoVoo() {
		return quantidadePassageiros+1;
	}
	
	//letra c
	public boolean verificaCadeiraOcupada(int numero) {		
		if quantidadePassageiros < numero {
			return false;}		
		return true;				
	}

	//letra d
	public boolean ocuparCadeira (int numCadeira) {
				
	}
	
	//letra e
	
}
