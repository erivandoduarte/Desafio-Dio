import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Numero: ");
		
		int N = sc.nextInt();
		
		if (N % 2 == 0 ) {
			
			System.out.println("Numero Par");
		
		}else {
			
			System.out.println("Numero Impar");
		}
		
		
	}

}
