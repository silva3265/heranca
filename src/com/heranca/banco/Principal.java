package com.heranca.banco;

public class Principal {

	public static void main(String[] args) {
		Titular titular = new Titular("João da Silva", "12312312300");
		Conta conta1 = new Conta(titular, 1234, 999999);
		Conta conta2 = new Conta(titular, 1234, 999999);
		ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);

		//System.out.println(conta1 == conta2); // == ele compara o endereõ de memoria, apontando pro mesmo objeto
		System.out.println(conta1.equals(conta2)); //equals - vai comprar a igualdade do conteudo do objeto
		System.out.println(conta1.equals(contaEspecial));
		
		/* tem que sobrescrever o metodo equals na classe Conta */
	}

}
