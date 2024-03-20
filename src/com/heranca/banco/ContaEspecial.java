package com.heranca.banco;

public class ContaEspecial extends ContaInvestimento {

	private double tarifaMensal;
	private double limiteChequeEspecial;

	public ContaEspecial() {
		super(); // vai chamar o construtor da super classe, nao necessariamente declarar
	}

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

	@Override
	public void imprimirDemonstrativo() {
		super.imprimirDemonstrativo();
	}

	@Override
	protected void validarSaldoParaSaque(double valorSaque) {
		if (getSaldoDisponivel() < valorSaque) {
			throw new RuntimeException("Saldo insuficiente para saque");
		}
	}

	public void debitarTarifaMensal() {
		sacar(getTarifaMensal());
	}

}
