package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ServicoDePagamento {

	private Juros juros;

	public ServicoDePagamento() {
	}

	public ServicoDePagamento(Juros juros) {
		this.juros = juros;
	}

	public void processaPagamentos(Contrato contrato, int mes) {
		double valorParcelaBase = contrato.getValorDoContrato() / mes;

		for (int i = 1; i <= mes; i++) {
			Date data = somaMes(contrato.getDataDoContrato(), i);
			double valorParcelaAtualizado = valorParcelaBase + juros.juros(valorParcelaBase, i);
			double valorParcelaTotal = valorParcelaAtualizado + juros.taxa(valorParcelaAtualizado);
			contrato.addParcelas(new Parcelas(data, valorParcelaTotal));
		}
	}

	private Date somaMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
