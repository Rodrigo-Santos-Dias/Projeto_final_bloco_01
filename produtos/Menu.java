package produtos;
import java.util.Scanner;



import java.io.IOException;
import java.util.InputMismatchException;
public class Menu {

	public static void main(String[] args) {
		 long idProduto,idCliente;
		 String nomeProduto, categoriaProduto, descriProduto,nomeCliente,emailcliente ;
		 int opcaoTodes;
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 exibirMenuTodes();
			 
			try {
				opcaoTodes = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcaoTodes=0;
			}
			if (opcaoTodes == 3) {
				System.out.println( "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				sc.close();
				System.exit(0);
				
			}
			
			switch(opcaoTodes) {
			case 1:
				exibirMenuVendedor();
				break;
				
			case 2:
				exibirMenuCliente();
				break;
			}
		 
		 }
		 
	}

	
	
	
	public static void exibirMenuVendedor() {

		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                MERCADO DA ECONOMIA                  ");
		System.out.println("                   MENU VENDEDOR                     ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Cadastrar Produto                    ");
		System.out.println("            2 - Listar Produto                       ");
		System.out.println("            3 - Buscar Produto por ID                ");
		System.out.println("            4 - Atualizar Etoque                     ");
		System.out.println("            5 - Deletar produto                      ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
   }
	
	
	public static void exibirMenuTodes() {

		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                MERCADO DA ECONOMIA                  ");
		System.out.println("                   MENU VENDEDOR                     ");
		System.out.println("                   VOCÊ É UM:                        ");
		System.out.println("            [1]- VENDEDOR [2]-CLIENTE                ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção correspondente:                     ");
		System.out.println("                                                     ");
   }
	
	 public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: ");
			System.out.println("Generation Brasil - generation@generation.org");
			System.out.println("github.com/conteudoGeneration");
			System.out.println("*********************************************************");
		  }

	   public static void keyPress() {

			try {

				System.out.println("\n\nPressione Enter para Continuar...");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");

			}
		}
	    
		public static void exibirMenuCliente() {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                MERCADO DA ECONOMIA                  ");
			System.out.println("                   MENU VENDEDOR                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Pesqusar produto                   	 ");
			System.out.println("            2 - Adicionar ao carrinho                ");
			System.out.println("            3 - Fazer cadastro	                     ");
			System.out.println("            4 - Listar produtos                      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
	   }
	   
}
