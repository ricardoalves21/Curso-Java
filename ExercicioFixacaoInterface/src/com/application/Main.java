package com.application;

import Service.ServicoContrato;
import Service.ServicoPaypal;
import entities.Contrato;
import entities.Mensalidade;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println();
        System.out.println("ENTRE COM OS DADOS DO CONTRATO");

        System.out.print("# Número: ");
        Integer numero = sc.nextInt();

        System.out.print("# Data (dd/MM/yyyy): ");
        Date dataContrato = sdf.parse(sc.next());

        System.out.print("# Valor do contrato: ");
        Double valorContrato = sc.nextDouble();

        Contrato contrato = new Contrato(numero, dataContrato, valorContrato);  // instanciando o contrato encaminhando os parametros digitados pelo usuário.

        System.out.print("# Quantidade de parcelas: ");
        int qtdParcelas = sc.nextInt();

        ServicoContrato servicoContrato =  new ServicoContrato(new ServicoPaypal());  // instanciando o serviço de contrato e injetando nele a dependência do serviço de paypal.
        servicoContrato.processarContrato(contrato, qtdParcelas);

        System.out.println();
        System.out.println("PARCELAS:");
        for (Mensalidade e : contrato.getMensalidade()) {
            System.out.println(e);
        }

        sc.close();
    }
}
