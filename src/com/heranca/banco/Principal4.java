package com.heranca.banco;

public class Principal4 {

	public static void main(String[] args) {
		Titular titular = new Titular("João da Silva", "12312312300");
//        Conta conta1 = new Conta(titular, 1234, 999999);
//        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234, 999999);
		ContaEspecial conta1 = new ContaEspecial(titular, 1234, 999999, 90);

		System.out.println("Sua conta: " + conta1);
	}

}
