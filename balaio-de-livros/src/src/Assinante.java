package src;

public class Assinante {

	private int cpf;
	private String nome;
	private String endereco;
	private int ddd = 71;
	private int telefone;

	public Assinante(int cpf, String nome, String endereco, int ddd, int telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	public Assinante(int cpf, String nome, String endereco, int telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	
	@Override
	public String toString() {
		
		return (
				"CPF: " + getCpf() + "\n" +
				"Nome: " + getNome() + "\n" +
				"Endereco: " + getEndereco() + "\n" +
				"DDD: " + getDdd() + "\n" +
				"Telefone=" + getTelefone()
				);
	}

	public String consultarAssinante(String nome) {
		
		if (this.nome.equals(nome)) {
			return toString();
		}
		
		return null;				
	}	

	public String consultarAssinante(int ddd, int telefone) {
		
		if (this.ddd == ddd && this.telefone == telefone) {
			return toString();
		}
		
		return null;		
	}
	
	public String consultarAssinante(int telefone) {
		
		if (this.telefone == telefone) {
			return toString();
		}
		
		return null;
	}
	
}
