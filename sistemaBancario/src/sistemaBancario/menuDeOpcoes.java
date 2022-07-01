package sistemaBancario;

import java.util.Scanner;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

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
	
	public double sacarDinheiro(double valorEmConta) {
		
		System.out.print("Digite o valor que deseja sacar: R$");
		valorTotalNaConta = leitor.nextInt();	
		
		double novoSaldo = valorEmConta - valorTotalNaConta;
		
		if(novoSaldo < 0) {
			
			System.out.println("Valor para Saque invalido(Sua conta ficará negativa!)");
			return valorEmConta;
			
		}else {
			
			System.out.println("Saque realizado com sucesso, o novo valor da sua conta é R$" + novoSaldo);
			return novoSaldo;
			
		}
		
	}
	
	public double depositarDinheiro(double valorDepositado) {
		
		return valorDepositado;
		
	}
	
	public void solicitarEmprestimo() {
		
		
		
	}
	
	public void sairDaConta() throws InterruptedException {
		
			System.out.println("-----          Saindo do sistema...          -----");
			funcoesUteis.delayDaTela(tempoDeDelayPadrao);
	}
	
	public int verificaOpcaoDigitada(int numeroDigitado) throws InterruptedException {
		
		if(numeroDigitado == 1) { // Saldo
			
			return verificarSaldo(valorTotalNaConta);
			
		}else if(numeroDigitado == 2){ //Extrato
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 3){ //Saque
			
			//Não da para retornar pois é do tipo Double(Tratará moedas)
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 4){ //Depósitos
			
			//Não da para retornar pois é do tipo Double(Tratará moedas)
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 5){ //Empréstimos
			
			return numeroDigitado;
			
		}else if(numeroDigitado == 6){ //Sair
			
			sairDaConta();
			return numeroDigitado;
			
		}else {
			
			return 0;
			
		}
	}

	private void ToIntFunction(double sacarDinheiro) {
		// TODO Auto-generated method stub
		
	}
	
}
