package com.application;

import entities.Contrato;
import Service.Prestacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        List<Contrato> contrato = new ArrayList<>();
        List<Prestacao> prestacao = new ArrayList<>();

        System.out.println();
        System.out.println("ENTRE COM OS DADOS DO CONTRATO");

        System.out.print("# Número: ");
        int numero = sc.nextInt();

        System.out.print("# Data (dd/MM/yyyy): ");
        sc.nextLine();
        Date dataContrato = sdf.parse(sc.nextLine());

        System.out.print("# Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        System.out.print("# Quantidade de parcelas: ");
        double qtdParcelas = sc.nextDouble();

        Prestacao prest = new Prestacao();

        for (int numParc = 1; numParc <= qtdParcelas; numParc++) {
            contrato.add(new Contrato(numero, dataContrato, valorContrato));
            prest.calcularParcela(valorContrato, qtdParcelas, numParc);
            prestacao.add(new Prestacao());
        }

        System.out.println();
        System.out.println("PARCELAS:");
        for (Prestacao p : prestacao) {
            System.out.println(p);
        }
//        System.out.print(prest.parcelamento());

        sc.close();
    }
}
