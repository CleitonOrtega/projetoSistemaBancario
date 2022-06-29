package sistemaBancario;

import java.util.Scanner;

public class menuDeOpcoes {
	
	utilitarios funcoesUteis = new utilitarios();
	Scanner leitor = new Scanner(System.in);
	
	long tempoDeDelayPadrao = 8000;
	
	double valorTotalNaConta;
	
	int armazenarNumeroDigitado;

	public void mostrarMenuDeOpcoes() {
		
		System.out.println("----- 1. Saldo                   4.Depósitos     -----");
		System.out.println("----- 2. Extrato                 5.Empréstimos   -----");
		System.out.println("----- 3. Saque                   6.Sair          -----\n\n");
		
	}
	
	public void armazenaValoresVariaveis(double variavelSaldo) {
		valorTotalNaConta = variavelSaldo;
	}
	
	public int proximaAcao() {
		
		System.out.println("\n\n\nQual ação deseja realizar agora(Digite o numero)");
		System.out.println("1 - Voltar para o menu");
		System.out.println("2 - Sair do sistema");
		System.out.print("Opção escolhida:");
		armazenarNumeroDigitado = leitor.nextInt();	
		
		if(armazenarNumeroDigitado == 1) {
			return 0;
		}else {
			return 6;
		}
		
	}
	
	public int verificarSaldo(double valorTotalDoSaldo) throws InterruptedException {
		
		System.out.println("O valor total em sua conta é: R$" + valorTotalDoSaldo);
		utilitarios.delayDaTelaSemTexto(tempoDeDelayPadrao);
		
		int valorDaProximaAcao = proximaAcao();
		System.out.println(valorDaProximaAcao);
		return valorDaProximaAcao;
	}
	
	public void verificarExtrato() {
		
	}
	
	public void sacarDinheiro() {
		
	}
	
	public void depositarDinheiro() {
		
	}
	
	public void solicitarEmprestimo() {
		
	}
	
	public void sairDaConta() throws InterruptedException {
		
			System.out.println("-----          Saindo do sistema...          -----");
			funcoesUteis.delayDaTela(tempoDeDelayPadrao);
	}
	
	public int verificaOpcaoDigitada(int numeroDigitado) throws InterruptedException {
		
		if(numeroDigitado == 1) {
			
			return verificarSaldo(valorTotalNaConta);
			
		}else if(numeroDigitado == 2){
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 3){
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 4){
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 5){
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 6){
			
			sairDaConta();
			return numeroDigitado;
			
		}else {
			
			return 0;
			
		}
	}
	
}
