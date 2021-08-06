
public class Principal {
	public static void main(String[] args) {
		ContaBanco Pessoa1 = new ContaBanco();
		Pessoa1.setDono("Alvaro");
		Pessoa1.setNumConta(222);
		Pessoa1.abrirConta("CC");
			
		Pessoa1.estadoAtual();
		
	}
}
