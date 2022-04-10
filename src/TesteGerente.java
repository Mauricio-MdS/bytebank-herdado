
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente jackie = new Gerente();
		jackie.setCpf("2222222-22");
		jackie.setNome("Jackeline");
		jackie.setSalario(5000.0);
		
		System.out.println(jackie.getNome());
		System.out.println(jackie.getCpf());
		System.out.println(jackie.getSalario());
		
		jackie.setSenha(1234);
		System.out.println(jackie.autentica(1234));
		
		System.out.println(jackie.getBonificacao());
		

	}

}
