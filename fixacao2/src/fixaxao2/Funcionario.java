package fixaxao2;

public class Funcionario {
	
	private String Nome;
	private String Endereco;
	private float Telefone;
	private float Salario = 1045;
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
	public void setTelefone(float telefone) {
		Telefone = telefone;
	}

	public double getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
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

	public Funcionario (String nome, String endereco, float telefone, float salario, String data_de_admissao) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
		Salario = salario;
		Data_de_admissao = data_de_admissao;		
	}
	
	public Funcionario (String nome, String endereco, float telefone, String data_de_admissao) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
		Data_de_admissao = data_de_admissao;		
	}
	
	public Funcionario (String nome, String endereco, float telefone, float salario) {
		
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
		Salario = salario;		
	}
	
	

}
