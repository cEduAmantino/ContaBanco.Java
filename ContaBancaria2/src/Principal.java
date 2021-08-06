
public class Principal {
	public static void main(String[] args) {
	
//---Comandos---		
//abrirConta
//fecharConta
//depositar
//sacar
//pagarMensalidade
		
		ContaBanco Pessoa1 = new ContaBanco();
		Pessoa1.setDono("Alvaro");
		Pessoa1.setNumConta(222);
		Pessoa1.abrirConta("CC");
		Pessoa1.depositar(100);
		Pessoa1.sacar(120);
		Pessoa1.pagarMensalidade();
			
		Pessoa1.estadoAtual();
		
	}
}
