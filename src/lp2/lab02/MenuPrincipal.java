package lp2.lab02;

import java.util.Scanner;

public class MenuPrincipal {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void novoCadastro(){
		System.out.println("Deseja adicionar mais algum produto?\n1 - Sim\n2 - Não");
		int novaEntrada;
		novaEntrada = sc.nextInt();
		while (novaEntrada != 2){
			LojaoP2.cadastroProdutos();
			System.out.println("Deseja adicionar mais algum produto?\n1 - Sim\n2 - Não");
			novaEntrada = sc.nextInt();
		}
	}
	
	public static void main(String[] args){
		
		int entrada;
		double novoPreco;
		
		System.out.println("Bem vindo ao Lojão LP2!");
		System.out.println("Menu Inicial: Digite uma das opções abaixo:\n");
		
		System.out.println("1 - Realizar compra.");
		System.out.println("2 - Mudar preço base de produtos.");
		System.out.println("4 - Remover Produto");
		System.out.println("3 - Sair.\n");
		
		System.out.print("Opção: ");
		entrada = sc.nextInt();
		
		while(entrada != 3){
			if(entrada == 1){
				LojaoP2.cadastroProdutos(); // estamos chamando o metodo de cadastro da classe LojaoP2
				novoCadastro();
				break;
			}
			else if(entrada == 2){
				System.out.print("Entre com o novo valor do Preço: ");
				novoPreco = sc.nextDouble();
				LojaoP2.preco = novoPreco; // declarei a variavel preco como atributo da classe LojaoP2 e entao modifiquei
				// atribuindo o novoPreco que quis nessa classe de MenuPrincipal. obs.: recomendado fazer atraves de metodo setPreco.
				LojaoP2.cadastroProdutos();
				novoCadastro();
				break;
			}else if(entrada == 4){
				
			}
			else{
				System.out.println("Você não digitou uma opção válida!");
				System.out.print("Redigite sua opção: ");
				entrada = sc.nextInt();
			}		
		}
		System.out.println("Fim de execução!");
	}
}