package sistemaBancario;

import java.util.Scanner;

public class menuPrincipal{
	

	public static void main(String[] args) throws InterruptedException {
		
		utilitarios funcoesUteis = new utilitarios();
		menuDeOpcoes menuOpcoes = new menuDeOpcoes();
		Scanner leitor = new Scanner(System.in);
		
		long tempoDoDelayPadrao = 1000;
		
		int numeroDaOpcao = 0;
		int armazenarNumeroDigitado;
		
		double saldoTotal = 10;
		
		chamarMenuInicial(tempoDoDelayPadrao);
		
		chamarRedirecionamento(tempoDoDelayPadrao);
		
		do {

			menuOpcoes.armazenaValoresVariaveis(saldoTotal);
			menuOpcoes.mostrarMenuDeOpcoes();
			
			System.out.print("Digite o numero da opção desejada: ");
			armazenarNumeroDigitado = leitor.nextInt();	
			
			numeroDaOpcao = menuOpcoes.verificaOpcaoDigitada(armazenarNumeroDigitado);
			System.out.println(numeroDaOpcao);
			
			
		}while(numeroDaOpcao != 6);
		
		utilitarios.sairDoSistema();
		
	}
	
		public static void chamarMenuInicial(long tempoDoDelayPadrao) throws InterruptedException {
			
			utilitarios funcoesUteis = new utilitarios();
		
			System.out.println("\n\n-----                  Olá...                    -----");
			System.out.println("-----     Seja Bem Vindo ao Ortega Bank!         -----\n\n");
			funcoesUteis.delayDaTela(tempoDoDelayPadrao);
			funcoesUteis.limpaTela();
		
		}
	
		public static void chamarRedirecionamento(long tempoDoDelayPadrao) throws InterruptedException {
			
			utilitarios funcoesUteis = new utilitarios();
		
			System.out.println("----- Você será redirecionado ao menu principal! -----\n\n");
			funcoesUteis.delayDaTela(tempoDoDelayPadrao);
			funcoesUteis.limpaTela();
		
		}
	
}