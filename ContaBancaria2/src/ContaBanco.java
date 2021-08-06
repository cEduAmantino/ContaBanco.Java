
public class ContaBanco {
//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
//Método personalizado
	public void estadoAtual() {
		System.out.println("============================");
		System.out.println("Conta: "+ this.getNumConta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		
		if (this.getTipo() == "CC") {
			this.setSaldo(50);
			System.out.println();
			System.out.println("" + this.getTipo()+  " da(o) "+ this.getDono() + " aberta com sucesso e com saldo de: " + this.getSaldo() + " R$");
			System.out.println();
		}else if(this.getTipo() == "CP") {
			this.setSaldo(150);	
			System.out.println();
			System.out.println("" + this.getTipo()+  " da(o) "+ this.getDono() + " aberta com sucesso e com saldo de: " + this.getSaldo() + " R$");
			System.out.println();
		}else {
			System.out.println("Digite CC ou CP!!");
		}
	
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println(""+ this.getDono() + " zere o saldo primeiro, para fechamento da conta!!");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta com saldo negativo, quite a dívida primeiro!!");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!!");
		}		
		
	}
	public void depositar(double valorDep) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valorDep);
			System.out.println("Deposito realizado com sucesso na conta de: "+ this.getDono());
		}else {
			System.out.println("Abra uma conta primeiro!!");
		}
	}
	public void sacar(double valorSaq) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= valorSaq) {
				this.setSaldo(this.getSaldo() - valorSaq);
				System.out.println("Saque efetuado com sucesso na conta de: "+ this.getDono());
			}else {
				System.out.println(""+ this.getDono() + " sem saldo para saque");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada!!");
		}
	}
	public void pagarMensalidade() {
		int valorMensalidade = 0;
		if (this.getTipo() == "CC") {
			valorMensalidade = 12;
		}else if (this.getTipo() == "CP") {
			valorMensalidade = 20;
		} 
		if (this.getStatus()== true && (this.getSaldo() >= valorMensalidade) ) {
				this.setSaldo(this.getSaldo() - valorMensalidade);
				System.out.println("Mensalidade paga com sucesso de: "+ this.getDono());
				
			}else if (this.getStatus()== true && (this.getSaldo() < valorMensalidade) ) {
			System.out.println("Saldo insuficiente para pagar!!");
		}
	else {
		System.out.println("Impossivel pagar uma conta fechada!!");
	}		
	}
//Construtor
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
//Getters e Setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
}
