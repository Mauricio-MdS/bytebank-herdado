
public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private AutenticacaoUtil autenticador;
	
	Administrador(){
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
