package produtos;

import java.util.Scanner;

import produtos.controller.ProdutoController;
import produtos.model.ProdutoImportado;
import produtos.model.ProdutoNacional;

import java.io.IOException;
import java.util.InputMismatchException;
import produtos.util.MostraMenu;

public class Menu {

    public static void main(String[] args) {
        int opcaoTodes, estoque;
        int opEscolha, opcaoVendedor;
        String nomeProduto, categoria, paisOrigem;
        double preco;
        long id;
        Scanner sc = new Scanner(System.in);
        ProdutoController produtos = new ProdutoController();

        while (true) {
            MostraMenu.exibirMenuTodes();

            try {
                opcaoTodes = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                sc.nextLine();
                opcaoTodes = 0;
            }

            if (opcaoTodes == 3) {
                System.out.println("\nMercado da E-conomia - Sua Compra Em um Click!");
                MostraMenu.sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcaoTodes) {
                case 1:
                    MostraMenu.exibirMenuVendedor();
                    try {
                        opcaoVendedor = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\nDigite valores inteiros!");
                        sc.nextLine();
                        opcaoVendedor = 0;
                    }
                    
                    if (opcaoVendedor == 7) {
                    	System.out.println("\n Mercado da E-CONOMIA - Sua Compra Em um Click!");
                        MostraMenu.sobre();
                        sc.close();
                        System.exit(0);
                    }

                    switch (opcaoVendedor) {
                        case 1:
                            sc.nextLine();  
                            System.out.println("\nProduto Nacional: ");
                            System.out.println("\nDigite Nome do Produto: ");
                            nomeProduto = sc.nextLine();

                            System.out.println("\nDigite a categoria do produto: ");
                            categoria = sc.nextLine();

                            System.out.println("\nDigite Preço do produto: ");
                            preco = sc.nextDouble();
                            estoque = 10;  
                            produtos.cadastrar(new ProdutoNacional(produtos.gerarId(), nomeProduto, categoria, preco, estoque, 35.00));
                            break;
                        case 2:
                            sc.nextLine();  
                            System.out.println("\nProduto Importado: ");
                            System.out.println("\nDigite Nome do Produto: ");
                            nomeProduto = sc.nextLine();

                            System.out.println("\nDigite a categoria do produto: ");
                            categoria = sc.nextLine();

                            System.out.println("\nDigite nome do pais de origem do produto: ");
                            paisOrigem = sc.nextLine();

                            System.out.println("\nDigite Preço do produto: ");
                            preco = sc.nextDouble();
                            estoque = 10;  
                            produtos.cadastrar(new ProdutoImportado(produtos.gerarId(), nomeProduto, categoria, preco, estoque, 35.00, paisOrigem));
                            break;
                        case 3:
                        	System.out.println("Listando todos os produtos: ");
                            produtos.listarTodos();
                            keyPress();
                            break;
                        case 4:
                            System.out.println("\nProcurar por Id: ");
                            System.out.println("\nDigite o Id do produto: ");
                            id = sc.nextLong();
                            produtos.procurarPorId(id);
                            keyPress();
                            break;
                        case 5:
                            System.out.println("Atualizar dados do Produto\n\n");
                            System.out.println("Digite o ID do produto: ");
                            id = sc.nextLong();
                            var produto = produtos.buscarNaColecao(id);
                            if (produto != null) {
                                sc.nextLine();  

                                System.out.println("Informe o novo nome do produto:");
                                nomeProduto = sc.nextLine();

                                System.out.println("Informe a nova categoria do produto:");
                                categoria = sc.nextLine();

                                System.out.println("Informe o novo preço do produto:");
                                preco = sc.nextDouble();

                                System.out.println("Informe a nova quantidade em estoque:");
                                estoque = sc.nextInt();

                                if (produto instanceof ProdutoNacional) {
                                    System.out.println("Informe o novo imposto nacional:");
                                    double impostoNacional = sc.nextDouble();
                                    produtos.atualizar(new ProdutoNacional(id, nomeProduto, categoria, preco, estoque, impostoNacional));
                                } else if (produto instanceof ProdutoImportado) {
                                    System.out.println("Informe a nova taxa de importação:");
                                    double taxaImportacao = sc.nextDouble();
                                    sc.nextLine();  
                                    System.out.println("Informe o novo país de origem:");
                                    paisOrigem = sc.nextLine();
                                    produtos.atualizar(new ProdutoImportado(id, nomeProduto, categoria, preco, estoque, taxaImportacao, paisOrigem));
                                }
                            } else {
                                System.out.println("Produto não encontrado!");
                            }
                            keyPress();
                            break;
                        case 6:
                            System.out.println("\nDeletar produto: ");
                            System.out.println("\nDigite o Id do produto para excluí-lo: ");
                            id = sc.nextLong();
                            produtos.deletar(id);
                            keyPress();
                            break;      
                        default:
                            System.out.println("\nOpção inválida, tente novamente!");
                            keyPress(); 
                    }
                    break;
                case 2:
                    MostraMenu.exibirMenuTemporario();
                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!");
                    keyPress();
            }
        }
    }

    public static void keyPress() {
        try {
            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}
 