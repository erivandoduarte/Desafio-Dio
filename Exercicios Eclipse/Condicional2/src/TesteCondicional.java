import java.util.Scanner;

public class TesteCondicional {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int horaInicial ;
		int horaFinal ;
		int fimDejogo;
		
		System.out.println("Digite A Hora Inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Digite A Hora Final: ");
		horaFinal = sc.nextInt();

		
		if (horaInicial < horaFinal) {
			
			fimDejogo =  horaFinal - horaInicial;
	
		}
		else {
			
			fimDejogo = 24 - horaInicial + horaFinal;
			
		}
		
		System.out.println("O jogo durou: " + fimDejogo + " :Horas");

		sc.close();	
	}
	
		

}
