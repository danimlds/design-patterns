package br.com.danimlds.factorymethod;

public class EmissorEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Mensagem enviada por email: ");
		System.out.println(mensagem);
	}
}
