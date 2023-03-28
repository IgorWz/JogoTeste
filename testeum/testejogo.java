package Jogo;

import java.util.Scanner;

public class testejogo {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int resposta = 0;
			int pontuacao = 0;
			
		    System.out.println("\n=== Saga Generator - Em busca do FullStack em Java ===");
		    System.out.println("--------------------------------------------------------");		
	        System.out.println("1. Iniciar jogo");
	        System.out.println("2. Sair");
	        System.out.print("Escolha uma opção (1-2): ");
	        
	        int opcao = leia.nextInt();
	        leia.nextLine(); 
			
	        if (opcao == 1) {
	           
	        	System.out.println("-----------------------------------------------------");	 	
	            System.out.print("Digite o nome do seu personagem: ");
	            String nome = leia.nextLine();
	            System.out.println("Bem-vinde, " + nome+ "!");
	            System.out.println();
	        				}
	        else {
	        	System.out.println("Vejo você mais tarde !");
	        }
	        
			while(resposta!=1) {
				System.out.println("----------------------FASE--1------------------------");
	            System.out.println("\nQual dos comandos abaixo representa corretamente a"
	            		+ " linha de código que faz a leitura dos dados digitados por um usuário?");
	            System.out.println("																	");
	            System.out.println("\t1) "+"Scanner leia = new Scanner(System.in);");
	            System.out.println("\t2) "+"leia = scanner new scanner(system.in)");
	            System.out.println("\t3) "+"scanner leia = new scanner(system.in):");
	            
	            System.out.println("\nDigite o número correspondente à reposta certa: ");
	            resposta = leia.nextInt();
	            
	            
	            if(resposta == 1) {
	            	pontuacao+=10;
	            	System.out.println("\nResposta certa! Sua pontuação é de "+pontuacao+"+ pontos. ");	
	            	
	            } else if(resposta==2 || resposta==3){
	            	System.out.println("\nLamento, não era a resposta certa. ");
	            }}
	        	
	 
			opcao=0;
					
		
			while(resposta!=1) {
	            System.out.println("\nQual dos comandos abaixo representa corretamente a"
	            		+ " linha de código que faz a leitura dos dados digitados por um usuário?");
	            System.out.println("\t1) "+"Scanner leia = new Scanner(System.in);");
	            System.out.println("\t2) "+"leia = scanner new scanner(system.in)");
	            System.out.println("\t3) "+"scanner leia = new scanner(system.in):");
	            
	           
	            System.out.println("\nDigite o número correspondente à reposta certa: ");
	            resposta = leia.nextInt();
	            
	            
	            if(resposta ==1) {
	            	pontuacao+=10;
	            	System.out.println("\nResposta certa! Você tem "+pontuacao+" pontos. ");	
	            	
	            } else if(resposta==2 || resposta==3){
	            	System.out.println("\nLamento, não era a resposta certa. ");
	            }}
			
			opcao=0;
	        
	        
	        
	        
	        
	        
												}
						}

