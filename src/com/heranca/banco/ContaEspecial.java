package com.heranca.banco;

public class ContaEspecial extends ContaInvestimento {

	private double tarifaMensal;
	private double limiteChequeEspecial;

	public double getTarifaMensal() {
		return tarifaMensal;
	}

	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public double getSaldoDisponivel() {
		return getSaldo() + getLimiteChequeEspecial();
	}
	
	public void imprimirDemonstrativo() {
		System.out.println();
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", getTitular().getNome());
		System.out.printf("Saldo: %.2f%n", getSaldo());
		System.out.printf("Saldo disponivel: %.2f%n", getSaldoDisponivel());
	}

	public void debitarTarifaMensal() {
		sacar(getTarifaMensal());
	}

}
