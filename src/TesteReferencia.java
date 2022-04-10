
public class TesteReferencia {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		Funcionario editor = new EditorVideo();
		Funcionario designer = new Designer();
		
		gerente.setSalario(5000.0);
		editor.setSalario(2500.0);
		designer.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		System.out.println("Registrado gerente. Soma: " + controle.getSoma());
		controle.registra(editor);
		System.out.println("Registrado editor. Soma: " + controle.getSoma());
		controle.registra(designer);
		System.out.println("Registrado designer. Soma: " + controle.getSoma());
	
		

	}

}
