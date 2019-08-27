package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelas;
import model.service.Paypal;
import model.service.ServicoDePagamento;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do Contrato: ");
		System.out.print("Número do Contrato: ");
		int numeroContrato = sc.nextInt();
		sc.nextLine();
		System.out.print("Data do Contrato: ");
		Date dataDoContrato = sdf.parse(sc.nextLine());
		System.out.print("Valor do Contrato: ");
		double valorDoContrato = sc.nextDouble();

		Contrato contrato = new Contrato(numeroContrato, dataDoContrato, valorDoContrato);

		System.out.print("Número de Parcelas: ");
		int quantidadeParcelas = sc.nextInt();

		ServicoDePagamento sdp = new ServicoDePagamento(new Paypal());
		sdp.processaPagamentos(contrato, quantidadeParcelas);

		System.out.println("Dados das Parcelas: *****************************");
		for (Parcelas x : contrato.getParcelas()) {
			System.out.println(x);
		}
		sc.close();
	}

}
