package sistemaBancario;

public class utilitarios {

	public static void delayDaTela(Long tempoDeDelay) throws InterruptedException {
		
		String stringTotalDeSegundos = tempoDeDelay.toString().substring(0,1);
		int totalDeSegundos = Integer.parseInt(stringTotalDeSegundos);
		
		do{
			System.out.println("Mudara de tela em " + totalDeSegundos + " segundos");
			totalDeSegundos--;
			Thread.sleep(1000);
		}while(totalDeSegundos != 0);
		
	}
	
	
	public static void delayDaTelaSemTexto(Long tempoDeDelay) throws InterruptedException {
		
			Thread.sleep(tempoDeDelay);
		
	}

	
	public static void limpaTela() {
		for(int i = 0; i < 100; i++)
		{
		       System.out.println("");
		}
	}
	
	
	public static void sairDoSistema() throws InterruptedException{
		
		long temposDeDelay = 8000;
		
		delayDaTelaSemTexto(temposDeDelay);
		limpaTela();
		
		System.out.println("-----   Sistema Bancario Encerrado, Obrigado!   -----");
		
		delayDaTelaSemTexto(temposDeDelay);
		limpaTela();
		
	}
	

}
