
public class TestaSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		SistemaInterno si = new SistemaInterno();
		
		gerente.setSenha(2222);
		si.autentica(gerente);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(1111);
		si.autentica(administrador);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		si.autentica(cliente);
		
		
		

	}

}
