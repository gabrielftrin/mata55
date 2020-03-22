package fixaxao2;

public class Programa {
	
	public static void main (String arg []){
		
		Funcionario bruno = new Funcionario("Bruno", "Rua dos bobos, num 0", 99887766, "12/03/2020");
		
		System.out.println(
				bruno.getSalario()+" "+
				bruno.getData_de_admissao()+" "+
				bruno.getData_de_demissao()				
				);	
		
		bruno.promoverFuncionario(10);
		
		System.out.println(
				"\n"+
				bruno.getSalario()+" "+
				bruno.getData_de_admissao()+" "+
				bruno.getData_de_demissao()				
				);
		
	}
}
