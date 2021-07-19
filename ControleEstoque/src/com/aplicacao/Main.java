package com.aplicacao;

import entidades.Cliente;
import entidades.Fornecedor;
import entidades.Produto;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // ajustando o idioma do programa
        Scanner sc = new Scanner(System.in); // criando objeto pra monitorar entradas de dados

        // CRIANDO LISTAS
        ArrayList<Cliente>      cli = new ArrayList<Cliente>();
        ArrayList<Fornecedor>   forn = new ArrayList<Fornecedor>();
        ArrayList<Produto>      prod = new ArrayList<>();

        // CRIANDO OBJETOS
        Produto     produto = new Produto();
        Cliente     cliente = new Cliente();
        Fornecedor  fornecedor = new Fornecedor();

        // INICIO DO PROGRAMA
        char resp;
        do {

            System.out.println();
            System.out.println("///////////////////////////////////");
            System.out.println("//  [1] Lançamentos de Estoque   //");
            System.out.println("//  [2] Operações com cliente    //");
            System.out.println("//  [3] Operações com fornecedor //");
            System.out.println("///////////////////////////////////");
            System.out.println();
            System.out.print("QUAL OPERAÇÃO DESEJA REALIZAR? ");
            int op = sc.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    System.out.print("Descrição do produto: ");
                    produto.setDescricao(sc.next());

                    System.out.print("Preço: ");
                    produto.setPreco(sc.nextFloat());

                    System.out.print("Compra ou Venda (c/v)? ");
                    char cv = sc.next().charAt(0);

                    if (cv == 'c') {
                        System.out.print("Quantidade comprada: ");
                        produto.setCompra(sc.nextInt());
                        produto.comprar();
                    } else {
                        System.out.print("Quantidade vendida: ");
                        produto.setVenda(sc.nextInt());
                        produto.vender();
                    }

                    prod.add(new Produto(
                                    produto.getDescricao(),
                                    produto.getPreco(),
                                    produto.getEstoque(),
                                    produto.getCompra(),
                                    produto.getVenda()
                            )
                    );
                break;
                case 2:
                    System.out.print("Nome do cliente: ");
                    cliente.setNomeCliente(sc.next());

                    System.out.print("Quantidade comprada: ");
                    cliente.setCompraCliente(sc.nextInt());

                    cliente.saldoTotalCliente();

                    cli.add(new Cliente(
                                    cliente.getNomeCliente(),
                                    cliente.getCompraCliente(),
                                    cliente.getSaldoCliente()
                            )
                    );
                    break;
                case 3:
                    System.out.print("Nome do fornecedor: ");
                    fornecedor.setNomeFornecedor(sc.next());

                    System.out.print("Quantidade vendida: ");
                    fornecedor.setVendaFornecedor(sc.nextInt());

                    fornecedor.venderProduto();

                    forn.add(new Fornecedor(
                                    fornecedor.getNomeFornecedor(),
                                    fornecedor.getVendaFornecedor(),
                                    fornecedor.getSaldoFornecedor()
                            )
                    );
                    break;
            }

            System.out.print("Deseja fazer outra operação? ");
            resp = sc.next().charAt(0);

        } while (resp == 's');

        for (Produto e : prod) {
            System.out.println();
            System.out.println("XXXXXXXXXX CONTROLE DE ESTOQUE XXXXXXXXXX");
            System.out.println(e.dadosProduto());
        }

        for (Cliente e : cli) {
            System.out.println();
            System.out.println("XXXXXXXXXX CONTROLE DE ESTOQUE XXXXXXXXXX");
            System.out.println(e.dadosCliente());
        }

        for (Fornecedor e : forn) {
            System.out.println();
            System.out.println("XXXXXXXXXX CONTROLE DE ESTOQUE XXXXXXXXXX");
            System.out.println(e.dadosFornecedor());
        }

    }
}
