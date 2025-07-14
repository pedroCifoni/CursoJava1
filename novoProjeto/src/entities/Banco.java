package entities;

public class Banco {
	private String name;
	private int numeroConta; 
	private int depositoInicial;
	
	public Banco(String name, int numeroConta, int depositoInicial) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
		this.depositoInicial = depositoInicial;
	}
	public Banco(String name, int numeroConta) {
	    this.name = name;
	    this.numeroConta = numeroConta;
	    this.depositoInicial = 0; 
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(int depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	public int depositoInicial() {
		int depositoInicial = 0;
		depositoInicial += getDepositoInicial();
		return depositoInicial;
		
	}
	
	public int  saqueConta(int taxaSaque) {
		this.depositoInicial -= taxaSaque + 5;
		return depositoInicial;
	}
	
	public void depositar(int valor) {
		this.depositoInicial += valor;
	}
	
}
