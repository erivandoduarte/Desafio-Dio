import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] arghs) {
		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.println("Digite Um Numero : ");

		senha = sc.nextInt();

		while (senha != 2022) {

			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
	
		

}
