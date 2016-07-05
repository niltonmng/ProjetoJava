package lp2.lab02;

import java.util.*;

public class LojaoP2 {
	
	static double preco = 1.99;
	
	
	public static void cadastroProdutos(){ // este é o método da classe que chama o seu menu de cadastro.
		
		Scanner scan = new Scanner(System.in);
		int quantidadeProdutos;
		int totalProdutos = 0;
		double totalGasto, porcentagem;
		
		System.out.println("Bem vindo ao Lojão LP2!");
		System.out.print("Digite a quantidade de produtos diferentes que será comprada: ");
		quantidadeProdutos = scan.nextInt();
		System.out.println("-- Cadastro de Produtos --");
		
		String nomes[] = new String[quantidadeProdutos];// maneira mais simples de declarar e inicializar o array.
		int quantidades[] = new int[quantidadeProdutos];
		
		
		for(int i = 0; i < quantidadeProdutos; i++){
			String nome; // declaro essas variaveis aqui, pois somente estão sendo utilizadas dentro do scopo do for, simplificando meu código;
			int quantidade;
			System.out.print("Nome do Produto " + (i+1) + ": ");
			nome = scan.next();
			nomes[i] = nome; // maneira de guardar os valores no array.
			System.out.print("Quantidade de " + nome + ": ");
			quantidade = scan.nextInt();
			totalProdutos += quantidade;
			quantidades[i] = quantidade;
		}
		System.out.println("-- Cadastro Concluído --");
		System.out.println("A sua compra foi:");
		
		for (int j = 0; j < quantidadeProdutos; j++){
			porcentagem = (quantidades[j]*100.0) / totalProdutos; // para fazermos o calculo da porcentagem corretamente, fazemos normalmente como feito
			// ao lado, e em seguida na impressão, utilizamos a função Math.round(); para imprimirmos o que queremos corretamente, como feito abaixo.
			System.out.println(quantidades[j] + " " + nomes[j] +" ("+ Math.round(porcentagem) + "%)");
			porcentagem = 0;
		}
		
		System.out.println("Total de produtos: " + totalProdutos);
		totalGasto = preco * totalProdutos;
		System.out.println("Total gasto: R$ " + totalGasto);
		System.out.println("-- Fim da execução --");
	}
}
