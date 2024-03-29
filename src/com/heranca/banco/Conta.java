package com.heranca.banco;

import java.util.Objects;

public class Conta extends Object {

	private Titular titular;
	private int agencia;
	private int numero;
	private double saldo;

	public Conta(Titular titular, int agencia, int numero) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected void validarSaldoParaSaque(double valorSaque) {
		if (getSaldo() < valorSaque) {
			throw new RuntimeException("Saldo insuficiente para saque");
		}
	}

	public void sacar(double valorSaque) {
		if (valorSaque <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}

		validarSaldoParaSaque(valorSaque);

		saldo -= valorSaque;
	}

	public final void depositar(double valorDeposito) { // o metodo com o final nao poder sobrescrito
		if (valorDeposito <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
		}

		saldo += valorDeposito;
	}

	public void imprimirDemonstrativo() {
		System.out.println();
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", getTitular().getNome());
		System.out.printf("Saldo:  %.2f%n", getSaldo());
	}

	@Override
	public String toString() {
		return "Conta{" + "titular=" + titular + ", agencia=" + agencia + ", numero=" + numero + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass()) // se a classe desse objeto (Conta) se é do mesmo tipo (obj)
			return false;

		Conta conta = (Conta) obj;
		if (this.agencia != conta.agencia) // se a gencia for diferente da agencia da Conta, retorna false
			return false;
		if (this.numero != conta.numero) // se o numero for diferente, retorna false
			return false;

		return true; // caso contrario retorna true
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }


}
