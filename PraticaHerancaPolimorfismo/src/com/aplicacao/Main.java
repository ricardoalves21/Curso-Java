package com.aplicacao;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US); // padrão americano
        Scanner sc = new Scanner(System.in); // para monitoramento de entradas pelo teclado
        List<Produto> list = new ArrayList<>(); // criando a lista de produtos
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.print("Entre com a quantidade de produtos: ");
        int n = sc.nextInt();
        System.out.println();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        for (int i=1; i<=n; i++) {

            System.out.println("Dados do produto #" + i);
            System.out.print("Nome: ");
            String nome = sc.next();
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.print("Produto comum, importado ou usado (c/i/u)? ");
            char ch = sc.next().charAt(0); // acrescenta-se o charAt(0) para resposta char de 1 caractere
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (ch == 'u') {
                System.out.print("Qual a data de validade (DD/MM/AAAA): ");
                Date data = sdf.parse(sc.next());
                list.add(new ProdutoUsado(nome, preco, data));
            } else if (ch == 'i') {
                System.out.print("Qual é a taxa de importação? ");
                Double taxa = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxa));
            } else {
                list.add(new Produto(nome, preco)); // adicionando a classe Produto e seus atributos dentro da lista
            }
        }

        System.out.println();
        System.out.println("LISTA DE PRODUTOS");
        for (Produto prod : list) { // fazendo um for para varrer a lista e apresenta-la ao usuário
            System.out.println(prod.etiquetaPreco());
        }


    }
}
