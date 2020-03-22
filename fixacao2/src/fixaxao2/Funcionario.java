package fixaxao2;

public class Funcionario {
	
	private String Nome;
	private String Endereco;
	private int Telefone;
	private double Salario = 1045;
	private String Data_de_admissao = "Dia de hoje";
	private String Data_de_demissao;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public double getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	public double getSalario() {
		return Salario;
	}
	public void setSalario(double d) {
		Salario = d;
	}

	public String getData_de_admissao() {
		return Data_de_admissao;
	}
	public void setData_de_admissao(String data_de_admissao) {
		Data_de_admissao = data_de_admissao;
	}

	public String getData_de_demissao() {
		return Data_de_demissao;
	}
	protected void setData_de_demissao(String data_de_demissao) {
		Data_de_demissao = data_de_demissao;
	}

	//Todos os atributos são informados
	public Funcionario (String nome, String endereco, int telefone, double salario, String data_de_admissao) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
		Salario = salario;
		Data_de_admissao = data_de_admissao;		
	}
	
	//Sem salário
	public Funcionario (String nome, String endereco, int telefone, String data_de_admissao) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
		Data_de_admissao = data_de_admissao;		
	}
	
	//Sem data de admissão	
	public Funcionario (String nome, String endereco, int telefone, double salario) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
		Salario = salario;		
	}
	
	//Sem data de admissão e sem salário
	public Funcionario (String nome, String endereco, int telefone) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;	
	}
	
	public void demitirFuncionario(String data_de_demissao) {		
		
		setData_de_demissao(data_de_demissao);				
	}
	
	public void demitirFuncionario() {
				
		setData_de_demissao("Data de hoje");
	}

	public void promoverFuncionario(int percentualPromocao) {
		
		double valorPercentual = percentualPromocao/100;
		
		setSalario(Salario+(Salario*valorPercentual));
	}
	
	public void promoverFuncionario() {
		
		setSalario(Salario+(Salario*(0.03)));
	}
}
