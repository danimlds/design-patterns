package br.com.danimlds.factorymethod;

public class EmissorJMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Mensagem enviada por JMS: ");
		System.out.println(mensagem);
	}
}
