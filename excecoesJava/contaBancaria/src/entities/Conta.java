package entities;

import Excecoes.excecoesConta;

public class Conta {
	private String titular;
	private Integer num;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}
	
	public Conta(String titular, Integer num, Double saldo, Double limiteSaque) {
		this.titular = titular;
		this.num = num;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Double getSaldo() {
		return saldo;
	}
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double quantidade) {
		saldo += quantidade;
	}
	public void saque(Double quantidade) throws excecoesConta{ 
		if(saldo == 0) {
			throw new excecoesConta("Você não possui saldo!");
		}else if(quantidade > limiteSaque) {
			throw new excecoesConta("A quantidade de saque deve ser menor que o limite do seu saque!");
		}
		saldo -= quantidade;
	}
}
