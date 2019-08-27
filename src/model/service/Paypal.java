package model.service;

public class Paypal implements Juros {

	private static final double TAXA = 0.02;
	private static final double JUROS = 0.01;

	@Override
	public double taxa(double valor) {
		return valor * TAXA;
	}

	@Override
	public double juros(double valor, int mes) {
		return valor * JUROS * mes;
	}

}
