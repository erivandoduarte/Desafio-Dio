import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um Numero: ");

		x = sc.nextInt();

		if (x < 0) {

			System.out.println(" Numero negativo ");
		}
		
		else{
			System.out.println(" Numero não é negativo ");
		}
	}

}
