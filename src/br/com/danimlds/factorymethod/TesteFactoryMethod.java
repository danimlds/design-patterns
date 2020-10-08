package br.com.danimlds.factorymethod;

public class TesteFactoryMethod {

	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("Emissor SMS");
		
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia("Emissor Email");
		
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("Emissor JMS");
	}
}
