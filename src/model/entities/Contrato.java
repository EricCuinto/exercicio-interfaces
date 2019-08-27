package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private int numeroDoContrato;
	private Date dataDoContrato;
	private Double valorDoContrato;

	private List<Parcelas> parcelas = new ArrayList<>();

	public Contrato() {
	}

	public Contrato(int numeroDoContrato, Date dataDoContrato, Double valorDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
		this.dataDoContrato = dataDoContrato;
		this.valorDoContrato = valorDoContrato;
	}

	public int getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(int numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public Double getValorDoContrato() {
		return valorDoContrato;
	}

	public void setValorDoContrato(Double valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	public void addParcelas(Parcelas parcela) {
		parcelas.add(parcela);
	}

	public void removeParcelas(Parcelas parcela) {
		parcelas.remove(parcela);
	}

}
