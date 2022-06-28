package sistemaBancario;

import java.util.Scanner;

public class menuPrincipal{
	

	public static void main(String[] args) throws InterruptedException {
		
		utilitarios funcoesUteis = new utilitarios();
		long tempoDoDelayPadrao = 8000;
		
		chamarMenuInicial(tempoDoDelayPadrao);
		
		chamarRedirecionamento(tempoDoDelayPadrao);
		
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