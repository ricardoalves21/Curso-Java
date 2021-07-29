package com.application;

import entities.Contrato;
import entities.Prestacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println();
        System.out.println("Entre com os dados do contrato");

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        Date dataContrato = sdf.parse(sc.nextLine());

        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        double qtdParcelas = sc.nextDouble();

        Contrato cont = new Contrato(numero, dataContrato, valorContrato, new Prestacao(qtdParcelas));
        Prestacao prest = new Prestacao(dataContrato, qtdParcelas);
        prest.calcularParcela(valorContrato, qtdParcelas);
        prest.vencParcelas(dataContrato, qtdParcelas);

        System.out.println();
        System.out.println("PARCELAS:");
        System.out.print(prest.parcelamento());

        sc.close();
    }
}
