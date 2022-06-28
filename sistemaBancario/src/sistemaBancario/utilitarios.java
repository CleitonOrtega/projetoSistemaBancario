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
	
	public static void limpaTela() {
		for(int i = 0; i < 100; i++)
		{
		       System.out.println("");
		}
	}
	
	
	
	

}
