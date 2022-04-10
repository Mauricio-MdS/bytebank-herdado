
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario mauricio = new Gerente();
		mauricio.setCpf("3333333333-33");
		mauricio.setNome("Mauricio");
		mauricio.setSalario(11000.0);
		
		System.out.println(mauricio.getNome());
		System.out.println(mauricio.getBonificacao());
		
	}

}
