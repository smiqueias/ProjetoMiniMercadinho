package MiniProjetoMercadinho;

import java.util.Scanner;


public class Mercadinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] produtos = new String[3];
        Float[] precos = new Float[3];
        int qtdProdutos = produtos.length;

        //adicionando os produtos e os preços
        for (int i = 0; i < produtos.length; i++) {
            try {
                System.out.print("Adicione " + qtdProdutos-- + " produtos no seu inventário! | ");
                String produtosAdd = scan.next();
                produtos[i] = produtosAdd;


                System.out.print("Indique o valor do produto " + " | ");
                float valorProdutos = scan.nextFloat();
                precos[i] = valorProdutos;


            } catch (Exception e) {
                System.out.println("USE VIRGULA INVÉS DE PONTO");
                System.out.println(e.getMessage());
                e.printStackTrace();

            }
        }

        System.out.println("Deseja realizar uma compra?");
        String resposta = scan.next();

        if (resposta.equals("SIM") || resposta.equals("Sim") || resposta.equals("sim")) {

            System.out.println("Produtos e Preços ");
            System.out.println("------------------");

            for (int i = 0; i < produtos.length; i++) {
                System.out.println("O produto " + produtos[i] + " tem o valor de R$ " + precos[i] + " reais.");

            }
            System.out.println("----------------------");


            for (int i = 0; i < produtos.length; i++) {
               
                System.out.println("Qual produto deseja comprar?");
                String produtoComprar = scan.next();

                buscaPosicaoProduto(produtoComprar,produtos);
                int posicaoProduto = buscaPosicaoProduto(produtoComprar,produtos);
               
                    System.out.println("Produto escolhido | " +produtos[posicaoProduto]);
                    System.out.println("Preço | " + precos[posicaoProduto]);
                    System.out.println("Insira o valor do pagamento");
                    float pagamentoCliente = scan.nextFloat();

                    Caixa caixa = new Caixa();
                    Pagar pagamento = new Pagar(pagamentoCliente, precos[posicaoProduto]);

                    pagamento.pagamento(caixa);


                }
            }


        }

    public static int buscaPosicaoProduto(String produtoParaPesquisar, String[] array) {
        int index = 0;
        for(int i=0;i<array.length;i++) {
             if(array[i].equals(produtoParaPesquisar)) {
                 index = i;

                 return i;
             }

         }
   return 0;
    }
    }




